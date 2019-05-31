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
	 */
	public static void modificarElemento() {
		Integer l = start.App.lstProductos.size();
		if (l == 0) {
			System.out.println(
					"\n Lista vacía. Puedes añadir productos mediante la opción 'añadir elemento' o cargar el catálogo con la opción 'cargar lista' \n ");
		} else {
			Listar.listar();

			Integer elemento = Utiles.pideDatoEntero("¿Qué elemento deseas borrar? ");

			Producto elementoModificar = start.App.lstProductos.get(elemento);
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

	public static Arbusto modificarArbusto(Arbusto e) {
		// String codigo, TpHoja TipoHoja, Integer altura, String colorFlor, Integer
		// vecesRiegoSemana,TpEpo epoca

		String codigo;
		TpHoja hoja;
		Integer altura;
		TpEpo epoca;

		codigo = Utiles.pideDatoCadena("Código: ");
		e.setCodigo(codigo);
		hoja = Utiles.parseStrTpHoja("Tipo de hoja: ");
		e.setTipoHoja(hoja);
		altura = Utiles.pideDatoEntero("Altura: ");
		e.setAltura(altura);
		String colorFlor = Utiles.pideDatoCadena("Color de flor: ");
		e.setColorFlor(colorFlor);
		Integer vecesRiegoSemana = Utiles.pideDatoEntero("Veces de riego a la semana: ");
		e.setVecesRiegoSemana(vecesRiegoSemana);
		epoca = Utiles.parseStrTpEpo("Época de siembra: ");
		e.setEpoca(epoca);
		return e;

	}

	public static Arbol modificarArbol(Arbol e) {
		// tring codigo,TpHoja tipoHoja, Integer altura, String fruta, Integer diamBase,
		// TpEpo epoca
		String codigo;
		TpHoja hoja;
		Integer altura;
		TpEpo epoca;

		codigo = Utiles.pideDatoCadena("Código: ");
		e.setCodigo(codigo);
		hoja = Utiles.parseStrTpHoja("Tipo de hoja: ");
		e.setTipoHoja(hoja);
		altura = Utiles.pideDatoEntero("Altura: ");
		e.setAltura(altura);
		String fruta = Utiles.pideDatoCadena("Fruta: ");
		e.setFruta(fruta);
		Integer diametroBase = Utiles.pideDatoEntero("Diametro de la base: ");
		e.setDiamBase(diametroBase);
		epoca = Utiles.parseStrTpEpo("Época de siembra: ");
		e.setEpoca(epoca);
		return e;
	}

	public static Abono modificarAbono(Abono e) {
		// String codigo, Integer pesoMaximo, String proveedor, String
		// componentes,TpAbono tipoAbono,TpEpo epoca
		String codigo;
		TpEpo epoca;
		Integer pesoMaximo;
		String proveedor;

		codigo = Utiles.pideDatoCadena("Código: ");
		e.setCodigo(codigo);
		pesoMaximo = Utiles.pideDatoEntero("Peso máximo: ");
		e.setPesoMaximo(pesoMaximo);
		proveedor = Utiles.pideDatoCadena("Proveedor: ");
		e.setProveedor(proveedor);
		String componentes = Utiles.pideDatoCadena("Componentes: ");
		e.setComponentes(componentes);
		TpAbono abono = Utiles.parseStrTpAbono("Tipo de abono: ");
		e.setTipoAbono(abono);
		epoca = Utiles.parseStrTpEpo("Época de siembra: ");
		e.setEpoca(epoca);

		return e;
	}

	public static Maceta modificarMaceta(Maceta e) {
		// String codigo, Integer pesoMaximo, String proveedor, Integer
		// capacidad,Integer altura
		String codigo;
		Integer altura;
		Integer pesoMaximo;
		String proveedor;

		codigo = Utiles.pideDatoCadena("Código: ");
		e.setCodigo(codigo);
		pesoMaximo = Utiles.pideDatoEntero("Peso máximo: ");
		e.setPesoMaximo(pesoMaximo);
		proveedor = Utiles.pideDatoCadena("Proveedor: ");
		e.setProveedor(proveedor);
		Integer capacidad = Utiles.pideDatoEntero("Capacidad: ");
		e.setCapacidad(capacidad);
		altura = Utiles.pideDatoEntero("Altura: ");
		e.setAltura(altura);
		
		return e;
	}

}
