package opciones;

import otros.Producto;

public class Listar {
	/**
	 * Este método muestra la lista de productos.
	 */
	public static void listar() {
		if(start.App.lstProductos.size()!=0) {
		for (Producto p : start.App.lstProductos) {
			System.out.println(start.App.lstProductos.indexOf(p)+"  "+p.toString());
		}
	}else {
		System.out.println("No hay elementos en la lista. Puedes añadirlos mediante la opción 'añadir elemento' o cargar el catálogo con la opción 'cargar lista'.");
		
	}}

}
