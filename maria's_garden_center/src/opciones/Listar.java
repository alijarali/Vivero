package opciones;

import otros.Producto;

public class Listar {
	/**
	 * Este m�todo muestra la lista de productos.
	 */
	public static void listar() {
		if(start.App.lstProductos.size()!=0) {
		for (Producto p : start.App.lstProductos) {
			System.out.println(start.App.lstProductos.indexOf(p)+"  "+p.toString());
		}
	}else {
		System.out.println("No hay elementos en la lista. Puedes a�adirlos mediante la opci�n 'a�adir elemento' o cargar el cat�logo con la opci�n 'cargar lista'.");
		
	}}

}
