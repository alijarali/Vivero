package start;

import java.util.ArrayList;
import java.util.List;

import otros.Producto;

public class App {

	public static List<Producto> lstProductos=new ArrayList<>();

/**
 * El main nos mostrará el menú
 * @param args
 * @author Alicia
 */
	public static void main(String[] args) {


		int opcion = 0;
		do {

			mostrarMenu();
			opcion = otros.Utiles.pideDatoEntero("Opción (0-salir): ");
			ejecutarOpcion(opcion);

		} while (opcion != 0);



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
		System.out.println("***************************************");
		System.out.println("* BIENVENIDOS A MARIA'S GARDEN CENTER *");
		System.out.println("***************************************");
		System.out.println("MENU PRINCIPAL");
		System.out.println("===============");
		System.out.println("1. Añadir elemento");
		System.out.println("2. Borrar elemento");
		System.out.println("3. Modificar elemento");
		System.out.println("4. Cargar Lista");
		System.out.println("5. Listar");

	}

}