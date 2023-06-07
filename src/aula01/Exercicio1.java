package aula01;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor da doacao: ");
		double doacao = sc.nextFloat();
		double valorInvestimento = 0;
		
		if (doacao >= 1000) {
			valorInvestimento = doacao * 0.15;
			System.out.println("o valor investido deve ser: " + valorInvestimento);
		} else {
		   valorInvestimento = doacao * 0.05;
		   System.out.println("o valor investido deve ser: " + valorInvestimento);
		}
		
		sc.close();
	}

}
