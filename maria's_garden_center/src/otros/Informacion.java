package otros;

import tipos.TpEpo;

/**
 * Interfaz que han de implementar:
 * 	- Abono
 * 	- Arbol
 *  - Arbusto 
 * 
 * @author Pedro
 * @version 1.1
 */
public interface Informacion {
	//TODO Mirar pq no funciona declarar la variable aqui
	//TpEpo TipoEpoca;
	
	public TpEpo getEpoca();
	public void setEpoca(TpEpo Epoca);
}
