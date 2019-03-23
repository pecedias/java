package exercicio_04;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade do nadador: ");
		idade = leitor.nextInt();
		
		if (idade < 5) {
			System.out.println("Não há categoria");
		} else if (idade <= 7) {
			System.out.println("Infantil A");
		} else if (idade <= 10) {
			System.out.println("Infantil B");
		} else if (idade <= 13) {
			System.out.println("Juvenil A");
		} else if (idade <= 17) {
			System.out.println("Juvenil B");
		} else {
			System.out.println("Adulto");
		}

	}

}
