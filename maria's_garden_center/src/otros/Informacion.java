package otros;

import tipos.TpEpo;

/**
 * Interfaz que han de implementar:
 * 	- Abono
 * 	- Arbol
 *  - Arbusto
 * a
 * @author Pedro
 * @version 1.0
 */
public interface Informacion {
	//TODO Mirar pq no funciona declarar la variable aqui
	//TpEpo TipoEpoca;
	
	public TpEpo getEpoca();
	public void setEpoca(TpEpo Epoca);
}
