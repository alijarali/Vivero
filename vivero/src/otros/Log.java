package otros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Contiene los métodos necesarios para el Log
 */
public class Log {

	/**
	 * Escribe un mensaje en el archivo log.txt
	 * @param mensaje - El mensaje a escribir en log.txt
	 */
	public static void escribeLog(String mensaje) {
		String mensajeCompleto;
		Date date = new Date();
		File archivo = new File("./log.txt");
		BufferedWriter bw;
				
		DateFormat fechaHora = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		mensajeCompleto = "<"+fechaHora.format(date)+">\n";
		mensajeCompleto = mensajeCompleto.concat(mensaje+"\n\n");
		
		//Si el archivo existe, apunta a él. Si no existe, lo crea y apunta a él
		try {
			bw = new BufferedWriter(new FileWriter(archivo, true));
			bw.write(mensajeCompleto);
			bw.close();
		} catch (IOException e) {
			System.out.println("ERROR LOG: Problema de I/O. \n"+e.getStackTrace().toString());
		}		
	}
	
	/**
	 * Borra por completo el archivo log.txt
	 */
	public static void borraLog() {
		File archivo = new File("./log.txt");
		BufferedWriter bw;
				
		//Si el archivo existe, apunta a él. Si no existe, lo crea y apunta a él
		try {
			bw = new BufferedWriter(new FileWriter(archivo));
			bw.write("");
			bw.close();
			System.out.println("\nSe ha borrado el archivo log.txt");
		} catch (IOException e) {
			System.out.println("ERROR LOG: Problema de I/O. \n"+e.getStackTrace().toString());
		}
	}
	
	
	/**
	 * Muestra por pantalla el archivo log.txt
	 */
	public static void muestraLog(){
		File archivo = new File("./log.txt");
		String cadena;
		String mensajeCompleto = "\n";
		FileReader f;
		
		try {
			
			f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);
			while((cadena = b.readLine())!=null) {
			   mensajeCompleto = mensajeCompleto.concat(cadena+"\n");
			}			
			b.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR LOG: No se ha encontrado el archivo. \n"+e.getStackTrace().toString());
		}catch (IOException e) {
			System.out.println("ERROR LOG: Problema de I/O. \n"+e.getStackTrace().toString());
		}
		System.out.println(mensajeCompleto);
	}
}
