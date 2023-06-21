package fabricaVeiculo;

public class Caminhao extends Veiculo {

	private int janela;
	private int carga;

	public Caminhao(Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa, String porte,
			String modelo, double limiteVeiculo) {
		super(motor, pneu, transmissao, numeroSerie, placa, porte, modelo, limiteVeiculo);
	}
	
	public void statusCaminhao() {
		System.out.println("Motor - " + this.motor);
		System.out.println("Pneu - " + this.pneu);
		System.out.println("Transmissão - " + this.transmissao);
		System.out.println("Número de série - " + this.numeroSerie);
		System.out.println("Placa - " + this.placa);
		System.out.println("Porte - " + this.porte);
		System.out.println("Placa - " + this.placa);
		System.out.println("Modelo - " + this.modelo);
		System.out.println("Limite do Veiculo - " + this.limiteVeiculo);
		
	}

	// Métodos
	public boolean controlarCarga(int valor1) {
		if (valor1 == 1) {
			System.out.println("Carregando");
			return true;

		} else {
			System.out.println("Descarregando");
			return false;
		}
	}

// janela = 0 aberta/ 1 = fechada.
	public void abrirJanela() {
		if (janela == 1) {
			System.out.println("A janela abriu.");
			janela = 0;
		}else {
		System.out.println("A janelá já está aberta, nada aconteceu.");
		}
	}

	public void fecharJanela() {
		if (janela == 0) {
			System.out.println("A janela fechou.");
			janela = 1;
		} else {
			janela = 1;
			System.out.println("A janela já estava fechada, nada aconteceu.");
		}
	}
}
