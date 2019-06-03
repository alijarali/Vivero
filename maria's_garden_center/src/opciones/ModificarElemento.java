package opciones;

import otros.Utiles;
import complementos.Abono;
import complementos.Maceta;

import otros.Producto;
import plantas.Arbol;
import plantas.Arbusto;

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
			Integer elemento = -1;
			
			do {
			Listar.listar();
			elemento = Utiles.pideDatoEntero("¿Qué elemento deseas modificar? ");
			}while(Utiles.compruebaOpcionIncorrecta(elemento, 1, tamLista));
			
			Producto elementoModificar = start.App.lstProductos.get((elemento - 1));
			
			if (elementoModificar instanceof Arbusto) {
				modificarArbusto((Arbusto) elementoModificar, elemento);
			} else {
				if (elementoModificar instanceof Arbol) {
					modificarArbol((Arbol) elementoModificar, elemento);
				} else {
					if (elementoModificar instanceof Abono) {
						modificarAbono((Abono) elementoModificar, elemento);
					} else {
						if (elementoModificar instanceof Maceta) {
							modificarMaceta((Maceta) elementoModificar, elemento);
						}
					}
				}
			}
		}
	}

	public static Arbusto modificarArbusto(Arbusto arbusto, int indice) {
		
		String copia = arbusto.toString();
		
		arbusto.setCodigo(Utiles.pideDatoCadena("Código: "));
		arbusto.setTipoHoja(Utiles.pideDatoTpHoja());
		arbusto.setAltura(Utiles.pideDatoEntero("Altura: "));
		arbusto.setColorFlor(Utiles.pideDatoCadenaNoNumerica("Color de flor: "));
		arbusto.setVecesRiegoSemana(Utiles.pideDatoEntero("Veces de riego a la semana: "));
		arbusto.setEpoca(Utiles.pideDatoTpEpo());
		
		System.out.println("Ha modificado el elemento "+indice+":\n\t"+copia+"\n\t--> "+arbusto.toString());
		Utiles.escribeLog("El usuario modifica el elemento "+indice+":\n\t"+copia+"\n\t--> "+arbusto.toString());
		
		return arbusto;
	}

	public static Arbol modificarArbol(Arbol arbol, int indice) {
		
		String copia = arbol.toString();

		arbol.setCodigo(Utiles.pideDatoCadena("Código: "));
		arbol.setTipoHoja(Utiles.pideDatoTpHoja());
		arbol.setAltura(Utiles.pideDatoEntero("Altura: "));
		arbol.setFruta(Utiles.pideDatoCadenaNoNumerica("Fruta: "));
		arbol.setDiamBase(Utiles.pideDatoEntero("Diametro de la base: "));
		arbol.setEpoca(Utiles.pideDatoTpEpo());
		
		System.out.println("Ha modificado el elemento "+indice+":\n\t"+copia+"\n\t--> "+arbol.toString());
		Utiles.escribeLog("El usuario modifica el elemento "+indice+":\n\t"+copia+"\n\t--> "+arbol.toString());
		
		return arbol;
	}

	public static Abono modificarAbono(Abono abono, int indice) {
		
		String copia = abono.toString();

		abono.setCodigo(Utiles.pideDatoCadena("Código: "));
		abono.setPesoMaximo(Utiles.pideDatoEntero("Peso máximo: "));
		abono.setPesoMaximo(Utiles.pideDatoEntero("Peso máximo: "));
		abono.setProveedor(Utiles.pideDatoCadenaNoNumerica("Proveedor: "));
		abono.setComponentes(Utiles.pideDatoCadenaNoNumerica("Componentes: "));
		abono.setTipoAbono(Utiles.pideDatoTpAbono());
		abono.setEpoca(Utiles.pideDatoTpEpo());
		
		System.out.println("Ha modificado el elemento "+indice+":\n\t"+copia+"\n\t--> "+abono.toString());
		Utiles.escribeLog("El usuario modifica el elemento "+indice+":\n\t"+copia+"\n\t--> "+abono.toString());
		
		return abono;
	}

	public static Maceta modificarMaceta(Maceta maceta, int indice) {
		
		String copia = maceta.toString();

		maceta.setCodigo(Utiles.pideDatoCadena("Código: "));
		maceta.setPesoMaximo(Utiles.pideDatoEntero("Peso máximo: "));
		maceta.setProveedor(Utiles.pideDatoCadenaNoNumerica("Proveedor: "));
		maceta.setCapacidad(Utiles.pideDatoEntero("Capacidad: "));
		maceta.setAltura(Utiles.pideDatoEntero("Altura: "));
		
		System.out.println("Ha modificado el elemento "+indice+":\n\t"+copia+"\n\t--> "+maceta.toString());
		Utiles.escribeLog("El usuario modifica el elemento "+indice+":\n\t"+copia+"\n\t--> "+maceta.toString());
		
		return maceta;
	}
}
