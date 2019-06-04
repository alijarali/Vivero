package opciones;

import complementos.Abono;
import complementos.Maceta;
import otros.Informacion.TpEpo;
import plantas.Arbusto;
import tipos.TpAbono;
import tipos.TpHoja;

public class CargarLista {
	/**
	 * Este método introduce en la lista 5 elementos
	 */
	public static void cargarLista() {
		start.App.lstProductos.add(new Maceta("m122", 3, "Green shop", 3, 2));
		start.App.lstProductos.add(new Maceta("m001", 3, "Green shop", 3, 2));
		start.App.lstProductos.add(new Abono("a002", 4, "Legal Cannabis", "Platano y Naranja", TpAbono.NATURAL, TpEpo.INVIERNO));
		start.App.lstProductos.add(new Arbusto("p001", TpHoja.PERENNE, 2, "Amarillas", 7, TpEpo.ANUAL));
		start.App.lstProductos.add(new Maceta("m002", 3, "Green shop", 3, 2));
	}
}
