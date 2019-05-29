package plantas;

import otros.Informacion;

import tipos.TpHoja;

/**
 * clase arbusto, que hereda de planta
 * 
 * @author Alicia
 *
 */
public class Arbusto extends Planta implements Informacion {
	private String colorFlor;
	private Integer vecesRiegoSemana;
	private TpEpo epoca;

	/**
	 * Constructor por defecto de arbusto.
	 */
	public Arbusto() {
		super();
	}

	/**
	 * Constructor de arbusto
	 * 
	 * @param colorFlor
	 * @param vecesRiegoSemana
	 */
	public Arbusto(String codigo, TpHoja TipoHoja, Integer altura, String colorFlor, Integer vecesRiegoSemana) {
		super(codigo, TipoHoja, altura);
		this.colorFlor = colorFlor;
		this.vecesRiegoSemana = vecesRiegoSemana;
	}

	public Arbusto(String codigo, TpHoja TipoHoja, Integer altura, String colorFlor, Integer vecesRiegoSemana,
			TpEpo epoca) {
		super(codigo, TipoHoja, altura);
		this.colorFlor = colorFlor;
		this.vecesRiegoSemana = vecesRiegoSemana;
		this.epoca = epoca;
	}

	/**
	 * m�todo get del atributo ColorFlor
	 * 
	 * @return
	 */
	public String getColorFlor() {
		return colorFlor;
	}

	/**
	 * m�todo set del atributo ColorFlor
	 * 
	 * @param colorFlor
	 */
	public void setColorFlor(String colorFlor) {
		this.colorFlor = colorFlor;
	}

	/**
	 * m�todo get del atributo vecesRiegoSemana
	 * 
	 * @return
	 */
	public Integer getVecesRiegoSemana() {
		return vecesRiegoSemana;
	}

	/**
	 * m�todo set del atributo vecesRiegoSemana
	 * 
	 * @param vecesRiegoSemana
	 */
	public void setVecesRiegoSemana(Integer vecesRiegoSemana) {
		this.vecesRiegoSemana = vecesRiegoSemana;
	}

	@Override
	public String toString() {
		return "Arbusto [colorFlor=" + colorFlor + ", ColorFlor=" + getColorFlor() + ", Veces Riego Semana="
				+ getVecesRiegoSemana() + ", Altura=" + getAltura() + ", Codigo=" + getCodigo() + "]";
	}

	@Override
	public Integer getAltura() {

		return (int) (getVecesRiegoSemana() * (0.5));
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
