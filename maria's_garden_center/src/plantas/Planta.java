package plantas;

import otros.Producto;

/**
 * Clase Abstracta. Implementarán el método 'getAltura':
 *  - Arbusto
 *  - Arbol
 * a
 * @author Pedro
 * @version 1.0
 */
public abstract class Planta extends Producto {
	private TpHoja TipoHoja;
	
	public abstract Integer getAltura();
}
