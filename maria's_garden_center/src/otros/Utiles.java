package otros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import otros.Informacion.TpEpo;
import tipos.TpAbono;
import tipos.TpHoja;

/**
 * Clase con una colección de métodos que se usan desde otras clases
 */
public class Utiles {

	public final static int MAX_CHAR_CODIGO = 6;//
	public final static int MAX_CHAR_ALTURA = 6;//
	//public final static int MAX_CHAR_HOJA = 8;
	public final static int MAX_CHAR_FLOR = 15;//
	public final static int MAX_CHAR_RIEGO = 5;//
	public final static int MAX_CHAR_FRUTA = 15;//
	public final static int MAX_CHAR_DIAM = 10;//
	public final static int MAX_CHAR_PESO = 7;//
	public final static int MAX_CHAR_PROVEEDOR = 20;//
	//public final static int MAX_CHAR_ABONO = 10;
	public final static int MAX_CHAR_COMPONENTES = 25;//
	public final static int MAX_CHAR_CAPACIDAD = 9;//
	//public final static int MAX_CHAR_EPOCA = 10;
	
	
	/**
	 * Este método sirve para pedir datos por pantalla de tipo cadena de caracteres
	 */
	public static String pideDatoCadena(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			System.out.println("\nERROR: Ha habido un error de Entrada/Salida. Introduzca otra vez el dato, por favor.");
			Log.escribeLog("ERROR: Problema de I/O. \n"+e.getStackTrace().toString());
			respuesta = pideDatoCadena(pregunta);
		}
		
		if(respuesta.length() == 0) {
			System.out.println("\nERROR: No puede ser un campo vacío");
			respuesta = pideDatoCadena(pregunta);
		}
		
