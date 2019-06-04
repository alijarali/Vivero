package otros;

import java.sql.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;

import comparadores.ComparaTipo;
import complementos.Abono;
import complementos.Maceta;
import plantas.Arbol;
import plantas.Arbusto;

/**
 * Contiene los métodos necesarios para tratar con la Base de Datos
 *  - Almacenar Datos
 *  - Restaurar Datos
 *  - Borrar Datos 
 *  
 * Los elementos de la lista se almacenan parseados en JSON en la Base de Datos 
 * (atributo elemento). Para restaurar los objetos usamos el atributo clase para
 * saber el tipo de objeto que es (Árbol, Arbusto, Abono o Maceta) y la cadena
 * JSON que hay en el atributo elemento. 
 *  
 * Se utilizan dos librerías externas:
 *  - JDBC SQLite: Para controlar la Base de Datos
 *  - GSON: Para pasar de Objeto a JSON y viceversa.
 */
public class BaseDatos {
	final static String URL_BD = "jdbc:sqlite:./database.db";//
	
	/**
	 * Crea la Base de Datos, que consta de una Tabla (productos) con tres atributos:
	 *  - id: El identificador del registro
	 *  - elemento: El elemento de la lista parseado en JSON
	 *  - clase: Indica la clase del elemento (si es Árbol, Arbusto, Abono o Maceta)
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
	
	
	/**
	 * Nos crea una lista idéntica a la que hay en la Base de Datos, 
	 * siempre que haya datos almacenados en la Base de Datos.
	 */
	public static void restauraDatos(){
        String sql = "SELECT elemento, clase FROM productos";
        Gson gson = new Gson();
        
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        	//Compruebo si la tabla tiene datos
        	if(rs.next()) {
        		
        		//Elimino los datos que pueda haber en lstProducto
        		start.App.lstProductos.clear();
        		
        		do {
        			String clase = rs.getString("clase");
	                String elementoJSON = rs.getString("elemento");
	
	                switch(clase){
	                case "Arbol":
	                	Arbol arbol = gson.fromJson(elementoJSON, Arbol.class);                	
	                	start.App.lstProductos.add(arbol);
	                	Log.escribeLog("Añadido: "+arbol.toString());
	                	break;
	                case "Arbusto":
	                	Arbusto arbusto = gson.fromJson(elementoJSON, Arbusto.class);                	
	                	start.App.lstProductos.add(arbusto);
	                	Log.escribeLog("Añadido: "+arbusto.toString());
	                	break;
	                case "Maceta":
	                	Maceta maceta = gson.fromJson(elementoJSON, Maceta.class);                	
	                	start.App.lstProductos.add(maceta);
	                	Log.escribeLog("Añadido: "+maceta.toString());
	                	break;
	                case "Abono":
	                	Abono abono = gson.fromJson(elementoJSON, Abono.class);                	
	                	start.App.lstProductos.add(abono);
	                	Log.escribeLog("Añadido: "+abono.toString());
	                	break;
	                }
        		}while (rs.next());
        		
	            System.out.println("\nSe han restaurado los datos");
        	}
        	else {
        		System.out.println("\nNo hay datos en la Basde de Datos");
        		Log.escribeLog("No hay datos en la Basde de Datos");
        	}
        } catch (SQLException e) {
        	Log.escribeLog("ERROR SQL al restaurar los datos: "+e.getStackTrace().toString());
        }
        
        //Dejo la lista ordenada
        Comparator<Producto> compTpCo = new ComparaTipo();
		Collections.sort(start.App.lstProductos, compTpCo);
    }
	
	
	/**
	 * Muestra por pantalla los datos de la Base de Datos tal cual están almacenados.
	 */
	public static void imprimeDatos(){
        String sql = "SELECT elemento, clase FROM productos";
        String respuesta = "\n";
        
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        	if(rs.next()) {
        		do {        			
        			respuesta = respuesta.concat(rs.getString("clase")+ " || "+rs.getString("elemento")+"\n");
        		}while (rs.next());
        	}else {
        		respuesta = respuesta.concat("No hay datos almacenados en la Base de Datos\n");
        	}
        } catch (SQLException e) {
        	Log.escribeLog("ERROR SQL al imprimir los datos: "+e.getStackTrace().toString());
        }
        
        System.out.println(respuesta);
    }
	
	
	/**
	 * Almacena en la Base de Datos los datos que haya en la lista. 
	 * Sobreescribe, es decir, se pierde la información previa. Comprueba 
	 * que la lista no esté vacía para no perder los datos almacenados.
	 * 
	 * @param lstProductos - La lista a almacenar en la Base de Datos
	 */
	public static void guardaDatos(List<Producto> lstProductos) {
		Gson gson = new Gson();
		String prodJSON = "";
		String clase = "";
		
		if(lstProductos.size() > 0) {
			
			reiniciaBD();
			for(Producto prod : lstProductos) {
				prodJSON = gson.toJson(prod);
				if(prod instanceof Arbol) clase="Arbol";
				else if(prod instanceof Arbusto) clase="Arbusto";
				else if(prod instanceof Abono) clase="Abono";
				else if(prod instanceof Maceta) clase="Maceta";
				insertaElemento(prodJSON, clase);
			}
			System.out.println("\nSe han guardado los datos.");
		}
		else {
			System.out.println("\nNo hay datos para guardar, la lista está vacía");
		}
	}
}
