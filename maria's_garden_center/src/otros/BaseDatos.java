package otros;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;

import comparadores.ComparaTipo;
import complementos.Abono;
import complementos.Maceta;
import plantas.Arbol;
import plantas.Arbusto;
import start.App;

public class BaseDatos {
	final static String URL_BD = "jdbc:sqlite:./database.db";//
	
	/**
	 * Crea la Base de Datos y la tabla si no existen
	 */
	public static void creaBD() {
 
		String sql = "CREATE TABLE IF NOT EXISTS productos (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	elemento text NOT NULL, clase text NOT NULL);";
		
        try (Connection conn = DriverManager.getConnection(URL_BD)) {
            if (conn != null) {
                Log.escribeLog("Se crea la base de datos.");
            }
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
        	Log.escribeLog("ERROR SQL: "+e.getStackTrace().toString());
        }
    }
	
	/**
	 * Borra los datos de la BD
	 */
	public static void reiniciaBD() {
		String sql = "DROP TABLE productos;";
		
        try (Connection conn = DriverManager.getConnection(URL_BD)) {
            if (conn != null) {
                Log.escribeLog("Se crea la base de datos.");
            }
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
        	Log.escribeLog("ERROR SQL: "+e.getStackTrace().toString());
        }
        
        creaBD();
    }
	
	/**
	 * Método auxiliar para conectarnos a la BD
	 */
	private static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL_BD);
        } catch (SQLException e) {
        	Log.escribeLog("ERROR SQL: "+e.getStackTrace().toString());
        }
        return conn;
    }
	
	/**
	 * Inserta un elemento en la BD
	 */
	private static void insertaElemento(String elemento, String clase) {
		
        String sql = "INSERT INTO productos(elemento, clase) VALUES(?,?)";
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, elemento);
            pstmt.setString(2, clase);
            pstmt.executeUpdate();
        } catch (SQLException e) {
        	Log.escribeLog("ERROR SQL al insertar elemento: "+e.getStackTrace().toString());
        }
    }
	
	
	public static void restauraDatos(){
        String sql = "SELECT elemento, clase FROM productos";
        Gson gson = new Gson();
        List<Producto> lst = new ArrayList<>();
        
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                String clase = rs.getString("clase");
                String elementoJSON = rs.getString("elemento");

                switch(clase){
                case "Arbol":
                	Arbol arbol = gson.fromJson(elementoJSON, Arbol.class);                	
                	start.App.lstProductos.add(arbol);
                	System.out.println("Añadido: "+arbol.toString());
                	break;
                case "Arbusto":
                	Arbusto arbusto = gson.fromJson(elementoJSON, Arbusto.class);                	
                	start.App.lstProductos.add(arbusto);
                	System.out.println("Añadido: "+arbusto.toString());
                	break;
                case "Maceta":
                	Maceta maceta = gson.fromJson(elementoJSON, Maceta.class);                	
                	start.App.lstProductos.add(maceta);
                	System.out.println("Añadido: "+maceta.toString());
                	break;
                case "Abono":
                	Abono abono = gson.fromJson(elementoJSON, Abono.class);                	
                	start.App.lstProductos.add(abono);
                	System.out.println("Añadido: "+abono.toString());
                	break;
                }
            }
        } catch (SQLException e) {
        	Log.escribeLog("ERROR SQL al restaurar los datos: "+e.getStackTrace().toString());
        }
        Comparator<Producto> compTpCo = new ComparaTipo();
		Collections.sort(start.App.lstProductos, compTpCo);
        //lst.addAll(App.lstProductos);
        //Collections.copy(App.lstProductos, lst);
    }
	
	public static void imprimeDatos(){
        String sql = "SELECT elemento, clase FROM productos";
        
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                System.out.println(rs.getString("clase")+ " || "+rs.getString("elemento"));                 
            }
        } catch (SQLException e) {
        	Log.escribeLog("ERROR SQL al imprimir los datos: "+e.getStackTrace().toString());
        }
    }
	
	public static void guardaDatos(List<Producto> lstProductos) {
		Gson gson = new Gson();
		String prodJSON = "";
		String clase = "";
		
		for(Producto prod : lstProductos) {
			prodJSON = gson.toJson(prod);
			if(prod instanceof Arbol) clase="Arbol";
			else if(prod instanceof Arbusto) clase="Arbusto";
			else if(prod instanceof Abono) clase="Abono";
			else if(prod instanceof Maceta) clase="Maceta";
			insertaElemento(prodJSON, clase);
		}
	}
}
