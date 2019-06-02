package opciones;

import java.util.Collections;
import java.util.Comparator;

import comparadores.ComparaTipo;
import otros.Producto;

public class Listar {
	/**
	 * Este m�todo muestra la lista de productos ordenados por su Tipo
	 */
	public static void listar() {
		Integer indice = 0;
		
		if (start.App.lstProductos.size() != 0) {
			Comparator<Producto> compTpCo = new ComparaTipo();
			Collections.sort(start.App.lstProductos, compTpCo);

			for (Producto p : start.App.lstProductos) {
				indice = start.App.lstProductos.indexOf(p) + 1;
				System.out.println(indice + "  " + p.toString());
			}
		}else{
			System.out.println("\nNo hay elementos en la lista.\nPuedes a�adirlos mediante la opci�n 'a�adir elemento' o cargar el cat�logo con la opci�n 'cargar lista'.");
		}
	}
}
