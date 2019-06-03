package opciones;

import otros.Utiles;
import complementos.Abono;
import complementos.Maceta;
import otros.Informacion.TpEpo;
import otros.Log;
import plantas.Arbol;
import plantas.Arbusto;
import tipos.TpAbono;
import tipos.TpHoja;

/**
 * Clase con los métodos necesarios para añadir elementos a la lista.
 */
public class AniadirElemento {
	/**
	 * Este método nos pide el tipo del producto que queremos añadir y lo añade a la lista.
	 */
	public static void aniadirElemento() {
		int opcion = 0;

		do {
			opcion = Utiles.pideDatoEntero("\n\n¿Qué tipo de elemento vas a querer introducir? "
					+ " \n 1. Arbusto \n 2. Árbol \n 3. Abono \n 4. Maceta\nNúmero de Elemento:");

			switch (opcion) {
			case 1:
				Log.escribeLog("El usuario va a añadir un Arbusto");
				aniadirArbusto();
				break;
			case 2:
				Log.escribeLog("El usuario va a añadir un Árbol");
				aniadirArbol();
				break;
			case 3:
				Log.escribeLog("El usuario va a añadir un Abono");
				aniadirAbono();
				break;
			case 4:
				Log.escribeLog("El usuario va a añadir una Maceta");
				aniadirMaceta();
				break;
			}
		} while (Utiles.compruebaOpcionIncorrecta(opcion, 1, 4));
	}

	/**
	 * Este método crea un objeto de tipo abono y lo añade a la lista.
	 */
	public static void aniadirAbono() {
		Integer pesoMaximo;
		String codigo;
		String proveedor;
		String componentes;
		TpAbono abono;
		TpEpo epoca;

		codigo = Utiles.pideDatoCadena("Código: ");
		pesoMaximo = Utiles.pideDatoEntero("Peso máximo: ");
		proveedor = Utiles.pideDatoCadenaNoNumerica("Proveedor: ");
		componentes = Utiles.pideDatoCadenaNoNumerica("Componentes: ");
		abono = Utiles.pideDatoTpAbono();
		epoca = Utiles.pideDatoTpEpo();

		Abono a = new Abono(codigo, pesoMaximo, proveedor, componentes, abono, epoca);
		start.App.lstProductos.add(a);
		System.out.println("\nSe ha añadido " + a.toString());
		Log.escribeLog("El usuario añade:\n\t"+a.toString());
	}

	/**
	 * Este método crea un objeto de tipo arbol y lo añade a la lista.
	 */
	public static void aniadirArbol() {
		String codigo;
		String fruta;		
		Integer altura;
		Integer diametroBase;
		TpEpo epoca;
		TpHoja hoja;

		codigo = Utiles.pideDatoCadena("Código: ");
		hoja = Utiles.pideDatoTpHoja();
		altura = Utiles.pideDatoEntero("Altura: ");
		fruta = Utiles.pideDatoCadenaNoNumerica("Fruta: ");
		diametroBase = Utiles.pideDatoEntero("Diametro de la base: ");
		epoca = Utiles.pideDatoTpEpo();

		Arbol a = new Arbol(codigo, hoja, altura, fruta, diametroBase, epoca);
		start.App.lstProductos.add(a);
		System.out.println("\nSe ha añadido " + a.toString());
		Log.escribeLog("El usuario añade:\n\t"+a.toString());
	}

	/**
	 * Este método crea un objeto de tipo arbusto y lo añade a la lista.
	 */
	public static void aniadirArbusto() {
		String codigo;
		String colorFlor;
		Integer altura;
		Integer vecesRiegoSemana;
		TpHoja hoja;
		TpEpo epoca;

		codigo = Utiles.pideDatoCadena("Código: ");
		hoja = Utiles.pideDatoTpHoja();
		altura = Utiles.pideDatoEntero("Altura: ");
		colorFlor = Utiles.pideDatoCadenaNoNumerica("Color de flor: ");
		vecesRiegoSemana = Utiles.pideDatoEntero("Veces de riego a la semana: ");
		epoca = Utiles.pideDatoTpEpo();

		Arbusto a = new Arbusto(codigo, hoja, altura, colorFlor, vecesRiegoSemana, epoca);
		start.App.lstProductos.add(a);
		System.out.println("\nSe ha añadido " + a.toString());
		Log.escribeLog("El usuario añade:\n\t"+a.toString());

	}

	/**
	 * Este método crea un objeto de tipo maceta y lo añade a la lista.
	 */
	public static void aniadirMaceta() {
		String codigo;
		String proveedor;
		Integer altura;
		Integer pesoMaximo;
		Integer capacidad;

		codigo = Utiles.pideDatoCadena("Código: ");
		pesoMaximo = Utiles.pideDatoEntero("Peso máximo: ");
		proveedor = Utiles.pideDatoCadenaNoNumerica("Proveedor: ");
		capacidad = Utiles.pideDatoEntero("Capacidad: ");
		altura = Utiles.pideDatoEntero("Altura: ");

		Maceta a = new Maceta(codigo, pesoMaximo, proveedor, capacidad, altura);
		start.App.lstProductos.add(a);
		System.out.println("\nSe ha añadido " + a.toString());
		Log.escribeLog("El usuario añade:\n\t"+a.toString());
	}

}
