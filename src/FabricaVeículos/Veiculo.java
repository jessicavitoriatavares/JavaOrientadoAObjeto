package FabricaVeículos;

import java.util.Date;

import aula4.Conta;

public abstract class Veiculo {
	
	protected String numeroSerie, cor, placa, porte, modelo;
	protected Date dataFabricacao;
	protected int status;
	protected double limiteVeiculo, valorVeiculo, velocidade;
	private static long contador;

	
	public Veiculo(String numeroSerie, String cor, String placa, String porte, Date dataFabricacao,int status, double valorVeiculo,double limiteVeiculo,double velocidade, String modelo) {
		//apagar o SUPER
		this.numeroSerie = numeroSerie;
		this.cor = cor;
		this.limiteVeiculo = limiteVeiculo;
		this.velocidade = velocidade;
		this.modelo = modelo;
		this.placa = placa;
		this.porte = porte;
		this.dataFabricacao = dataFabricacao;
		this.status = status;
		this.valorVeiculo = valorVeiculo;
		contador++;
	}
	
	//métodos:
	
	public boolean status(int valor) {
		if (valor == 1) {
			if (this.status >= valor) {
				this.saldo -= valor;
				return true;
			}
		}

	
	
	
	
	
	
	
	
	
	
}
