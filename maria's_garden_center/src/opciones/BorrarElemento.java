package opciones;

import otros.Log;
import otros.Utiles;

/**
 * Esta clase borra elementos de la lista. En el caso de que la lista esté vacía
 * nos lo comunica y vuelve al menú principal. Si no, nos enseñará la lista para 
 * que el usuario pueda escoger el elemento a borrar.
 */
public class BorrarElemento {


	public static void borrarElemento() {
		Integer tamLista = start.App.lstProductos.size();
		if (tamLista == 0) {
			System.out.println("\n\nLista vacía.\nPuede añadir productos mediante la opción 'Añadir elemento' o cargar el catálogo con la opción 'Cargar lista' ");
			Log.escribeLog("Borrar Elemento --> La lista está vacía");
		} else {

			Integer elemento = -1;
			do{

				Listar.listar();
				elemento = Utiles.pideDatoEntero("¿Qué elemento desea borrar?:");
			
			}while(Utiles.compruebaOpcionIncorrecta(elemento, 1, tamLista));
			
			boolean incorrectoSiNo = true;
			while (incorrectoSiNo) {
				String copia = start.App.lstProductos.get((elemento - 1)).toString();
				
				String seguro = Utiles.pideDatoCadena("¿Está seguro? S/N ");
				switch (seguro.toLowerCase()) {
				case "s":
					
					start.App.lstProductos.remove((elemento - 1));
					System.out.println("Se ha borrado el producto de la lista. \n");
					Log.escribeLog("El usuario elimina el elemento "+(elemento)+":\n\t"+copia);					
					incorrectoSiNo = false;
					break;

				case "n":
					System.out.println("No se ha eliminado el producto seleccionado");
					incorrectoSiNo = false;
					Log.escribeLog("El usuario NO elimina el elemento "+(elemento)+":\n\t"+copia);
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
