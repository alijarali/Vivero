package complementos;

public class Complemento {

	private Integer pesoMaximo;
	private String proveedor;
	
	/**
	 * constructor por defecto de Complemento
	 */
	public Complemento() {
		
	}
	 
	/**
	 * Constructor de complemento
	 * @param pesoMaximo
	 * @param proveedor
	 */
	public Complemento(Integer pesoMaximo, String proveedor) {
		super();
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
	
	
	
	
}
