package fabricaVeiculo;

public class Gasolina implements Combustivel {

	@Override
	public double abastecer(double qnt) {
		return qnt * 10;
		
		
	}

}
