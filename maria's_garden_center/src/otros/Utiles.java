package otros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import otros.Informacion.TpEpo;
import tipos.TpAbono;
import tipos.TpHoja;

public class Utiles {

	/**
	 * Este método sirve para pedir datos por pantalla de tipo cadena de caracteres
	 * 
	 * @param pregunta
	 * @return
	 */
	public static String pideDatoCadena(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return respuesta;
	}
	
	/**
	 * Este método sirve para pedir datos por pantalla de tipo cadena de caracteres
	 * y comprueba que no haya dígitos en esa cadena
	 * 
	 * @param pregunta
	 * @return
	 */
	public static String pideDatoCadenaNoNumerica(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		
		//Comprueba con una regexp que no haya ningun digito en la cadena introducida por el usuario
		if (respuesta.matches(".*\\d.*")) {
			System.out.println("\nERROR: No puede introducir ningún dígito.");
			respuesta = pideDatoCadenaNoNumerica(pregunta);
		}
		return respuesta;
	}

	/**
	 * Este método sirve para pedir datos por pantalla de tipo numero entero
	 * 
	 * @param pregunta
	 * @return
	 * @version 1.1 - Trata todos los errores (creo)
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
				respuesta = pideDatoEntero(pregunta);
			} catch (NumberFormatException e) {
				System.out.println("\nERROR: Debe introducir un NÚMERO entero no negativo");
				respuesta = pideDatoEntero(pregunta);
			} catch (Exception e) {
				System.out.println("\nERROR: " + e.getMessage() + ". Introduzca otra vez el dato, por favor.");
				respuesta = pideDatoEntero(pregunta);
			}
			
			if(respuesta < 0) {
				System.out.println("\nERROR: Debe introducir un número entero NO NEGATIVO");
			}
			
		}while(respuesta < 0);
		
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
	 * @param opcion
	 * @param min
	 * @param max
	 * @return
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
			//TODO Gestionar excepciones
		}
	}
}


