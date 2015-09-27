public class Fracoes {
	public static void main (String[] args) {
		
		int N1, N2, cont;
		
		System.out.println ("Informe os valores de N1 e N2:");
		N1 = Integer.parseInt (System.console().readLine());
		N2 = Integer.parseInt (System.console().readLine());
		
		cont = 2;
		
		while (cont <= N1 || cont <= N2) {
			if ( N1 % cont == 0 && N2 % cont == 0) {
			while (N1 % cont == 0 && N2 % cont == 0) {
			N1 = N1 / cont;
			N2 = N2 / cont;
			} } else { 
		cont++;  } }
		
		System.out.printf ("%d/%d", N1, N2);

	}
}