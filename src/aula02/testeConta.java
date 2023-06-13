package aula02;

public class testeConta {

	public static void main(String[] args) {
		
		
		Cliente Jessica = new Cliente("Jessica", "49324772", "65468654", "Avenida Alexandre Grandisoli" );
		Cliente Bernadete = new Cliente("Bernadete", "49320072", "65460054", "Avenida Alexandre Grandisoli" );
		Conta contaJessica = new Conta(Jessica, 1, 1, "teste");
		Conta contaBernadete = new Conta(Bernadete, 2, 1,"teste");
		
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
		
		
		
	}

}
