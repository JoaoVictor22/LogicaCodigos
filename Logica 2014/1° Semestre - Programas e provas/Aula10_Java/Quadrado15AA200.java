public class Quadrado15AA200 {
	public static void main (String[] args) {
		int N, quadrado;
		N = 15;
		do { 
		quadrado = N * N;
		System.out.printf("%d * %d = % d.\n", N, N, quadrado);
		N = N + 1;		
		} while (N <= 200);
		
	}
}