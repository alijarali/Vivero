package opciones;

import otros.Utiles;

/**
 * Esta clase borra elementos de la lista. Si la lista está vacía nos enseña y mensaje y vuelve al menñu principal.Si no, nos enseñará un listado con
 * sus indices a partir de ahí elegimos cual eliminar
 * 
 * @author Alicia
 *
 */
public class BorrarElemento {

	@SuppressWarnings("unlikely-arg-type")
	public static void borrarElemento() {
		Integer l = start.App.lstProductos.size();
		if (l == 0) {
			System.out.println(
					"Lista vacía.Puedes añadir productos mediante la opción 'añadir elemento' o cargar el catálogo con la opción 'cargar lista' ");
		} else {

			Listar.listar();

			Integer elemento = Utiles.pideDatoEntero("¿Qué elemento deseas borrar? ");
			if (elemento != null) {
				String seguro = Utiles.pideDatoCadena("¿Está seguro? S/N ");
				switch (seguro) {
				case "s":
					start.App.lstProductos.remove(elemento);
					System.out.println("Se ha borrado el producto de la lista \n");
					;
					break;
				case "S":
					start.App.lstProductos.remove(elemento);
					System.out.println("Se ha borrado el producto de la lista \n");
					break;
				case "n":
					System.out.println("Volvemos al menú principal");
					;
					break;
				case "N":
					System.out.println("Volvemos al menú principal");
					break;
				}
			}
		}
	}
}
