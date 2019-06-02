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
	 * Este método modifica un elemento de la lista de productos. Si la lista está
	 * vacía nos enseña y mensaje y vuelve al menñu principal. Si no, nos enseñará
	 * un listado con sus indices a partir de ahí elegimos cual modificar.
	 * 
	 * @version 1.1 - Modifico las funciones 'modificarArbusto', 'modificarArbol', 
	 * 'modificarAbono' y 'modificarMaceta' para reducir código 
	 */
	public static void modificarElemento() {
		Integer tamLista = start.App.lstProductos.size();
		if (tamLista == 0) {
			System.out.println(
					"\nLista vacía.\nPuedes añadir productos mediante la opción 'añadir elemento' "
					+ "o cargar el catálogo con la opción 'cargar lista' \n ");
		} else {
			Listar.listar();

			Integer elemento = Utiles.pideDatoEntero("¿Qué elemento deseas modificar? ");
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
		
		arbusto.setCodigo(Utiles.pideDatoCadena("Código: "));
		arbusto.setTipoHoja(Utiles.pideDatoTpHoja());
		arbusto.setAltura(Utiles.pideDatoEntero("Altura: "));
		arbusto.setColorFlor(Utiles.pideDatoCadena("Color de flor: "));
		arbusto.setVecesRiegoSemana(Utiles.pideDatoEntero("Veces de riego a la semana: "));
		arbusto.setEpoca(Utiles.pideDatoTpEpo());		
		return arbusto;
	}

	public static Arbol modificarArbol(Arbol arbol) {

		arbol.setCodigo(Utiles.pideDatoCadena("Código: "));
		arbol.setTipoHoja(Utiles.pideDatoTpHoja());
		arbol.setAltura(Utiles.pideDatoEntero("Altura: "));
		arbol.setFruta(Utiles.pideDatoCadena("Fruta: "));
		arbol.setDiamBase(Utiles.pideDatoEntero("Diametro de la base: "));
		arbol.setEpoca(Utiles.pideDatoTpEpo());
		return arbol;
	}

	public static Abono modificarAbono(Abono abono) {

		abono.setCodigo(Utiles.pideDatoCadena("Código: "));
		abono.setPesoMaximo(Utiles.pideDatoEntero("Peso máximo: "));
		abono.setPesoMaximo(Utiles.pideDatoEntero("Peso máximo: "));
		abono.setProveedor(Utiles.pideDatoCadena("Proveedor: "));
		abono.setComponentes(Utiles.pideDatoCadena("Componentes: "));
		abono.setTipoAbono(Utiles.pideDatoTpAbono());
		abono.setEpoca(Utiles.pideDatoTpEpo());
		return abono;
	}

	public static Maceta modificarMaceta(Maceta maceta) {

		maceta.setCodigo(Utiles.pideDatoCadena("Código: "));
		maceta.setPesoMaximo(Utiles.pideDatoEntero("Peso máximo: "));
		maceta.setProveedor(Utiles.pideDatoCadena("Proveedor: "));
		maceta.setCapacidad(Utiles.pideDatoEntero("Capacidad: "));
		maceta.setAltura(Utiles.pideDatoEntero("Altura: "));
		return maceta;
	}
}
