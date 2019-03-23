package exercicio_12;

import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] num = new int[10];
		int maior = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o número #" + i);
			num[i] = leitor.nextInt();
			if (num[i] > maior) {
				maior = num[i];
			}
		}
		
		System.out.println("O maior número é: " + maior);
		
	}

}
