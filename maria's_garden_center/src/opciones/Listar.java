package opciones;

import java.util.Collections;
import java.util.Comparator;

import comparadores.ComparaTipo;
import complementos.Abono;
import complementos.Complemento;
import complementos.Maceta;
import otros.Log;
import otros.Producto;
import plantas.Arbol;
import plantas.Arbusto;
import plantas.Planta;

public class Listar {
	/**
	 * Este método muestra la lista de productos ordenados por el comparador ComparaTipo
	 */
	public static void listar() {
		Integer indice = 0;

		if (start.App.lstProductos.size() != 0) {
			Comparator<Producto> compTpCo = new ComparaTipo();
			Collections.sort(start.App.lstProductos, compTpCo);
			String respuesta = "\nLista ordenada por el tipo:\n";
			String tituloPlanta = String.format("%3s %6s %6s %8s %15s %5s %15s %8s %10s %10s", 
					"Pos", "Código", "Altura", "TipoHoja", "ColorFlor", "Riego", "Fruta", "DiamBase", "Época", "Tipo");
			String tituloComplemento = String.format("%3s %6s %7s %20s %10s %25s %9s %6s %10s %10s", 
					"Pos", "Código", "PesoMax", "Proveedor", "Abono", "Componentes", "Capacidad", "Altura", "Época", "Tipo");			
			boolean flagPlanta = true;
			boolean flagComplemento = true;
											
			respuesta = respuesta.concat("====================================================================================================================\n");
			respuesta = respuesta.concat("\t\t\t\t\tTABLA DE PRODUCTOS\n");
			respuesta = respuesta.concat("====================================================================================================================\n");

			for (Producto p : start.App.lstProductos) {
				indice = start.App.lstProductos.indexOf(p) + 1;
				
				if(p instanceof Planta) {
					if(flagPlanta) {
						flagPlanta = false;          
						respuesta = respuesta.concat("--------------------------------------------------------------------------------------------------------------------\n");
						respuesta = respuesta.concat("\t\t\t\t\tPLANTAS\n\n");
						respuesta = respuesta.concat(tituloPlanta);
						respuesta = respuesta.concat("\n--------------------------------------------------------------------------------------------------------------------\n");
					}
					
					if(p instanceof Arbol) {
						Arbol arbol = (Arbol) p;
						respuesta = respuesta.concat(String.format("%3s %6s %6s %8s %15s %5s %15s %8s %10s %10s",
								indice.toString(), arbol.getCodigo(), arbol.getAltura().toString(), arbol.getTipoHoja().toString(),
								"-", "-", arbol.getFruta(), arbol.getDiamBase().toString(), arbol.getEpoca().toString(), "ÁRBOL"));
					}else {
						Arbusto arbusto = (Arbusto) p;
						respuesta = respuesta.concat(String.format("%3s %6s %6s %8s %15s %5s %15s %8s %10s %10s",
								indice.toString(), arbusto.getCodigo(), arbusto.getAltura().toString(), arbusto.getTipoHoja().toString(),
								arbusto.getColorFlor(), arbusto.getVecesRiegoSemana().toString(), "-", "-", arbusto.getEpoca().toString(), "ARBUSTO"));
					}
					
				}
				if(p instanceof Complemento) {
					if(flagComplemento) {
						flagComplemento = false;
						respuesta = respuesta.concat("\n--------------------------------------------------------------------------------------------------------------------\n");
						respuesta = respuesta.concat("\t\t\t\t\tCOMPLEMENTOS\n\n");
						respuesta = respuesta.concat(tituloComplemento);
						respuesta = respuesta.concat("\n--------------------------------------------------------------------------------------------------------------------\n");
					}
					
					if(p instanceof Abono) {
						Abono abono = (Abono) p;
						respuesta = respuesta.concat(String.format("%3s %6s %7s %20s %10s %25s %9s %6s %10s %10s",
								indice.toString(), abono.getCodigo(), abono.getPesoMaximo().toString(), abono.getProveedor(),
								abono.getTipoAbono().toString(), abono.getComponentes(), "-", "-", abono.getEpoca().toString(), "ABONO"));
								//
					}else {
						Maceta maceta = (Maceta) p;
						respuesta = respuesta.concat(String.format("%3s %6s %7s %20s %10s %25s %9s %6s %10s %10s",
								indice.toString(), maceta.getCodigo(), maceta.getPesoMaximo().toString(), maceta.getProveedor(),
								"-", "-", maceta.getCapacidad().toString(), maceta.getAltura().toString(), "-", "MACETA"));
					}
				}
				respuesta = respuesta.concat("\n");
			}
			System.out.println(respuesta);
			Log.escribeLog("El resultado de mostrar la lista fue:\n"+respuesta);
		} else {
			System.out.println("\nNo hay elementos en la lista.\nPuedes añadirlos mediante la opción "
					+ "'añadir elemento' o cargar el catálogo con la opción 'cargar lista'.");
			Log.escribeLog("Listar --> La lista está vacía");
		}
	}
}
