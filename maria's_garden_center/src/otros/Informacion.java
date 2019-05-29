package otros;



/**
 * Interfaz que han de implementar: - Abono - Arbol - Arbusto
 * 
 * @author Pedro
 * @version 1.1
 */
public interface Informacion {
	// TODO Mirar pq no funciona declarar la variable aqui
	// TpEpo TipoEpoca;

	public enum TpEpo {
		VERANO, INVIERNO, ANUAL;
	}

	TpEpo getEpoca();

	void setEpoca(TpEpo Epoca);

}
