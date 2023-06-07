package aula01;

public class Condicionais {

	public static void main(String[] args) {
		
		//balança de metais - considere três metais distintos: ouro, prata e bronze. 
		//Escreva um algoritimo para exibir o mais pesado 
		//fazer com if-else encadeado 
		
		
		float ouro = 10, prata = 20, bronze = 30;
		
		if(ouro>prata && ouro > bronze) {
			System.out.println("Ouro é o mais pesado");
		} else if (prata > bronze) {
			System.out.println("prata e o mais pesado");
		} else {
			System.out.println("bronze e o mais pesado");
		}
		
	}

}
