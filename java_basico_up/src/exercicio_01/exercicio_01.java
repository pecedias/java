package exercicio_01;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		int x1, x2, y1, y2, b, c;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de x1: ");
		x1 = leitor.nextInt();
		
		System.out.println("Digite o valor de x2: ");
		x2 = leitor.nextInt();
		
		System.out.println("Digite o valor de y1: ");
		y1 = leitor.nextInt();
		
		System.out.println("Digite o valor de y2: ");
		y2 = leitor.nextInt();
		
		b = x1 - x2;
		c = y1 - y2;
		
		b = b * b;
		c *= c;
		
		double a = Math.sqrt(b + c);
		System.out.println("A distância e:" + a);

	}

}
