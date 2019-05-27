package plantas;

import otros.Producto;

/**
 * Clase Abstracta. Implementar�n el m�todo 'getAltura':
 *  - Arbusto
 *  - Arbol
 * 
 * @author Pedro
 * @version 1.0
 */
public abstract class Planta extends Producto {
	private TpHoja TipoHoja;
	
	public abstract Integer getAltura();
}
