package aula01;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a idade do passageiro: ");
		int idade = sc.nextInt();
		
		if (idade < 16) {
			System.out.println("O individuo nao pode embarcar e nem votar");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("o individuo pode escolher se deseja embarcar/votar");
		} if (idade >= 18) {
			System.out.println("o individui eh obrigado a votar e pode escolher se deseja embarcar");
		}
		
		sc.close();

	}

}
