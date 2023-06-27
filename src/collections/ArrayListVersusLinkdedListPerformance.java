package collections;

import java.util.Collection;
import java.util.LinkedList;

public class ArrayListVersusLinkdedListPerformance {

	public static void main(String[] args) {
		
		Collection <Integer> lista = new LinkedList<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i <=50000; i++) {
			lista.add(i);
			
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoGasto = fim - inicio;
		
		System.out.println(tempoGasto);

	}

}
