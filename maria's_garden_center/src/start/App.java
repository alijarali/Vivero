package start;

public class App {

/**
 * El main nos mostrará el menú
 * @param args
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
			Opciones.aniadirElemento();;
			break;
		case 2:
			Opciones.borrarElemento();;
			break;
		case 3:
			Opciones.modificarElemento();

			break;
		case 4:
			Opciones.listar();
			break;
		}

	}

	private static void mostrarMenu() {
		System.out.println("\n MENU PRINCIPAL");
		System.out.println("===============");
		System.out.println("1. Añadir elemento");
		System.out.println("2. Borrar elemento");
		System.out.println("3. Modificar elemento");
		System.out.println("4. Listar");

	}

}