package opciones;

import otros.Producto;
import otros.Utiles;

/**
 * Esta clase borra elementos de la lista. Primero nos enseñará un listado con sus indices 
 * a partir de ahí elegimos cual eliminar
 * @author Alicia
 *
 */
public class BorrarElemento {
	
public static void borrarElemento() {
	for (Producto p : start.App.lstProductos) {
		System.out.println(start.App.lstProductos.indexOf(p)+p.toString());
	}
	Integer elemento = Utiles.pideDatoEntero("¿Qué elemento deseas borrar? ");
	if(elemento!= null) {
		String seguro= Utiles.pideDatoCadena("¿Está seguro? S/N ");
		switch(seguro) {
		case "s": start.App.lstProductos.remove(elemento) ;
		System.out.println("Se ha borrado el producto de la lista" );;break;
		case "S": start.App.lstProductos.remove(elemento);
		System.out.println("Se ha borrado el producto de la lista");break;
		case "n":System.out.println("Volvemos al menú principal"); ;break;
		case "N": System.out.println("Volvemos al menú principal");break;
		}
	}
	}
}
