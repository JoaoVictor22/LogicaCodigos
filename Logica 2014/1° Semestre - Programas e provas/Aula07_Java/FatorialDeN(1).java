public class FatorialDeN {
	public static void main (String[] args) {	
		int N, contador;
		long fatorial;
			System.out.print ("Informe um numero inteiro:");
			N = Integer.parseInt (System.console().readLine());
			contador = 1;
			fatorial = 1;
				while (contador <= N) {
				fatorial = contador * fatorial;
				contador = contador + 1; }
			System.out.printf ("%d! = %d\n", N, fatorial);
	}
}
			