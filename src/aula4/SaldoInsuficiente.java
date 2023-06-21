package aula4;

public class SaldoInsuficiente extends Exception {

	//classe de exceção quando o saldo não é o suficiente
	
	SaldoInsuficiente(String mensagem) {
		super(mensagem);
	}

}
