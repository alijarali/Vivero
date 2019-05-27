package complementos;

public class Abono extends Complemento {

	/**
	 * Creaci�n del atributo de abono.
	 */
	private String componentes;

	/**
	 * Creaci�n del constructor.
	 * @param componentes
	 */
	public Abono(String componentes) {
		super();
		this.componentes = componentes;
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
/**
 * Creaci�n del m�todo Java toString.
 */
	@Override
	public String toString() {
		return "Abono [componentes=" + componentes + "]";
	}
	
	
}
