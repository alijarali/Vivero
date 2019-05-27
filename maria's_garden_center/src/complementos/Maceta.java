package complementos;

/**
 * Clase para la información de las macetas.
 * 
 * @author Pedro
 * @version 1.0
 */
public class Maceta extends Complemento {
	private Integer capacidad;
	private Integer altura;	
	
	
	public Maceta() {
		super();
	}
	public Maceta(Integer capacidad, Integer altura) {
		super();
		this.capacidad = capacidad;
		this.altura = altura;
	}
	
	
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	
	
}
