package complementos;

import otros.Producto;

public class Complemento extends Producto {
	private Integer pesoMaximo;
	private String proveedor;

	public Complemento() {
		super();
	}

	public Complemento(String codigo, Integer pesoMaximo, String proveedor) {
		super(codigo);
		this.pesoMaximo = pesoMaximo;
		this.proveedor = proveedor;
	}

	public Integer getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Integer pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Complemento [Peso Máximo: " + pesoMaximo + ", Proveedor: " + proveedor + ", Código: " + getCodigo()
				+ "]";
	}
}
