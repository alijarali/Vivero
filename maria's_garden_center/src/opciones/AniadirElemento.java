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
 * a�adimos elementos a la lista
 * 
 * @author Alicia
 *
 */
public class AniadirElemento {
	/**
	 * este m�todo nos pide el tipo del producto que queremos meter y lo asocia a un m�todo para cada tipo
	 */
	public static void aniadirElemento() {
		String tipoElemento = Utiles
				.pideDatoCadena("�Qu� tipo de elemento vas a querer introducir? Elija entre las siguientes opciones: \n -�rbol \n -Arbusto \n -Abono \n -Maceta\n  ");
		
		switch (tipoElemento) {
		case "arbusto":
			aniadirArbusto();
			break;

		case "arbol":
			aniadirArbol();
			break;

		case "abono":
			aniadirAbono();
			break;

		case "maceta":
			aniadirMaceta();
			break;
		}

	}

	/**
	 * Este m�todo crea un objeto de tipo abono y lo a�ade a la lista lstProductos
	 * @author Alicia
	 */
	public static void aniadirAbono() {
		// String codigo, Integer pesoMaximo, String proveedor, String componentes,
		// TpAbono tipoAbono,TpEpo epoca
		String codigo;
		TpEpo epoca;
		Integer pesoMaximo;
		String proveedor;

		codigo = Utiles.pideDatoCadena("C�digo: ");
		pesoMaximo = Utiles.pideDatoEntero("Peso m�ximo: ");
		proveedor = Utiles.pideDatoCadena("Proveedor: ");
		String componentes = Utiles.pideDatoCadena("Componentes: ");
		TpAbono abono = Utiles.parseStrTpAbono("Tipo de abono: ");
		epoca = Utiles.parseStrTpEpo("�poca de siembra: ");

		Abono a = new Abono(codigo, pesoMaximo, proveedor, componentes, abono, epoca);
		start.App.lstProductos.add(a);
		System.out.println("Hemos a�adido " +  a.toString());
	}

	/**
	 * Este m�todo crea un objeto de tipo arbol y lo a�ade a la lista lstProductos
	 * @author Alicia
	 */
	public static void aniadirArbol() {
		String codigo;
		TpHoja hoja;
		Integer altura;
		TpEpo epoca;

		codigo = Utiles.pideDatoCadena("C�digo: ");
		hoja = Utiles.parseStrTpHoja("Tipo de hoja: ");
		altura = Utiles.pideDatoEntero("Altura: ");
		String fruta = Utiles.pideDatoCadena("Fruta: ");
		Integer diametroBase = Utiles.pideDatoEntero("Diametro de la base: ");
		epoca = Utiles.parseStrTpEpo("�poca de siembra: ");

		Arbol a = new Arbol(codigo, hoja, altura, fruta, diametroBase, epoca);
		start.App.lstProductos.add(a);
		System.out.println("Hemos a�adido " +  a.toString());
	}

	/**
	 * Este m�todo crea un objeto de tipo arbusto y lo a�ade a la lista lstProductos
	 * @author Alicia
	 */
	public static void aniadirArbusto() {
		String codigo;
		TpHoja hoja;
		Integer altura;
		TpEpo epoca;

		codigo = Utiles.pideDatoCadena("C�digo: ");
		hoja = Utiles.parseStrTpHoja("Tipo de hoja: ");
		altura = Utiles.pideDatoEntero("Altura: ");
		String colorFlor = Utiles.pideDatoCadena("Color de flor: ");
		Integer vecesRiegoSemana = Utiles.pideDatoEntero("Veces de riego a la semana: ");
		epoca = Utiles.parseStrTpEpo("�poca de siembra: ");

		Arbusto a = new Arbusto(codigo, hoja, altura, colorFlor, vecesRiegoSemana, epoca);
		start.App.lstProductos.add(a);
		System.out.println("Hemos a�adido " +  a.toString());

	}

	/**
	 * Este m�todo crea un objeto de tipo maceta y lo a�ade a la lista lstProductos
	 * @author Alicia
	 */
	public static void aniadirMaceta() {
		// String codigo, Integer pesoMaximo, String proveedor, Integer capacidad,
		// Integer altura
		String codigo;
		Integer altura;
		Integer pesoMaximo;
		String proveedor;

		codigo = Utiles.pideDatoCadena("C�digo: ");
		pesoMaximo = Utiles.pideDatoEntero("Peso m�ximo: ");
		proveedor = Utiles.pideDatoCadena("Proveedor: ");
		Integer capacidad = Utiles.pideDatoEntero("Capacidad: ");
		altura = Utiles.pideDatoEntero("Altura: ");

		Maceta a = new Maceta(codigo, pesoMaximo, proveedor, capacidad, altura);
		start.App.lstProductos.add(a);
		System.out.println("Hemos a�adido " + a.toString());
	}

}
