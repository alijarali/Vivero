package tipos;

public enum TpAbono {
	NATURAL(1), ARTIFICIAL(2), MIXTO(3);
	
	private Integer abono;
	
	private TpAbono(Integer abono) {
		this.abono=abono;
		}
	
	public Integer getAbono() {
		return abono;
	}
	

	
}
