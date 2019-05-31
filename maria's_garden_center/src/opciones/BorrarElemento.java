package opciones;

import otros.Utiles;

/**
 * Esta clase borra elementos de la lista. Si la lista est� vac�a nos ense�a y
 * mensaje y vuelve al men�u principal.Si no, nos ense�ar� un listado con sus
 * indices a partir de ah� elegimos cual eliminar
 * 
 * @author Alicia
 *
 */
public class BorrarElemento {

	public static void borrarElemento() {
		Integer l = start.App.lstProductos.size();
		if (l == 0) {
			System.out.println(
					"Lista vac�a. Puede a�adir productos mediante la opci�n 'A�adir elemento' o cargar el cat�logo con la opci�n 'Cargar lista' ");
		} else {

			Listar.listar();

			Integer elemento = Utiles.pideDatoEntero("�Qu� elemento desea borrar? ");
			if (elemento != null) {
				String seguro = Utiles.pideDatoCadenaMinusculas("�Est� seguro? S/N ");
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
