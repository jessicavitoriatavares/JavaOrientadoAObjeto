package aula4;

public class Lci implements Produto {

	@Override
	public double investir(double valor) {
		return valor * 1.095;
	}


}
