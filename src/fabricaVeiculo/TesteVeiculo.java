package fabricaVeiculo;

public class TesteVeiculo {

	public static void main(String[] args) {

		Motor tm = new Motor("chevrolet", "gasolina");
		Pneu chev = new Pneu(12, "pirelli");
		Transmissao auto = new Transmissao("5", "automatico");

	
		Carro jessicaVeiculo = new Carro(tm, chev, auto, "1234", "AFG1234", "pequeno", "hatch", 300.00);
	//	Moto motoGui = new Moto(tm, chev, auto, "1234", "AFG1234", "pequeno", "hatch", 300.00);
	//	Carro matheusVeiculo = new Carro(tm, chev, auto, "1234", "AFG1234", "pequeno", "hatch", 250);

	//	motoGui.ligarVeiculo();
	//	motoGui.acelerar(310);

	//	matheusVeiculo.ligarVeiculo();
    //		matheusVeiculo.acelerar(-180);
	//	Veiculo.exibirContador();

	//	caminhaoJessica.ligarVeiculo();
    //   caminhaoJessica.fecharJanela();
	//	caminhaoJessica.abrirJanela();
		
	Alcool alcool = new Alcool();
	Gasolina gasolina = new Gasolina();
	
	jessicaVeiculo.abastecer(gasolina, 10);
	jessicaVeiculo.abastecer(alcool, 20);
	jessicaVeiculo.abastecer(gasolina, 10);
	jessicaVeiculo.abastecer(gasolina, 20);
	
	
	System.out.println("Quantidade no Tanque: " + jessicaVeiculo.getTanque());
	System.out.println("Rendimento: " + jessicaVeiculo.getRendimentoTotal());
	
	

	}

}
