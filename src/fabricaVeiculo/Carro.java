package fabricaVeiculo;

public class Carro extends Veiculo {
	int controlarJanela;
	int abrirPortaMalas;
	int abrirCapo;
	private double tanque;
	private double rendimentoTotal;

//Testado pelo Matheus
	public Carro(Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa, String porte,
			String modelo, double limiteVeiculo) {
		super(motor, pneu, transmissao, numeroSerie, placa, porte, modelo, limiteVeiculo);
	}
	// métodos

	public Carro(Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa, String porte,
			String modelo, double limiteVeiculo, int controlarJanela, int abrirPortaMalas, int abrirCapo) {
		super(motor, pneu, transmissao, numeroSerie, placa, porte, modelo, limiteVeiculo);
		this.controlarJanela = controlarJanela;
		this.abrirPortaMalas = abrirPortaMalas;
		this.abrirCapo = abrirCapo;
	}

	public boolean controlarJanela(int valor) {
		controlarJanela = valor;

		if (valor == 1) {
			System.out.println("Levantando a janela");
			return true;

		} else {
			System.out.println("abaixando a janela");
			return false;
		}
	}

	public boolean abrirPortaMalas(int valor) {
		abrirPortaMalas = valor;

		if (valor == 1) {
			System.out.println("Abrindo porta malas ");
			return true;

		} else {
			System.out.println("fechando porta malas");
			return false;
		}
	}

	public boolean abrirCapo(int valor) {
		abrirCapo = valor;

		if (valor == 1) {
			System.out.println("Abrindo capo ");
			return true;

		} else {
			System.out.println("fechando capo");
			return false;
		}

	}

	public void abastecer(Combustivel comb, double qtd) {
		if (tanque + qtd < 50) {
			tanque += qtd;
			rendimentoTotal += comb.abastecer(qtd);

		}

	}

	public void exibirDadosVeiculo() {
		System.out.println(getModelo());
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}

	public double getRendimentoTotal() {
		return rendimentoTotal;
	}

	public void setRendimentoTotal(double rendimentoTotal) {
		this.rendimentoTotal = rendimentoTotal;
	}

}
