package otros;

/**
 * 
 * Esta es la clase principal, de aquí diferenciaremos el resto de productos
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
 * Método Get del código del producto
 * @return
 */
public String getCodigo() {
	return codigo;
}

/**
 * Método Set del código del producto
 * @param codigo
 */
public void setCodigo(String codigo) {
	this.codigo = codigo;
}

/**
 * toString, nos enseña por pantalla de manera "bonita" los atributos del producto.
 */
@Override
public String toString() {
	return "Producto [Código=" + codigo + "]";
}






}
