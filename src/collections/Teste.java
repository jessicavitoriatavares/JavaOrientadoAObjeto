package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {
		
		Usuario Jessica = new Usuario(1, "Jessica", "126");
		Usuario Lucas = new Usuario(2, "Lucas", "126");
		Usuario Bella = new Usuario(3, "Bella", "126");
		Usuario Maria = new Usuario(4, "Maria", "126");
		Usuario Pedro = new Usuario(5, "Pedro", "126");
		
		//Collection - lista
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(Pedro);
		listaUsuarios.add(Maria);
		listaUsuarios.add(Bella);
		listaUsuarios.add(Lucas);
		listaUsuarios.add(Jessica);
		
		//iterando a lista
		for(Usuario usuario : listaUsuarios) {
			System.out.println("Id: " + usuario.getIdUsuario() + " --- " + "Nome: " + usuario.getNome());
		}
		//ordenar a lista conforme regra definida no compareTo
		Collections.sort(listaUsuarios);
		
		System.out.println("-------");
		
		//iterando a lista ordenada 
		for(Usuario usuario : listaUsuarios) {
			System.out.println("Id: " + usuario.getIdUsuario() + " --- " + "Nome: " + usuario.getNome());
		}
		
		Map mapa = new HashMap();
		mapa.put("Jessica",Jessica);
		
		Object objeto = mapa.get("Jessica");
		Usuario usuario = (Usuario) objeto;
		System.out.println(usuario.getNome());
		
		
	}

}
