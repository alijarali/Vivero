package opciones;

import otros.Utiles;
import complementos.Abono;
import complementos.Maceta;
import otros.Informacion.TpEpo;
import plantas.Arbol;
import plantas.Arbusto;
import tipos.TpAbono;
import tipos.TpHoja;
/**
 * añadimos elementos a la lista
 * @author Alicia
 *
 */
public class AniadirElemento {
	/**
	 * este método añade un elemento a la lista de productos
	 */
	public static void aniadirElemento() {
	String tipoElemento= Utiles.pideDatoCadena("¿Qué tipo de elemento vas a querer introducir?(arbol,arbusto,abono,maceta)  ");
	String codigo;
	TpHoja hoja;
	Integer altura;
	TpEpo epoca;
	Integer pesoMaximo;
	String proveedor;
	Integer nuevo;
	
	switch(tipoElemento) {
	case "arbusto":
		codigo=Utiles.pideDatoCadena("Código: ");
		hoja=Utiles.parseStrTpHoja("Tipo de hoja: ");
		altura=Utiles.pideDatoEntero("Altura: ");
		String colorFlor=Utiles.pideDatoCadena("Color de flor: ");
		Integer vecesRiegoSemana=Utiles.pideDatoEntero("Veces de riego a la semana: ");
		epoca=Utiles.parseStrTpEpo("Época de siembra: ");
		start.App.lstProductos.add(new Arbusto(codigo, hoja, altura , colorFlor,vecesRiegoSemana,epoca));
		nuevo=start.App.lstProductos.size();
		System.out.println("Hemos añadido "+ start.App.lstProductos.get(nuevo-1));
		
	case "arbol":
		codigo=Utiles.pideDatoCadena("Código: ");
		hoja=Utiles.parseStrTpHoja("Tipo de hoja: ");
		altura=Utiles.pideDatoEntero("Altura: ");
		String fruta=Utiles.pideDatoCadena("Fruta: ");
		Integer diametroBase=Utiles.pideDatoEntero("Diametro de la base: ");
		epoca=Utiles.parseStrTpEpo("Época de siembra: ");
		start.App.lstProductos.add( new Arbol(codigo, hoja, altura ,fruta, diametroBase,epoca));
		nuevo=start.App.lstProductos.size();
		System.out.println("Hemos añadido "+ start.App.lstProductos.get(nuevo-1));
		
	case "abono":
	//String codigo, Integer pesoMaximo, String proveedor, String componentes, TpAbono tipoAbono,TpEpo epoca
		codigo=Utiles.pideDatoCadena("Código: ");
		pesoMaximo=Utiles.pideDatoEntero("Peso máximo: ");
		proveedor= Utiles.pideDatoCadena("Proveedor: ");
		String componentes=Utiles.pideDatoCadena("Componentes: ");
		TpAbono abono=Utiles.parseStrTpAbono("Tipo de abono: ");
		epoca=Utiles.parseStrTpEpo("Época de siembra: ");
		start.App.lstProductos.add(new Abono(codigo, pesoMaximo, proveedor ,componentes, abono,epoca));
		nuevo=start.App.lstProductos.size();
		System.out.println("Hemos añadido "+ start.App.lstProductos.get(nuevo-1));
		
		
		
	case"maceta":
		//String codigo, Integer pesoMaximo, String proveedor, Integer capacidad, Integer altura
		codigo=Utiles.pideDatoCadena("Código: ");
		pesoMaximo=Utiles.pideDatoEntero("Peso máximo: ");
		proveedor= Utiles.pideDatoCadena("Proveedor: ");
		Integer capacidad=Utiles.pideDatoEntero("Capacidad: ");
		altura=Utiles.pideDatoEntero("Altura: ");
		start.App.lstProductos.add(new Maceta(codigo, pesoMaximo, proveedor ,capacidad, altura));
		nuevo=start.App.lstProductos.size();
		System.out.println("Hemos añadido "+ start.App.lstProductos.get(nuevo-1));
	}
		}
}

