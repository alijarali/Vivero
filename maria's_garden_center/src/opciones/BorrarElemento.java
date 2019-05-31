package opciones;

import otros.Utiles;

/**
 * Esta clase borra elementos de la lista. Si la lista est� vac�a nos ense�a y mensaje y vuelve al men�u principal.Si no, nos ense�ar� un listado con
 * sus indices a partir de ah� elegimos cual eliminar
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
					"Lista vac�a.Puedes a�adir productos mediante la opci�n 'A�adir elemento' o cargar el cat�logo con la opci�n 'Cargar lista' ");
		} else {

			Listar.listar();

			Integer elemento = Utiles.pideDatoEntero("�Qu� elemento deseas borrar? ");
			if (elemento != null) {
				String seguro = Utiles.pideDatoCadena("�Est� seguro? S/N ");
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
					System.out.println("Volvemos al men� principal");
					;
					break;
				case "N":
					System.out.println("Volvemos al men� principal");
					break;
				}
			}
		}
	}
}
