package aula02;

import java.util.Date;

public class Conta {
	
	//atributos da classe conta 
	//colocando as variaveis em private protege elas
	
	private int numeroConta, agencia;
	private String senha;
	private double saldo;
	private Date dataAbertura;
	private Cliente cliente; //composição
	
	//construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senha) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senha = senha;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.cliente = cliente;
		System.out.println("objeto conta criado");
	} 
	//métodos:
	
	//sacar
	public boolean sacar(double valor) {
		if (this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	//depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}
	//consultarSaldo
	public void exibirSaldo() {
		System.out.println(this.cliente.getNomeTitular() + " - saldo: " + this.saldo);
	}
	
	//transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste==true) {
	    conta.depositar(valor);
		}
	}



}
