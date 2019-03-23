package exercicio_11;

import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int resp = 1;
		int cod, qtd;
		double cachorro_quente = 1.20, bauru_simples = 1.30, bauru_ovo = 1.50,
		hamburger = 1.20, cheeseburguer = 1.30, refrigerante = 1.00, total = 0.0;
		
		do {
		
		System.out.println("Escreva o código do item pedido:");
		cod = leitor.nextInt();
		
		System.out.println("Digite a quantidade:");
		qtd = leitor.nextInt();
		
		if (cod == 100) {
			total += cachorro_quente;
		} else if (cod == 101) {
			total += bauru_simples;
		} else if (cod == 102) {
			total += bauru_ovo;
		} else if (cod == 103) {
			total += hamburger;
		} else if (cod == 104) {
			total += cheeseburguer;
		} else if (cod == 105) {
			total += refrigerante;
		}
		
		System.out.println("Deseja finalizar a leitura de itens? [1]Sim [0]Não");
		resp = leitor.nextInt();
		
		} while(resp != 0);
		
		System.out.println("O total do pedido é R$" + total);
		
	}

}
