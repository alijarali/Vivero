package comparadores;

import java.util.Comparator;

import otros.Producto;

public class ComparaCodigo implements Comparator<Producto>{

	@Override
	public int compare(Producto c1, Producto c2) {
		int res=0;
		res=c1.getCodigo().compareTo(c2.getCodigo());
	return res;
			
		}
		
	}

