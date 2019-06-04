package plantas;

import otros.Informacion;

import tipos.TpHoja;
/**
 * Clase para crear los objetos tipo "Arbusto"
 *
 */
public class Arbusto extends Planta implements Informacion {
	private String colorFlor;
	private Integer vecesRiegoSemana;
	private TpEpo epoca;

	public Arbusto() {
		super();
	}

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

	public String getColorFlor() {
		return colorFlor;
	}

	public void setColorFlor(String colorFlor) {
		this.colorFlor = colorFlor;
	}

	public Integer getVecesRiegoSemana() {
		return vecesRiegoSemana;
	}

	public void setVecesRiegoSemana(Integer vecesRiegoSemana) {
		this.vecesRiegoSemana = vecesRiegoSemana;
	}

	@Override
	public String toString() {
		// String codigo, TpHoja TipoHoja, Integer altura, String colorFlor, Integer
		// vecesRiegoSemana,TpEpo epoca
		return "Arbusto [" + " Codigo= " + getCodigo() + ", Tipo Hoja= " + getTipoHoja() + ", Altura= " + getAltura()
				+ ", Color flor=" + colorFlor + ", Veces riego semana=" + vecesRiegoSemana + ", epoca=" + epoca + "]";
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
