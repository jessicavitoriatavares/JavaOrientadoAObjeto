package aula3;

public class testeConta {

	public static void main(String[] args) {
		
		Cdb Cdb = new Cdb();
		Lca Lca = new Lca();
		Lci Lci = new Lci();
		
		Cliente Jessica = new Cliente("Jessica", "49324772", "65468654", "Avenida Alexandre Grandisoli" );
		Cliente Bernadete = new Cliente("Bernadete", "49320072", "65460054", "Avenida Alexandre Grandisoli" );
		ContaCorrente contaJessica = new ContaCorrente(Jessica, 1, 1, "teste");
		ContaCorrente contaBernadete = new ContaCorrente(Bernadete, 2, 1,"teste");
		
		//simulações
		
		contaJessica.depositar(10000);
		contaBernadete.depositar(9000);
		
		contaBernadete.exibirSaldo();
		contaJessica.exibirSaldo();
		
		contaJessica.sacar(5000);
		contaBernadete.sacar(2000);
		
		contaBernadete.exibirSaldo();
		contaJessica.exibirSaldo();
		
		contaJessica.transferir(contaBernadete,1000);
		
		contaBernadete.exibirSaldo();
		contaJessica.exibirSaldo();
		
		Conta.exibirContador();
		
		contaJessica.investimento(Cdb, 1000);
		
		
	}

}
