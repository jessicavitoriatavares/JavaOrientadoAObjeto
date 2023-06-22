package TratamentosErrosExececoes;

public class foreach {

	public static void main(String[] args) {
		
		int[] x = new int[10];
		lerVetor(x);
		imprimirVetor(x);

	}

	public static void lerVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = 2 * i;
		}
	}
	
	//deixa a sintaxe mais abreviada e não é preciso se preocupar com o tamanho do vetor.
	public static void imprimirVetor(int[] x) {
		for (int numero : x) {
			System.out.print(numero + "\t");
		}
	}

	}


