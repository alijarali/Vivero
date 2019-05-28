package plantas;

import otros.Producto;
import tipos.TpHoja;

/**
 * Clase Abstracta. Implementarán el método 'getAltura':
 *  - Arbusto
 *  - Arbol
 * 
 * @author Pedro
 * @version 1.1 -> Añado importacion TpHoja y constructor 
 */
public abstract class Planta extends Producto {
	private TpHoja TipoHoja;
	private Integer altura;
	
	
	public Planta() {
		super();
	}
	
	public Planta(String codigo, TpHoja tipoHoja) {
		super(codigo);
		TipoHoja = tipoHoja;
	}


	public abstract Integer getAltura();
}
