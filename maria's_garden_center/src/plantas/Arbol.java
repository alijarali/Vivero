package plantas;

import tipos.TpHoja;

public class Arbol extends Planta {
	/**
	 * Creaci�n de los atributos de �rbol : 
	 * - Fruta
	 * - diamBase
	 */
	private String fruta;
	private Integer diamBase;
	
	
	/**
	 * Creaci�n de los constructores.
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
	/**
	 * Creaci�n de los getters y setters de cada uno de los objetos de abono.
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
	/**
	 * Creaci�n del m�todo Java toString.
	 */
	@Override
	public String toString() {
		return "Arbol [fruta=" + fruta + ", diamBase=" + diamBase + "]";
	}
	@Override
	public Integer getAltura() {
		
		return this.getAltura();
	}
	
}
