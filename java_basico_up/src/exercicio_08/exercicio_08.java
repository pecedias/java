package exercicio_08;

import java.util.Scanner;

public class exercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;
		
		System.out.println("Valor a ser sacado: ");
		int valor = leitor.nextInt();
					
		while(valor > 0) {
			if (valor >= 100) {
				valor -= 100;
				cem += 1;
			} else if (valor >= 50) {
				valor -=  50;
				cinquenta += 1;
			} else if (valor >= 20) {
				valor -= 20;
				vinte += 1;
			} else if (valor >= 10) {
				valor -= 10;
				dez += 1;
			} else if (valor >= 5) {
				valor -= 5;
				cinco += 1;
			} else if (valor >= 2) {
				valor -= 2;
				dois += 1;
			} else {
				valor -= 1;
				um += 1;
			}
		}
		
		if (cem != 0)
			System.out.println(cem);
		if (cinquenta != 0)
			System.out.println(cinquenta);
		if (vinte != 0)
			System.out.println(vinte);
		if (dez != 0)
			System.out.println(dez);
		if (cinco != 0)
			System.out.println(cinco);
		if (dois != 0)
			System.out.println(dois);
		if (um != 0)
			System.out.println(um);
 	}

}
