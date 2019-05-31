package start;

import java.util.ArrayList;
import java.util.List;

import otros.Producto;

public class App {

	public static List<Producto> lstProductos = new ArrayList<>();

	/**
	 * El main nos mostrará el menú
	 * 
	 * @param args
	 * @author Alicia
	 * @version 1.1 - Corrijo la forma de imprimir el menu y 
	 * aniado una sentencia que avisa que se cierra el programa
	 */
	public static void main(String[] args) {

		int opcion = 0;
		do {

			mostrarMenu();
			opcion = otros.Utiles.pideDatoEntero("Opción (0-salir): ");
			ejecutarOpcion(opcion);

		} while (opcion != 0);
		String respuesta = "";
		respuesta = respuesta.concat("\n- - - - - - - - - - - - ");
		respuesta = respuesta.concat("\nSe cierra el programa");
		respuesta = respuesta.concat("\n- - - - - - - - - - - - ");
		System.out.println(respuesta);
	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			opciones.AniadirElemento.aniadirElemento();
			break;
		case 2:
			opciones.BorrarElemento.borrarElemento();
			break;
		case 3:
			opciones.ModificarElemento.modificarElemento();

			break;
		case 4:
			opciones.CargarLista.cargarLista();
			break;
		case 5:
			opciones.Listar.listar();
			break;
		}
	}

	private static void mostrarMenu() {
		String menu = "";
		menu = menu.concat("\n***************************************\n");
		menu = menu.concat("* BIENVENIDOS A MARIA'S GARDEN CENTER *\n");
		menu = menu.concat("***************************************\n");
		menu = menu.concat("MENÚ PRINCIPAL\n");
		menu = menu.concat("===============\n");
		menu = menu.concat("1. Añadir elemento\n");
		menu = menu.concat("2. Borrar elemento\n");
		menu = menu.concat("3. Modificar elemento\n");
		menu = menu.concat("4. Cargar Lista\n");
		menu = menu.concat("5. Listar");
		
		System.out.println(menu);
	}

}