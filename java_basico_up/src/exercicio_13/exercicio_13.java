package exercicio_13;

import java.util.Scanner;

public class exercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número para calcular o fatorial: ");
		int n = leitor.nextInt();
		
		if (n < 0) {
			System.out.print("Não existe fatorial para número negativo!");
		} else if (n == 0) {
			System.out.print(n + "! = 1");
		} else {
			System.out.print(n + "! = ");
			for (int i = n; i > 0; i--) {
				int f = n * (n - 1);
				System.out.print(i + " . ");
			}
		}
	}

}
