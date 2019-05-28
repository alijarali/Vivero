package complementos;

import tipos.TpAbono;

public class Abono extends Complemento {

	/**
	 * Creaci�n del atributo componentes.
	 */
	private String componentes;
	private TpAbono tipoAbono;
	
	/**
	 * Creaci�n de los constructores.
	 * @param componentes
	 */
	public Abono() {
		super();
	}
	
	public Abono(String codigo, Integer pesoMaximo, String proveedor, String componentes, TpAbono tipoAbono) {
		super(codigo, pesoMaximo, proveedor);
		this.componentes = componentes;
		this.setTipoAbono(tipoAbono);
	}

	/**
	 * Creaci�n de los getters y setters de cada uno de los objetos de abono.
	 * @return
	 */
	public String getComponentes() {
		return componentes;
	}

	public void setComponentes(String componentes) {
		this.componentes = componentes;
	}	
	
	public TpAbono getTipoAbono() {
	return tipoAbono;
}

	public void setTipoAbono(TpAbono tipoAbono) {
	this.tipoAbono = tipoAbono;
}
/**
 * Creaci�n del m�todo Java toString.
 */
	@Override
	public String toString() {
		return "Abono [componentes=" + componentes + "]";
	}


	
	
}
