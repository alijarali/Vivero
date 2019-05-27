package plantas;

public class Arbusto {
	private String colorFlor;
	private Integer vecesRiegoSemana;
	
	/**
	 * Constructor por defecto de arbusto.
	 */
	public Arbusto() {
		super();
		}
	/**
	 * Constructor de arbusto
	 * @param colorFlor
	 * @param vecesRiegoSemana
	 */
	public Arbusto(String colorFlor, Integer vecesRiegoSemana) {
		super();
		this.colorFlor = colorFlor;
		this.vecesRiegoSemana = vecesRiegoSemana;
	}
	
	/**
	 * método get del atributo ColorFlor
	 * @return
	 */
	public String getColorFlor() {
		return colorFlor;
	}
	
	/**
	 * método set del atributo ColorFlor
	 * @param colorFlor
	 */
	public void setColorFlor(String colorFlor) {
		this.colorFlor = colorFlor;
	}
	
	/**
	 * método get del atributo vecesRiegoSemana
	 * @return
	 */
	public Integer getVecesRiegoSemana() {
		return vecesRiegoSemana;
	}
	
/**
 * método set del atributo vecesRiegoSemana
 * @param vecesRiegoSemana
 */
	public void setVecesRiegoSemana(Integer vecesRiegoSemana) {
		this.vecesRiegoSemana = vecesRiegoSemana;
	}
	
	

}
