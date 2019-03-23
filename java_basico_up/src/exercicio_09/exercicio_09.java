package exercicio_09;

import java.util.Scanner;

public class exercicio_09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n, n1 = 0, n2 = 1;				
				
		System.out.println("Digite o valor: ");
		n = leitor.nextInt();
        
        for (int i = n; i > 0; i--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
				
	}

}
