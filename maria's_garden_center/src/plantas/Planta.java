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
	private TpHoja tipoHoja;
	private Integer altura;
	
	
	public Planta() {
		super();
	}
	
	public Planta(String codigo, TpHoja tipoHoja, Integer altura) {
		super(codigo);
		this.tipoHoja = tipoHoja;
		this.altura = altura;
	}


	public TpHoja getTipoHoja() {
		return tipoHoja;
	}

	public void setTipoHoja(TpHoja tipoHoja) {
		this.tipoHoja = tipoHoja;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getAltura() {
		return altura;
		
	}

	@Override
	public String toString() {
		return "Planta [tipoHoja=" + tipoHoja + ", altura=" + altura + ", getCodigo()=" + getCodigo() + "]";
	}
	
	
}
