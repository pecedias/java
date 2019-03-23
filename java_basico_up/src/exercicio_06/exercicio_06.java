package exercicio_06;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double n1, n2, n3, n4;
		
			System.out.println("Digite a #1 nota do aluno: ");
			n1 = leitor.nextDouble();
			
			System.out.println("Digite a #2 nota do aluno: ");
			n2 = leitor.nextDouble();
			
			System.out.println("Digite a #3 nota do aluno: ");
			n3 = leitor.nextDouble();
			
			System.out.println("Digite a #4 nota do aluno: ");
			n4 = leitor.nextDouble();
		
		double ma = n1 + (n2 * 2) + (n3 * 3) + (n4 * 4) / 10;
		
		if (ma == 9.0) {
			System.out.println("Conceito A - Aprovado!");
		} else if (ma == 7.5 && ma < 9.0) {
			System.out.println("Conceito B - Aprovado!");
		} else if (ma == 6.0 && ma < 7.5) {
			System.out.println("Conceito C - Aprovado!");
		} else if (ma == 4.0 && ma < 6.0) {
			System.out.println("Conceito D - Reprovado!");
		} else if (ma < 4.0){
			System.out.println("Conceito E - Reprovado!");
		} else {
			System.out.println("Conceito não existe!");
		}
	}

}
