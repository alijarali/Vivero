package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utiles {
	
	/**
	 * Este método sirve para pedir datos por pantalla de tipo cadena de caracteres
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
 * Este método sirve para pedir datos por pantalla de tipo numero entero
 * @param pregunta
 * @return
 */
	public static Integer pideDatoEntero(String pregunta) { // en este estamps devolviendo un numero entero por lo que
															// la respuesta la cambiamos
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return Integer.parseInt(respuesta); // cambiamos la respuesta para que nos devuelva un numero entero
	}

/**
 * Este método sirve para pedir datos por pantalla de tipo numero decimal
 * @param pregunta
 * @return
 */
	public static Double pideDatoDecimal(String pregunta) { // en este estamps devolviendo un numero decimal por lo que
															// la respuesta la cambiamos
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return Double.parseDouble(respuesta); // cambiamos la respuesta para que nos devuelva un double
	}

}
