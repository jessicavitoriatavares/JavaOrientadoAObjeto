package aula02;

public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial = 1; 
		int valor = 5;
		
		for (int i = 1; i <= valor; i++) {
			fatorial *= i;
		}
		
		System.out.println(valor + "! = " + fatorial);
	}

}
