package opciones;

import otros.Utiles;

/**
 * Esta clase borra elementos de la lista. Si la lista está vacía nos enseña y mensaje y vuelve al menñu principal.Si no, nos enseñará un listado con
 * sus indices a partir de ahí elegimos cual eliminar
 * 
 * @author Alicia
 * @version 1.1 - Mejoro el menú para que no admita valores erróneos
 *
 */
public class BorrarElemento {

	@SuppressWarnings("unlikely-arg-type")
	public static void borrarElemento() {
		Integer tamLista = start.App.lstProductos.size();
		if (tamLista == 0) {
			System.out.println("\n\nLista vacía. Puede añadir productos mediante la opción "
					+ "'Añadir elemento' o cargar el catálogo con la opción 'Cargar lista' ");
		} else {

			Integer elemento = 0;
			boolean incorrectoNumero = true;
			while(incorrectoNumero) {
				
				System.out.println("\n\n");
				Listar.listar();
				System.out.println("Tamaño Lista: "+tamLista);
				elemento = Utiles.pideDatoEntero("¿Qué elemento desea borrar?:");
				
				//TODO Esta linea no funciona bien, admite valores por encima de tamLista
				incorrectoNumero = (elemento != null) && (elemento >= 0 && elemento <= tamLista );
				if(incorrectoNumero) {
					System.out.println("Introduzca un número perteneciente a la lista");
				}
			}
				
				//if (elemento != null && (elemento <= tamLista && elemento >= 0)) {
			boolean incorrectoSiNo = true; //Controla si la opción elegida por el usuario es correcta o no				
			
			while(incorrectoSiNo) {
				String seguro = Utiles.pideDatoCadenaMinusculas("¿Está seguro? S/N ");
				switch (seguro.toLowerCase()) {
				case "s":
					start.App.lstProductos.remove((elemento-1));
					System.out.println("Se ha borrado el producto de la lista. \n");
					incorrectoSiNo = false;
					break;
			
				case "n":
					System.out.println("Volver al menú principal");
					incorrectoSiNo = false;
					break;
				
				default:
					if(incorrectoSiNo) {
						String respuesta = "\n\n- - - - - - - - - - - - - - - - - - - - - \n";
						respuesta = respuesta.concat("El valor introducido no es correcto.\n");
						respuesta = respuesta.concat("Recuerde, escriba S o N\n");
						respuesta = respuesta.concat("- - - - - - - - - - - - - - - - - - - - - ");
						System.out.println(respuesta);
					}
				}	
			}
				//}
			//}
		}
	}
}
