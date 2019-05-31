package opciones;

import otros.Utiles;

/**
 * Esta clase borra elementos de la lista. Si la lista está vacía nos enseña y
 * mensaje y vuelve al menñu principal.Si no, nos enseñará un listado con sus
 * indices a partir de ahí elegimos cual eliminar
 * 
 * @author Alicia
 *
 */
public class BorrarElemento {

	public static void borrarElemento() {
		Integer l = start.App.lstProductos.size();
		if (l == 0) {
			System.out.println(
					"Lista vacía. Puede añadir productos mediante la opción 'Añadir elemento' o cargar el catálogo con la opción 'Cargar lista' ");
		} else {

			Listar.listar();

			Integer elemento = Utiles.pideDatoEntero("¿Qué elemento desea borrar? ");
			if (elemento != null) {
				String seguro = Utiles.pideDatoCadenaMinusculas("¿Está seguro? S/N ");
				switch (seguro) {
				case "s":
					start.App.lstProductos.remove((elemento - 1));
					System.out.println("Se ha borrado el producto de la lista. \n");
					;
					break;

				}
			}
		}
	}
}
