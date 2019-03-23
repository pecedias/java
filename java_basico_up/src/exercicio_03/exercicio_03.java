package exercicio_03;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		int a, m, d;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		d = leitor.nextInt();
		
		 a =  d / 365;
		 d =  d % 365;
		 m = d / 30;
		 d = d % 30;
		
		System.out.println("Seu total de anos e: " + a);
		System.out.println("Seu total de meses e: " + m);
		System.out.println("Seu total de dias e: " + d);

	}

}
