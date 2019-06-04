package otros;

/**
 * Clase principal de la que heredan las clases: 
 * - Planta: 
 *  * Árbol. 
 *  * Arbusto. 
 * - Complemento: 
 *  * Abono. 
 *  * Maceta.
 */
public class Producto {
	private String codigo;

	public Producto() {
	}

	public Producto(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Producto [Código=" + codigo + "]";
	}

}
