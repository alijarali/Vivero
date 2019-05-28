package complementos;

import tipos.TpAbono;

public class Abono extends Complemento {

	/**
	 * Creación del atributo componentes.
	 */
	private String componentes;
	private TpAbono tipoAbono;
	
	/**
	 * Creación del constructor.
	 * @param componentes
	 */
	public Abono() {
		super();
	}
	
	public Abono(String codigo, Integer pesoMaximo, String proveedor, String componentes, TpAbono tipoAbono) {
		super(codigo, pesoMaximo, proveedor);
		this.componentes = componentes;
		this.tipoAbono = tipoAbono;
	}

	/**
	 * Creación de los getters y setters de cada uno de los objetos de abono.
	 * @return
	 */
	public String getComponentes() {
		return componentes;
	}

	public void setComponentes(String componentes) {
		this.componentes = componentes;
	}
/**
 * Creación del método Java toString.
 */
	@Override
	public String toString() {
		return "Abono [componentes=" + componentes + "]";
	}
	
	
}
