public class Exercicio5 {
	public static void main (String [] args) {
		
		long fatorial;
		int n, contador;
		
		contador = 2;
		fatorial = 1;
		
		n = Integer.parseInt(args [0]);
		
		if (contador >= 0) {
			while (contador <= n) {
				fatorial = contador * fatorial;
				contador += 1; }
			}
		 
		 System.out.printf ("%d! = %d", n, fatorial);
	}
}