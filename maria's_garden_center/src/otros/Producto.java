package otros;

/**
 * 
 * Esta es la clase principal, de aqu� diferenciaremos el resto de productos
 */
public class Producto {
private String codigo;

/**
 * Constructor de Producto
 */
public Producto(String codigo) {
				this.codigo = codigo;
	}

/**
 * M�todo Get del c�digo del producto
 * @return
 */
public String getCodigo() {
	return codigo;
}

/**
 * M�todo Set del c�digo del producto
 * @param codigo
 */
public void setCodigo(String codigo) {
	this.codigo = codigo;
}

/**
 * toString, nos ense�a por pantalla de manera "bonita" los atributos del producto.
 */
@Override
public String toString() {
	return "Producto [C�digo=" + codigo + "]";
}






}
