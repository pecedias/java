package exercicio_07;

import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double xC, yC, r, xP, yP;
		
		System.out.println("Coordenadas do centro do círculo: ");
		xC = leitor.nextDouble();
		yC = leitor.nextDouble();
		
		System.out.println("Raio do círculo: ");
		r = leitor.nextDouble();
		
		System.out.println("Ponto a ser testado: ");
		xP = leitor.nextDouble();
		yP = leitor.nextDouble();
		
		double d = Math.pow((xC - xP), 2) + Math.pow((yC - yP), 2);
		
		if (d < r) {
		System.out.print("Dentro do círculo!");
		} else {
			System.out.println("Fora do círculo!");
		}
	}

}
