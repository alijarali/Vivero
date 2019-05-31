package complementos;

import otros.Producto;

/**
 * Clase complemento que hereda de producto 
 * es padre de abono y maceta
 * @author Alicia
 *
 */
public class Complemento extends Producto {

	

	private Integer pesoMaximo;
	private String proveedor;
	
	/**
	 * constructor por defecto de Complemento
	 */
	public Complemento() {
		super();
		
	}
	 
	/**
	 * Constructor de complemento
	 * @param pesoMaximo
	 * @param proveedor
	 */
	public Complemento(String codigo, Integer pesoMaximo, String proveedor) {
		super(codigo);
		this.pesoMaximo = pesoMaximo;
		this.proveedor = proveedor;
	}

	/**
	 * metodo get del atributo pesoMaximo
	 * @return
	 */
	public Integer getPesoMaximo() {
		return pesoMaximo;
	}

	/**
	 * metodo set del atributo pesoMaximo
	 * @param pesoMaximo
	 */
	public void setPesoMaximo(Integer pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	/**
	 * metodo get del atributo proveedor
	 * @return
	 */
	public String getProveedor() {
		return proveedor;
	}

	/**
	 * metodo set del atributo proveedor
	 * @param proveedor
	 */
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	
	@Override
	public String toString() {
		return "Complemento [Peso Máximo: " + pesoMaximo + ", Proveedor: " + proveedor + ", Código: " + getCodigo()
				+ "]";
	}
	
	
}
