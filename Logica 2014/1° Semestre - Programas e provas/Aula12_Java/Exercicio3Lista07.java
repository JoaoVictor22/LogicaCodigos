public class Exercicio3Lista07 {
	public static void main (String[] args) {
		String  N;
				
		System.out.println("Informe um numero binario:");
		N = System.console().readLine();
		
		int N2 = Integer.parseInt(N, 2);
		System.out.printf ("%s = %d.\n", N , N2);
		
	}
}