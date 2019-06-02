package opciones;

import java.util.Collections;
import java.util.Comparator;

import comparadores.ComparaTipo;
import otros.Producto;

public class Listar {
	/**
	 * Este método muestra la lista de productos ordenados por su Tipo.
	 * 
	 * @version 1.1 - Hago que se imprima una sola
	 *          cadena, en lugar de llamar al syso una vez por cada elemento.
	 */
	public static void listar() {
		Integer indice = 0;

		if (start.App.lstProductos.size() != 0) {
			Comparator<Producto> compTpCo = new ComparaTipo();
			Collections.sort(start.App.lstProductos, compTpCo);
			String respuesta = "\nLista ordenada por el tipo:\n";

			for (Producto p : start.App.lstProductos) {
				indice = start.App.lstProductos.indexOf(p) + 1;
				respuesta = respuesta.concat(indice + "  " + p.toString() + "\n");
			}
			System.out.println(respuesta);
		} else {
			System.out.println(
					"\nNo hay elementos en la lista.\nPuedes añadirlos mediante la opción 'añadir elemento' o cargar el catálogo con la opción 'cargar lista'.");
		}
	}
}
