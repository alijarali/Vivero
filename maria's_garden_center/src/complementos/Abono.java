package complementos;

import otros.Informacion;

import tipos.TpAbono;
/**
 * Clase para crear los objetos tipo "Abono"
 *
 */
public class Abono extends Complemento implements Informacion {
	private String componentes;
	private TpAbono tipoAbono;
	private TpEpo epoca;

	public Abono() {
		super();
	}

	public Abono(String codigo, Integer pesoMaximo, String proveedor, String componentes, TpAbono tipoAbono) {
		super(codigo, pesoMaximo, proveedor);
		this.componentes = componentes;
		this.setTipoAbono(tipoAbono);
	}

	public Abono(String codigo, Integer pesoMaximo, String proveedor, String componentes, TpAbono tipoAbono,
			TpEpo epoca) {
		super(codigo, pesoMaximo, proveedor);
		this.componentes = componentes;
		this.setTipoAbono(tipoAbono);
		this.epoca = epoca;
	}

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
		return "Abono [" + " Codigo: " + getCodigo() + ", Peso Máximo: " + getPesoMaximo() + ", Proveedor: "
				+ getProveedor() + ", Componentes: " + componentes + ", Tipo Abono: " + tipoAbono + ", Época: " + epoca
				+ "]";
	}

	@Override
	public TpEpo getEpoca() {
		return epoca;
	}

	@Override
	public void setEpoca(TpEpo epoca) {
		this.epoca = epoca;
	}
}
