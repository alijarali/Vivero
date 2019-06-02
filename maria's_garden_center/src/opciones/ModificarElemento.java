package opciones;

import otros.Utiles;
import complementos.Abono;
import complementos.Maceta;
import otros.Informacion.TpEpo;
import otros.Producto;
import plantas.Arbol;
import plantas.Arbusto;
import tipos.TpAbono;
import tipos.TpHoja;

public class ModificarElemento {
	/**
	 * Este m�todo modifica un elemento de la lista de productos. Si la lista est�
	 * vac�a nos ense�a y mensaje y vuelve al men�u principal. Si no, nos ense�ar�
	 * un listado con sus indices a partir de ah� elegimos cual modificar.
	 * 
	 * @version 1.1 - Modifico las funciones 'modificarArbusto', 'modificarArbol', 
	 * 'modificarAbono' y 'modificarMaceta' para reducir c�digo 
	 */
	public static void modificarElemento() {
		Integer tamLista = start.App.lstProductos.size();
		if (tamLista == 0) {
			System.out.println(
					"\nLista vac�a.\nPuedes a�adir productos mediante la opci�n 'a�adir elemento' "
					+ "o cargar el cat�logo con la opci�n 'cargar lista' \n ");
		} else {
			Listar.listar();

			Integer elemento = Utiles.pideDatoEntero("�Qu� elemento deseas modificar? ");
			Producto elementoModificar = start.App.lstProductos.get((elemento - 1));
			
			if (elementoModificar instanceof Arbusto) {
				modificarArbusto((Arbusto) elementoModificar);
			} else {
				if (elementoModificar instanceof Arbol) {
					modificarArbol((Arbol) elementoModificar);
				} else {
					if (elementoModificar instanceof Abono) {
						modificarAbono((Abono) elementoModificar);
					} else {
						if (elementoModificar instanceof Maceta) {
							modificarMaceta((Maceta) elementoModificar);
						}
					}
				}
			}
			System.out.println(elementoModificar);
		}
	}

	public static Arbusto modificarArbusto(Arbusto arbusto) {
		
		arbusto.setCodigo(Utiles.pideDatoCadena("C�digo: "));
		arbusto.setTipoHoja(Utiles.pideDatoTpHoja());
		arbusto.setAltura(Utiles.pideDatoEntero("Altura: "));
		arbusto.setColorFlor(Utiles.pideDatoCadena("Color de flor: "));
		arbusto.setVecesRiegoSemana(Utiles.pideDatoEntero("Veces de riego a la semana: "));
		arbusto.setEpoca(Utiles.pideDatoTpEpo());		
		return arbusto;
	}

	public static Arbol modificarArbol(Arbol arbol) {

		arbol.setCodigo(Utiles.pideDatoCadena("C�digo: "));
		arbol.setTipoHoja(Utiles.pideDatoTpHoja());
		arbol.setAltura(Utiles.pideDatoEntero("Altura: "));
		arbol.setFruta(Utiles.pideDatoCadena("Fruta: "));
		arbol.setDiamBase(Utiles.pideDatoEntero("Diametro de la base: "));
		arbol.setEpoca(Utiles.pideDatoTpEpo());
		return arbol;
	}

	public static Abono modificarAbono(Abono abono) {

		abono.setCodigo(Utiles.pideDatoCadena("C�digo: "));
		abono.setPesoMaximo(Utiles.pideDatoEntero("Peso m�ximo: "));
		abono.setPesoMaximo(Utiles.pideDatoEntero("Peso m�ximo: "));
		abono.setProveedor(Utiles.pideDatoCadena("Proveedor: "));
		abono.setComponentes(Utiles.pideDatoCadena("Componentes: "));
		abono.setTipoAbono(Utiles.pideDatoTpAbono());
		abono.setEpoca(Utiles.pideDatoTpEpo());
		return abono;
	}

	public static Maceta modificarMaceta(Maceta maceta) {

		maceta.setCodigo(Utiles.pideDatoCadena("C�digo: "));
		maceta.setPesoMaximo(Utiles.pideDatoEntero("Peso m�ximo: "));
		maceta.setProveedor(Utiles.pideDatoCadena("Proveedor: "));
		maceta.setCapacidad(Utiles.pideDatoEntero("Capacidad: "));
		maceta.setAltura(Utiles.pideDatoEntero("Altura: "));
		return maceta;
	}
}
