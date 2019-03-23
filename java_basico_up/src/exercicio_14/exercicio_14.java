package exercicio_14;

import java.util.Scanner;

public class exercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = leitor.nextInt();
		
		if (n % 2  == 0 ) {			
			System.out.println("Não é primo!");
		} else {
			System.out.println("É primo!");
		}
	}

}
