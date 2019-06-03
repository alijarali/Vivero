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
 * Clase con los m�todos necesarios para a�adir elementos a la lista.
 */
public class AniadirElemento {	
	
	/**
	 * Este m�todo nos pide el tipo del producto que queremos a�adir y lo a�ade a la lista.
	 */
	public static void aniadirElemento() {
		int opcion = 0;

		do {
			opcion = Utiles.pideDatoEntero("\n\n�Qu� tipo de elemento vas a querer introducir? "
					+ " \n 1. Arbusto \n 2. �rbol \n 3. Abono \n 4. Maceta\nN�mero de Elemento:");

			switch (opcion) {
			case 1:
				Log.escribeLog("El usuario va a a�adir un Arbusto");
				aniadirArbusto();
				break;
			case 2:
				Log.escribeLog("El usuario va a a�adir un �rbol");
				aniadirArbol();
				break;
			case 3:
				Log.escribeLog("El usuario va a a�adir un Abono");
				aniadirAbono();
				break;
			case 4:
				Log.escribeLog("El usuario va a a�adir una Maceta");
				aniadirMaceta();
				break;
			}
		} while (Utiles.compruebaOpcionIncorrecta(opcion, 1, 4));
	}

	/**
	 * Este m�todo crea un objeto de tipo abono y lo a�ade a la lista.
	 */
	public static void aniadirAbono() {
		Integer pesoMaximo;
		String codigo;
		String proveedor;
		String componentes;
		TpAbono abono;
		TpEpo epoca;

		codigo = Utiles.pideDatoCadena("C�digo [Max. "+Utiles.MAX_CHAR_CODIGO+" caracteres]: ", Utiles.MAX_CHAR_CODIGO);
		pesoMaximo = Utiles.pideDatoEntero("Peso m�ximo [Max. "+Utiles.MAX_CHAR_PESO+" caracteres]: ", Utiles.MAX_CHAR_PESO);
		proveedor = Utiles.pideDatoCadenaNoNumerica("Proveedor [Max. "+Utiles.MAX_CHAR_PROVEEDOR+" caracteres]: ", Utiles.MAX_CHAR_PROVEEDOR);
		componentes = Utiles.pideDatoCadenaNoNumerica("Componentes [Max. "+Utiles.MAX_CHAR_COMPONENTES+" caracteres]: ", Utiles.MAX_CHAR_COMPONENTES);
		abono = Utiles.pideDatoTpAbono();
		epoca = Utiles.pideDatoTpEpo();

		Abono a = new Abono(codigo, pesoMaximo, proveedor, componentes, abono, epoca);
		start.App.lstProductos.add(a);
		System.out.println("\nSe ha a�adido " + a.toString());
		Log.escribeLog("El usuario a�ade:\n\t"+a.toString());
	}

	/**
	 * Este m�todo crea un objeto de tipo arbol y lo a�ade a la lista.
	 */
	public static void aniadirArbol() {
		String codigo;
		String fruta;		
		Integer altura;
		Integer diametroBase;
		TpEpo epoca;
		TpHoja hoja;

		codigo = Utiles.pideDatoCadena("C�digo [Max. "+Utiles.MAX_CHAR_CODIGO+" caracteres]: ", Utiles.MAX_CHAR_CODIGO);
		hoja = Utiles.pideDatoTpHoja();
		altura = Utiles.pideDatoEntero("Altura [Max. "+Utiles.MAX_CHAR_ALTURA+" caracteres]: ", Utiles.MAX_CHAR_ALTURA);
		fruta = Utiles.pideDatoCadenaNoNumerica("Fruta [Max. "+Utiles.MAX_CHAR_FRUTA+" caracteres]: ", Utiles.MAX_CHAR_FRUTA);
		diametroBase = Utiles.pideDatoEntero("Diametro de la base [Max. "+Utiles.MAX_CHAR_DIAM+" caracteres]: ", Utiles.MAX_CHAR_DIAM);
		epoca = Utiles.pideDatoTpEpo();

		Arbol a = new Arbol(codigo, hoja, altura, fruta, diametroBase, epoca);
		start.App.lstProductos.add(a);
		System.out.println("\nSe ha a�adido " + a.toString());
		Log.escribeLog("El usuario a�ade:\n\t"+a.toString());
	}

	/**
	 * Este m�todo crea un objeto de tipo arbusto y lo a�ade a la lista.
	 */
	public static void aniadirArbusto() {
		String codigo;
		String colorFlor;
		Integer altura;
		Integer vecesRiegoSemana;
		TpHoja hoja;
		TpEpo epoca;

		codigo = Utiles.pideDatoCadena("C�digo [Max. "+Utiles.MAX_CHAR_CODIGO+" caracteres]: ", Utiles.MAX_CHAR_CODIGO);
		hoja = Utiles.pideDatoTpHoja();
		altura = Utiles.pideDatoEntero("Altura [Max. "+Utiles.MAX_CHAR_ALTURA+" caracteres]: ", Utiles.MAX_CHAR_ALTURA);
		colorFlor = Utiles.pideDatoCadenaNoNumerica("Color de flor [Max. "+Utiles.MAX_CHAR_FLOR+" caracteres]: ", Utiles.MAX_CHAR_FLOR);
		vecesRiegoSemana = Utiles.pideDatoEntero("Veces de riego a la semana [Max. "+Utiles.MAX_CHAR_RIEGO+" caracteres]: ", Utiles.MAX_CHAR_RIEGO);
		epoca = Utiles.pideDatoTpEpo();

		Arbusto a = new Arbusto(codigo, hoja, altura, colorFlor, vecesRiegoSemana, epoca);
		start.App.lstProductos.add(a);
		System.out.println("\nSe ha a�adido " + a.toString());
		Log.escribeLog("El usuario a�ade:\n\t"+a.toString());

	}

	/**
	 * Este m�todo crea un objeto de tipo maceta y lo a�ade a la lista.
	 */
	public static void aniadirMaceta() {
		String codigo;
		String proveedor;
		Integer altura;
		Integer pesoMaximo;
		Integer capacidad;

		codigo = Utiles.pideDatoCadena("C�digo [Max. "+Utiles.MAX_CHAR_CODIGO+" caracteres]: ", Utiles.MAX_CHAR_CODIGO);
		pesoMaximo = Utiles.pideDatoEntero("Peso m�ximo [Max. "+Utiles.MAX_CHAR_PESO+" caracteres]: ", Utiles.MAX_CHAR_PESO);
		proveedor = Utiles.pideDatoCadenaNoNumerica("Proveedor [Max. "+Utiles.MAX_CHAR_PROVEEDOR+" caracteres]: ", Utiles.MAX_CHAR_PROVEEDOR);
		capacidad = Utiles.pideDatoEntero("Capacidad [Max. "+Utiles.MAX_CHAR_CAPACIDAD+" caracteres]: ", Utiles.MAX_CHAR_CAPACIDAD);
		altura = Utiles.pideDatoEntero("Altura [Max. "+Utiles.MAX_CHAR_ALTURA+" caracteres]: ", Utiles.MAX_CHAR_ALTURA);

		Maceta a = new Maceta(codigo, pesoMaximo, proveedor, capacidad, altura);
		start.App.lstProductos.add(a);
		System.out.println("\nSe ha a�adido " + a.toString());
		Log.escribeLog("El usuario a�ade:\n\t"+a.toString());
	}

}
