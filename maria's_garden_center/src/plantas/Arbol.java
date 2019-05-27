package plantas;

public class Arbol {

	private String fruta;
	private Integer diamBase;
	public Arbol(String fruta, Integer diamBase) {
		super();
		this.fruta = fruta;
		this.diamBase = diamBase;
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
	public String toString() {
		return "Arbol [fruta=" + fruta + ", diamBase=" + diamBase + "]";
	}
	
}
