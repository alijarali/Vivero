package opciones;

import otros.Producto;
import otros.Utiles;
import start.App;

public class BorrarElemento {
	/**
	 * este m�todo borra un elemento de la lista de productos
	 */
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
