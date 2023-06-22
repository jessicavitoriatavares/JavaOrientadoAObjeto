package TratamentosErrosExececoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemplosCollections {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		lista.add("Jessica");
		lista.add("Lucas");
		lista.add("Belinha");
		lista.add("Joao");
		lista.add("maria");
		lista.add("eduarda");
		lista.add("isabella");

		List<Usuario> list = new ArrayList<Usuario>();
		Usuario Jessica = new Usuario(4, "Jéssica", "jesica.vitoria.tavares044@gmail.com", "40028622", "root");
		Usuario Lucas = new Usuario(5, "Lucas", "Lucas.Leandro@gmail.com", "40055622", "root");
		list.add(Jessica);
		list.add(Lucas);

		for (String numero : lista) {
			System.out.print(numero + "\t");
		}

		System.out.println(" ");

	}

	
}
