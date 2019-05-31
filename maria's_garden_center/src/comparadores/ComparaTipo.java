package comparadores;

import java.util.Comparator;

import complementos.Abono;
import complementos.Maceta;
import otros.Producto;
import plantas.Arbol;
import plantas.Arbusto;

public class ComparaTipo implements Comparator<Producto>{
	
	@Override
	public int compare(Producto p1, Producto p2) {
		int res = 0;
		int valorP1 = 0;
		int valorP2 = 0;
		
		if(p1 instanceof Arbol) valorP1=1;
		if(p1 instanceof Arbusto) valorP1=2;
		if(p1 instanceof Abono) valorP1=3;
		if(p1 instanceof Maceta) valorP1=4;
		
		if(p2 instanceof Arbol) valorP2=1;
		if(p2 instanceof Arbusto) valorP2=2;
		if(p2 instanceof Abono) valorP2=3;
		if(p2 instanceof Maceta) valorP2=4;
		
		res = valorP1 - valorP2;
		
		res = (res==0) ? p1.getCodigo().compareTo(p2.getCodigo()) : res;
		
		return res;
	}

}
