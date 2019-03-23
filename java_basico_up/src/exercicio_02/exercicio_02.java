package exercicio_02;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		int a, m, d;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		d = leitor.nextInt();
		
		System.out.println("Digite o mes: ");
		m = leitor.nextInt();
		
		System.out.println("Digite o ano: ");
		a = leitor.nextInt();
		
		int total = (a * 365) + (m * 30) + d;
		
		
		System.out.println("Seu total de dias e: " + total);
	}

}
