package plantas;

import otros.Informacion;

import tipos.TpHoja;

public class Arbol extends Planta implements Informacion {
	private String fruta;
	private Integer diamBase;
	private TpEpo epoca;

	public Arbol() {
		super();
	}

	public Arbol(String codigo, TpHoja tipoHoja, Integer altura, String fruta, Integer diamBase) {
		super(codigo, tipoHoja, altura);
		this.fruta = fruta;
		this.diamBase = diamBase;
	}

	public Arbol(String codigo, TpHoja tipoHoja, Integer altura, String fruta, Integer diamBase, TpEpo epoca) {
		super(codigo, tipoHoja, altura);
		this.fruta = fruta;
		this.diamBase = diamBase;
		this.epoca = epoca;
	}

	public String getFruta() {
		return fruta;
	}

	public void setFruta(String fruta) {
		this.fruta = fruta;
	}

	public Integer getDiamBase() {
		return diamBase;
	}

	public void setDiamBase(Integer diamBase) {
		this.diamBase = diamBase;
	}

	@Override
	public TpEpo getEpoca() {

		return epoca;
	}

	@Override
	public void setEpoca(TpEpo epoca) {
		this.epoca = epoca;
	}

	@Override
	public String toString() {
		// String codigo,TpHoja tipoHoja, Integer altura, String fruta, Integer
		// diamBase, TpEpo epoca)
		return "Árbol [" + " Codigo: " + getCodigo() + ", Tipo Hoja: " + getTipoHoja() + ", Altura: " + getAltura()
				+ ", Fruta: " + fruta + ", Diámetro base: " + diamBase + ", Época: " + epoca + ", " + "]";
	}

}
