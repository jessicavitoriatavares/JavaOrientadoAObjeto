package aula3;

import java.util.Date;

public abstract class Conta { // abstract proibe a instancia da classe - proibe a criacao de novos objetos

	// atributos da classe conta
	// colocando as variaveis em private protege elas

	protected long numeroConta, agencia;
	protected String senha;
	protected double saldo;
	protected Date dataAbertura;
	protected Cliente cliente; // composição
	private static long contador;

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senha) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senha = senha;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.cliente = cliente;
		contador++;
		System.out.println("objeto conta criado");
	}
	// métodos:

	// sacar
	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}

		return false;
	}

	// depositar
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	// consultarSaldo
	public abstract void exibirSaldo(); 

	// transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
		

	}
	
	public static void exibirContador()	{
		System.out.println("Contas: " + contador);
	}

}
