package exercicio_15;

import java.util.Scanner;

public class exercicio_15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] num = new int[4];
		int maior = 0;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o numero #" + i);
			num[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (num[i] < num[j]) {
					num[j] = num[i];
				} else {
					num[i] = num[j];
				}
			}
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println(num[i]);
		}
	}

}
