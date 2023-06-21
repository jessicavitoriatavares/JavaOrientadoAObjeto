package aula4;

import java.text.ParseException;

public class testeConta {

	public static void main(String[] args) throws ParseException {
		
		Cdb Cdb = new Cdb();
		Lca Lca = new Lca();
		Lci Lci = new Lci();
		
		Cliente clienteJessica = new Cliente("Jessica", "49324772", "65468654", "Avenida Alexandre Grandisoli","17/05/2004" );
		Cliente clienteBernadete = new Cliente("Bernadete", "49320072", "65460054", "Avenida Alexandre Grandisoli", "30/05/1969" );
		ContaCorrente contaJessica = new ContaCorrente(clienteJessica, 1, 1, "teste");
		ContaCorrente contaBernadete = new ContaCorrente(clienteBernadete, 2, 1,"teste");
		
		//simulações
		
		contaJessica.depositar(10000);
		contaBernadete.depositar(9000);
		
		contaBernadete.exibirSaldo();
		contaJessica.exibirSaldo();
		
		contaJessica.sacar(10000);
		contaBernadete.sacar(2000);
		
		contaBernadete.exibirSaldo();
		contaJessica.exibirSaldo();
		
		contaJessica.transferir(contaBernadete,1000);
		
		contaBernadete.exibirSaldo();
		contaJessica.exibirSaldo();
		
		Conta.exibirContador();
		
		contaJessica.investimento(Cdb, 1000);
		System.out.println(contaJessica);
		System.out.println(clienteJessica.getNomeTitular());
		

		
		
	}

}
