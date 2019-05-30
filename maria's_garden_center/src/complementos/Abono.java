package complementos;

import otros.Informacion;

import tipos.TpAbono;

public class Abono extends Complemento implements Informacion{

	/**
	 * Creación del atributo componentes.
	 */
	private String componentes;
	private TpAbono tipoAbono;
	private TpEpo epoca;
	
	/**
	 * Creación de los constructores.
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
	
	public Abono(String codigo, Integer pesoMaximo, String proveedor, String componentes, TpAbono tipoAbono,TpEpo epoca) {
		super(codigo, pesoMaximo, proveedor);
		this.componentes = componentes;
		this.setTipoAbono(tipoAbono);
		this.epoca=epoca;
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
	
	public TpAbono getTipoAbono() {
	return tipoAbono;
}

	public void setTipoAbono(TpAbono tipoAbono) {
	this.tipoAbono = tipoAbono;
}
@Override
public String toString() {
	return "Abono [componentes=" + componentes + ", tipoAbono=" + tipoAbono + ", epoca=" + epoca + ", getPesoMaximo()="
			+ getPesoMaximo() + ", getProveedor()=" + getProveedor() + ", getCodigo()=" + getCodigo() + "]";
}

	@Override
	public TpEpo getEpoca() {

		return epoca;
	}

	@Override
	public void setEpoca(TpEpo epoca) {
		this.epoca=epoca;

	}
	
	
}
