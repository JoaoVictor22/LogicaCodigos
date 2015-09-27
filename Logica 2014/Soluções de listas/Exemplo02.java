public class Exemplo02 {

	static int[][] leMatriz(int linhas, int colunas, String nome) {
		int lin, col;
		int[][] matriz = new int[linhas][colunas];
		for(lin = 0; lin < matriz.length; lin++) {
			for(col = 0; col < matriz[lin].length; col++) {
				System.out.printf("%s[%d][%d]: ", nome, lin, col);
				matriz[lin][col] = Integer.parseInt(System.console().readLine());
			}
		}
		return matriz;
	}
	
	static void mostraMatriz(int[][] matriz, String nome) {
		int lin, col;
		for(lin = 0; lin < matriz.length; lin++) {
			for(col = 0; col < matriz[lin].length; col++) {
				System.out.printf("%s[%d][%d] = %d\n", nome, lin, col, matriz[lin][col]);
			}
		}
	}

	public static void main(String[] args) {
		int[][] a, b, result;
		int lin, col;
		a = leMatriz(5,5,"A");
		b = leMatriz(5,5,"B");
		result = new int[5][5];
		
		for(lin = 0; lin < a.length; lin++) {
			for(col = 0; col < a[lin].length; col++) {
				result[lin][col] = a[lin][col] + b[lin][col];
			}
		}
		
		System.out.println("RESULTADO:");
		mostraMatriz(result, "RESULT");
	
	}

}