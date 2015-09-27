public class NumerosPerfeitos {
	public static void main (String[] args) {
		
		int N1, Div1, contador, resultmod;
		
		Div1 = 0;
		contador = 1;
		
		System.out.println ("Numeros Perfeitos");
		System.out.println ("Por favor informe um numero, a fim de que seja analisado.");
		N1 = Integer.parseInt (System.console().readLine());
				
		while ( contador < N1 ) {
		resultmod = N1 % contador;
			if (resultmod == 0) {
			Div1 = contador + Div1; }
		contador++; }
		
		if (Div1 == N1) {
		System.out.printf ("%d e um numero perfeito.\n", N1); }
		else {
		System.out.printf ("%d nao e um numero perfeito.\n", N1); }
	
	}
}
			
			