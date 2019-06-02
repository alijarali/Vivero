package opciones;

import otros.Utiles;

/**
 * Esta clase borra elementos de la lista. Si la lista est� vac�a nos ense�a y
 * mensaje y vuelve al men�u principal.Si no, nos ense�ar� un listado con sus
 * indices a partir de ah� elegimos cual eliminar
 * 
 * @author Alicia
 * @version 1.1 - Mejoro el men� para que no admita valores err�neos
 *
 */
public class BorrarElemento {


	public static void borrarElemento() {
		Integer tamLista = start.App.lstProductos.size();
		if (tamLista == 0) {
			System.out.println("\n\nLista vac�a.\nPuede a�adir productos mediante la opci�n 'A�adir elemento' o cargar el cat�logo con la opci�n 'Cargar lista' ");
		} else {

			Integer elemento = -1;
			boolean incorrectoNumero = true;
			while (incorrectoNumero) {

				System.out.println("");
				Listar.listar();
				elemento = Utiles.pideDatoEntero("�Qu� elemento desea borrar?:");
				incorrectoNumero = !(elemento > 0 && elemento <= tamLista);
				
				if (incorrectoNumero) {
					System.out.println("\n\nIntroduzca un n�mero perteneciente a la lista");
				}
			}
			
			boolean incorrectoSiNo = true;
			while (incorrectoSiNo) {
				
				String seguro = Utiles.pideDatoCadenaMinusculas("�Est� seguro? S/N ");
				switch (seguro.toLowerCase()) {
				case "s":
					start.App.lstProductos.remove((elemento - 1));
					System.out.println("Se ha borrado el producto de la lista. \n");
					incorrectoSiNo = false;
					break;

				case "n":
					System.out.println("Volver al men� principal");
					incorrectoSiNo = false;
					break;

				default:
					if (incorrectoSiNo) {
						String respuesta = "\n\n- - - - - - - - - - - - - - - - - - - - - \n";
						respuesta = respuesta.concat("El valor introducido no es correcto.\n");
						respuesta = respuesta.concat("Recuerde, escriba S o N\n");
						respuesta = respuesta.concat("- - - - - - - - - - - - - - - - - - - - - ");
						System.out.println(respuesta);
					}
				}
			}
		}
	}
}
