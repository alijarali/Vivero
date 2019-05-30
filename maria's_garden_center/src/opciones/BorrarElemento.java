package opciones;

import otros.Producto;
import otros.Utiles;

/**
 * Esta clase borra elementos de la lista. Primero nos ense�ar� un listado con sus indices 
 * a partir de ah� elegimos cual eliminar
 * @author Alicia
 *
 */
public class BorrarElemento {
	
public static void borrarElemento() {
	for (Producto p : start.App.lstProductos) {
		System.out.println(start.App.lstProductos.indexOf(p)+p.toString());
	}
	Integer elemento = Utiles.pideDatoEntero("�Qu� elemento deseas borrar? ");
	if(elemento!= null) {
		String seguro= Utiles.pideDatoCadena("�Est� seguro? S/N ");
		switch(seguro) {
		case "s": start.App.lstProductos.remove(elemento) ;
		System.out.println("Se ha borrado el producto de la lista" );;break;
		case "S": start.App.lstProductos.remove(elemento);
		System.out.println("Se ha borrado el producto de la lista");break;
		case "n":System.out.println("Volvemos al men� principal"); ;break;
		case "N": System.out.println("Volvemos al men� principal");break;
		}
	}
	}
}
