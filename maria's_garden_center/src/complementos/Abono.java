package complementos;

public class Abono extends Complemento {

	/**
	 * Creación del atributo de abono.
	 */
	private String componentes;

	/**
	 * Creación del constructor.
	 * @param componentes
	 */
	public Abono(String componentes) {
		super();
		this.componentes = componentes;
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
