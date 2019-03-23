package exercicio_17;

public class exercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[4][4];
		int maior = 0;
		
		m[0][0] = 2;
		m[0][1] = 3;
		m[0][2] = 4;
		
		m[1][0] = 0;
		m[1][1] = 7;
		m[1][2] = 6;
		
		m[2][0] = 1;
		m[2][1] = 5;
		m[2][2] = 2;
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				if (l > c) {
					System.out.println(m[l][c]);
				 if (m[l][c] > maior) {
					 maior = m[l][c];
				 }
				}
			}
		}
		
		System.out.println("O menor valor entre os elementos abaixo da diagonal principal é: " + maior);
	}

}
