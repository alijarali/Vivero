package opciones;

import otros.Producto;

public class Listar {
	/**
	 * Este método muestra la lista de productos.
	 */
	public static void listar() {
		for (Producto p : start.App.lstProductos) {
			System.out.println(start.App.lstProductos.indexOf(p)+"  "+p.toString());
		}
	}

}
