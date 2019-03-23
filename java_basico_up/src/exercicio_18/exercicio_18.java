package exercicio_18;

public class exercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[4][4];
		int soma = 0;
		
		m[0][0] = 2;
		m[0][1] = 3;
		m[0][2] = 4;
		m[0][3] = 1;
		
		m[1][0] = 0;
		m[1][1] = 7;
		m[1][2] = 6;
		m[1][3] = 5;
		
		m[2][0] = 1;
		m[2][1] = 5;
		m[2][2] = 2;
		m[2][3] = 3;
		
		m[3][0] = 0;
		m[3][1] = 0;
		m[3][2] = 9;
		m[3][3] = 5;
		
		for(int l = 0; l < 4; l++) {
			for(int c = l + 1; c < 4; c++) {
				if (l < c) {
					System.out.println(m[l][c]);
					soma += m[l][c];
				}			
			}
		}
		
		System.out.println("A soma dos elementos acima da diagonal principal é: " + soma);
	}

}
