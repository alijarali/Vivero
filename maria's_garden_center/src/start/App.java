package start;

import java.util.ArrayList;
import java.util.List;

import otros.Producto;
import otros.Utiles;

public class App {

	public static List<Producto> lstProductos = new ArrayList<>();

	/**
	 * El main nos mostrará el menú
	 * 
	 * @param args
	 * @author Alicia
	 * @version 1.1 - Corrijo la forma de imprimir el menu y 
	 * aniado una sentencia que avisa que se cierra el programa
	 * @version 1.2 - Usa la funcion compruebaOpcionIncorrecta para 
	 * comprobar si la opcion introducida por el usuario es correcta. 
	 * Pide que pulses enter cuando escoges listar.
	 * @version 1.3 - Se añaden las funciones de Log
	 */
	public static void main(String[] args) {
		
		Utiles.escribeLog("El usuario inicia el programa.");
		
		int opcion = 0;
		do {
			mostrarMenu();
			do {
			opcion = otros.Utiles.pideDatoEntero("Opción: ");
			ejecutarOpcion(opcion);
			}while(Utiles.compruebaOpcionIncorrecta(opcion, 0, 7));

		} while (opcion != 0);
		String respuesta = "";
		respuesta = respuesta.concat("\n- - - - - - - - - - - - ");
		respuesta = respuesta.concat("\nSe cierra el programa");
		respuesta = respuesta.concat("\n- - - - - - - - - - - - ");
		System.out.println(respuesta);
		
		Utiles.escribeLog("El usuario cierra el programa.");
	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			opciones.AniadirElemento.aniadirElemento();
			Utiles.enterParaContinuar();
			break;
		case 2:
			opciones.BorrarElemento.borrarElemento();
			Utiles.enterParaContinuar();
			break;
		case 3:
			opciones.ModificarElemento.modificarElemento();
			Utiles.enterParaContinuar();
			break;
		case 4:
			opciones.CargarLista.cargarLista();
			break;
		case 5:
			opciones.Listar.listar();
			Utiles.enterParaContinuar();
			break;
		case 6:
			Utiles.muestraLog();
			break;
		case 7:
			Utiles.borraLog();
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
		menu = menu.concat("5. Listar\n");
		menu = menu.concat("----------------------\n");
		menu = menu.concat("6. Ver Log\n");
		menu = menu.concat("7. Borrar Log\n");
		menu = menu.concat("0. Salir");
		
		System.out.println(menu);
	}

}