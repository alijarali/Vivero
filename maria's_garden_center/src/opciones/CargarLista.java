package opciones;

import complementos.Abono;
import complementos.Maceta;

import plantas.Arbusto;
import tipos.TpAbono;
import tipos.TpHoja;

public class CargarLista {
	/**
	 * Este método borra un elemento de la lista de productos
	 */
	public static void cargarLista() {
		start.App.lstProductos.add(new Maceta("m122", 3, "Green shop", 3, 2));
		start.App.lstProductos.add(new Maceta("m001", 3, "Green shop", 3, 2));
		start.App.lstProductos.add(new Abono("a002", 4, "Legal Cannabis", "Platano y Naranja", TpAbono.NATURAL));
		start.App.lstProductos.add(new Arbusto("p001", TpHoja.PERENNE, 2, "Amarillas", 7));
		start.App.lstProductos.add(new Maceta("m002", 3, "Green shop", 3, 2));

	}
}
