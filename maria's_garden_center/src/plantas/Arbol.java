package plantas;

import otros.Informacion;

import tipos.TpHoja;

public class Arbol extends Planta implements Informacion{
	/**
	 * Creación de los atributos de árbol : 
	 * - Fruta
	 * - diamBase
	 */
	private String fruta;
	private Integer diamBase;
	private TpEpo epoca;
	
	/**
	 * Creación de los constructores.
	 * @param fruta
	 * @param diamBase
	 */
	public Arbol() {
		super();
	}
	
	public Arbol(String codigo,TpHoja tipoHoja, Integer altura, String fruta, Integer diamBase) {
		super(codigo,tipoHoja, altura);
		this.fruta = fruta;
		this.diamBase = diamBase;
	}
	
	public Arbol(String codigo,TpHoja tipoHoja, Integer altura, String fruta, Integer diamBase, TpEpo epoca) {
		super(codigo,tipoHoja, altura);
		this.fruta = fruta;
		this.diamBase = diamBase;
		this.epoca=epoca;
	}
	
	/**
	 * Creación de los getters y setters de cada uno de los objetos de abono.
	 * @return
	 */
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
		this.epoca=epoca;
}
	/**
	 * Creación del método Java toString.
	 */
	@Override
	public String toString() {
		//String codigo,TpHoja tipoHoja, Integer altura, String fruta, Integer diamBase, TpEpo epoca)
		return "Árbol ["+ " Codigo: " + getCodigo() + ", Tipo Hoja: "
				+ getTipoHoja() + ", Altura: "+ getAltura()+", Fruta: " + fruta + ", Diámetro base: " + diamBase + ", Época: " + epoca + ", "
				+  "]";
	}
	
	
	
}