		return respuesta;
	}
	
	/**
	 * Este método sirve para pedir datos por pantalla de tipo cadena de caracteres, y comprueba que 
	 * la respuesta del usuario no se pase del máximo
	 */
	public static String pideDatoCadena(String pregunta, int max) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			System.out.println("\nERROR: Ha habido un error de Entrada/Salida. Introduzca otra vez el dato, por favor.");
			Log.escribeLog("ERROR: Problema de I/O. \n"+e.getStackTrace().toString());
			respuesta = pideDatoCadena(pregunta);
		}
		
		if(respuesta.length() == 0) {
			System.out.println("\nERROR: No puede ser un campo vacío");
			respuesta = pideDatoCadena(pregunta, max);
		}

		if(respuesta.length() > max) {
			System.out.println("\nERROR: Máximo "+max+" caracteres.");
			respuesta = pideDatoCadena(pregunta, max);
		}
		return respuesta;
	}
	
	/**
	 * Este método sirve para pedir datos por pantalla de tipo cadena de caracteres
	 * y comprueba que no haya dígitos en esa cadena
	 */
	public static String pideDatoCadenaNoNumerica(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			System.out.println("\nERROR: Ha habido un error de Entrada/Salida. Introduzca otra vez el dato, por favor.");
			Log.escribeLog("ERROR: Problema de I/O. \n"+e.getStackTrace().toString());
			respuesta = pideDatoCadenaNoNumerica(pregunta);
		}
		
		if(respuesta.length() == 0) {
			System.out.println("\nERROR: No puede ser un campo vacío");
			respuesta = pideDatoCadenaNoNumerica(pregunta);
		}
		
		//Comprueba con una regexp que no haya ningun digito en la cadena introducida por el usuario
		if (respuesta.matches(".*\\d.*")) {
			System.out.println("\nERROR: No puede introducir ningún dígito.");
			respuesta = pideDatoCadenaNoNumerica(pregunta);
		}
		
		return respuesta;
	}
	
	
	/**
	 * Este método sirve para pedir datos por pantalla de tipo cadena de caracteres,
	 * comprueba que no haya dígitos en esa cadena y que 
	 * la respuesta del usuario no se pase del máximo
	 */
	public static String pideDatoCadenaNoNumerica(String pregunta, int max) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			System.out.println("\nERROR: Ha habido un error de Entrada/Salida. Introduzca otra vez el dato, por favor.");
			Log.escribeLog("ERROR: Problema de I/O. \n"+e.getStackTrace().toString());
			respuesta = pideDatoCadenaNoNumerica(pregunta);
		}
		
		if(respuesta.length() == 0) {
			System.out.println("\nERROR: No puede ser un campo vacío");
			respuesta = pideDatoCadenaNoNumerica(pregunta, max);
		}
		
		//Comprueba con una regexp que no haya ningun digito en la cadena introducida por el usuario
		if (respuesta.matches(".*\\d.*")) {
			System.out.println("\nERROR: No puede introducir ningún dígito.");
			respuesta = pideDatoCadenaNoNumerica(pregunta, max);
		}
		
		if(respuesta.length() > max) {
			System.out.println("\nERROR: Máximo "+max+" caracteres.");
			respuesta = pideDatoCadena(pregunta, max);
		}
		return respuesta;
	}

	/**
	 * Este método sirve para pedir datos por pantalla de tipo numero entero
	 */
	public static Integer pideDatoEntero(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Integer respuesta = 0;

		do {
			System.out.print(pregunta);
			try {
				respuesta = Integer.parseInt(teclado.readLine());
			} catch (IOException e) {
				System.out.println("\nERROR: Ha habido un error de Entrada/Salida. Introduzca otra vez el dato, por favor.");
				Log.escribeLog("ERROR: Problema de I/O. \n"+e.getStackTrace().toString());
				respuesta = pideDatoEntero(pregunta);
			} catch (NumberFormatException e) {
				System.out.println("\nERROR: Debe introducir un NÚMERO entero no negativo");
				Log.escribeLog("ERROR: Debe introducir un NÚMERO entero no negativo. \n"+e.getStackTrace().toString());
				respuesta = pideDatoEntero(pregunta);
			} catch (Exception e) {
				System.out.println("\nERROR: " + e.getMessage() + ". Introduzca otra vez el dato, por favor.");
				Log.escribeLog("ERROR: \n"+e.getStackTrace().toString());
				respuesta = pideDatoEntero(pregunta);
			}
			
			if(respuesta < 0) {
				System.out.println("\nERROR: Debe introducir un número entero NO NEGATIVO");
			}
			
		}while(respuesta < 0);
		
		return respuesta;
	}
	
	
	/**
	 * Este método sirve para pedir datos por pantalla de tipo numero entero
	 */
	public static Integer pideDatoEntero(String pregunta, int max) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Integer respuesta = 0;

		do {
			System.out.print(pregunta);
			try {
				respuesta = Integer.parseInt(teclado.readLine());
			} catch (IOException e) {
				System.out.println("\nERROR: Ha habido un error de Entrada/Salida. Introduzca otra vez el dato, por favor.");
				Log.escribeLog("ERROR: Problema de I/O. \n"+e.getStackTrace().toString());
				respuesta = pideDatoEntero(pregunta);
			} catch (NumberFormatException e) {
				System.out.println("\nERROR: Debe introducir un NÚMERO entero no negativo");
				Log.escribeLog("ERROR: Debe introducir un NÚMERO entero no negativo. \n"+e.getStackTrace().toString());
				respuesta = pideDatoEntero(pregunta);
			} catch (Exception e) {
				System.out.println("\nERROR: " + e.getMessage() + ". Introduzca otra vez el dato, por favor.");
				Log.escribeLog("ERROR: \n"+e.getStackTrace().toString());
				respuesta = pideDatoEntero(pregunta);
			}
			
			if(respuesta < 0) {
				System.out.println("\nERROR: Debe introducir un número entero NO NEGATIVO");
			}
			
		}while(respuesta < 0);
		
		if(respuesta.toString().length() > max) {
			System.out.println("\nERROR: Máximo "+max+" caracteres.");
			respuesta = pideDatoEntero(pregunta, max);
		}
		
		return respuesta;
	}
	
	
	public static TpHoja pideDatoTpHoja() {
		int opcion = 0;
		TpHoja tipo = null;

		do {
			System.out.print("Tipos de hoja: \n 1. Caduca \n 2. Perenne \n 3. Otro\n");
			opcion = pideDatoEntero("Introduzca el tipo de hoja: ");
			switch (opcion) {
			case 1:
				tipo = TpHoja.CADUCA;
				break;
			case 2:
				tipo = TpHoja.PERENNE;
				break;
			case 3:
				tipo = TpHoja.OTRO;
				break;
			}
		} while (compruebaOpcionIncorrecta(opcion, 1, 3));
		return tipo;
	};

	public static TpAbono pideDatoTpAbono() {
		int opcion = 0;
		TpAbono tipo = null;

		do {
			System.out.print("Tipos de abono: \n 1. Natural \n 2. Artificial \n 3. Mixto\n");
			opcion = pideDatoEntero("Introduzca el tipo de abono: ");
			switch (opcion) {
			case 1:
				tipo = TpAbono.NATURAL;
				break;
			case 2:
				tipo = TpAbono.ARTIFICIAL;
				break;
			case 3:
				tipo = TpAbono.MIXTO;
				break;
			}
		} while (compruebaOpcionIncorrecta(opcion, 1, 3));
		
		return tipo;
	}
	
	public static TpEpo pideDatoTpEpo() {
		int opcion = 0;
		TpEpo tipo = null;

		do {
			System.out.print("Tipos de épocas: \n 1. Verano \n 2. Invierno \n 3. Anual\n");
			opcion = pideDatoEntero("Introduzca el tipo de época: ");
			switch (opcion) {
			case 1:
				tipo = TpEpo.VERANO;
				break;
			case 2:
				tipo = TpEpo.INVIERNO;
				break;
			case 3:
				tipo = TpEpo.ANUAL;
				break;
			}
		} while (compruebaOpcionIncorrecta(opcion, 1, 3));
		
		return tipo;
	}
	
	/**
	 * Comprueba si la opcion del menu es incorrecta. Devuelve 
	 * true si es incorrecta, false si es correcta
	 */
	public static boolean compruebaOpcionIncorrecta(int opcion, int min, int max) {
		boolean resul = false;
		
		if (opcion > max || opcion < min) {
			resul = true;
			System.out.println("\nERROR: Opcion no válida [Mínimo: "+min+" || Máximo: "+max+"]");
		}
		
		return resul;
	}
	
	/**
	 * Sirve para pausar lo que se muestra por pantalla
	 */
	public static void enterParaContinuar() {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Presione Enter para continuar.");
		try {
			teclado.readLine();
		} catch (Exception e) {
		Log.escribeLog("ERROR: \n"+e.getStackTrace().toString());
		}
	}
}


