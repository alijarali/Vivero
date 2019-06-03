package otros;



/**
 * Interfaz que han de implementar: 
 * - Abono 
 * - Arbol 
 * - Arbusto
 * 
 * Contiene el enumerado 'TpEpo' que sirve para indicar
 * la �poca del a�o.
 */
public interface Informacion {
	public enum TpEpo {
		VERANO, INVIERNO, ANUAL;
	}

	TpEpo getEpoca();

	void setEpoca(TpEpo Epoca);

}
