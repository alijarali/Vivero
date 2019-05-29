package otros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import otros.Informacion.TpEpo;
import tipos.TpAbono;
import tipos.TpHoja;

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

	/**
	 * Cuando nos dan por pantalla un String lo cambiamos a TpHoja
	 * @param pregunta
	 * @return
	 */
	public static TpHoja parseStrTpHoja(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		TpHoja ret=null;
		
		switch(respuesta.toUpperCase()) {
		case "CADUCA": ret= TpHoja.CADUCA; break;
		case "PERENNE": ret=TpHoja.PERENNE; break;
		case "OTROS": ret=TpHoja.OTRO; break;
			}
		return ret;
		
	};
	
	public static TpAbono parseStrTpAbono(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		TpAbono ret=null;
		
		switch(respuesta.toUpperCase()) {
		case "NATURAL": ret= TpAbono.NATURAL; break;
		case "ARTIFICIAL": ret=TpAbono.ARTIFICIAL; break;
		case "MIXTO": ret=TpAbono.MIXTO; break;
			}
		return ret;
		
	};
	
	public static TpEpo parseStrTpEpo(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = ""; // con esto sabemos que al menos nos va a devolver una cadena vacia
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		TpEpo ret=null;
		
		switch(respuesta.toUpperCase()) {
		case "VERANO": ret= TpEpo.VERANO; break;
		case "INVIERNO": ret=TpEpo.INVIERNO; break;
		case "ANUAL": ret=TpEpo.ANUAL; break;
			}
		return ret;
		
	};
}
