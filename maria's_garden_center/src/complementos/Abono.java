package complementos;

public class Abono {

	private String componentes;

	public Abono(String componentes) {
		super();
		this.componentes = componentes;
	}

	public String getComponentes() {
		return componentes;
	}

	public void setComponentes(String componentes) {
		this.componentes = componentes;
	}

	@Override
	public String toString() {
		return "Abono [componentes=" + componentes + "]";
	}
	
	
}
