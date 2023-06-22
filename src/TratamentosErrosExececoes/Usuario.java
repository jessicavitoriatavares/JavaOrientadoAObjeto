package TratamentosErrosExececoes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Usuario {

	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private List<Usuario> list = new ArrayList<Usuario>();

	// private Date dataCadastro;
	public Usuario(int id, String nome, String email, String telefone, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		// this.dataCadastro = dataCadastro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
//	public Date getDataCadastro() {
//		return dataCadastro;
//	}
// public void setDataCadastro(Date dataCadastro) {
// this.dataCadastro = dataCadastro;
// }

	// Vetor pra guardar objetos do tipo Usuario
	public static void main(String[] args) {
		Usuario usuario[] = new Usuario[2];
		usuario[0] = new Usuario(4, "Jéssica", "jesica.vitoria.tavares044@gmail.com", "40028622", "root");
		usuario[1] = new Usuario(5, "Roberto", "Roberto.tavares@gmail.com", "40055622", "root");

		for (int i = 0; i < usuario.length; i++) {
			System.out.println(usuario[i].getNome());
		}
	}

	public List<Usuario> remover(String nome) {
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}
			
		} return list;
	
	}

}