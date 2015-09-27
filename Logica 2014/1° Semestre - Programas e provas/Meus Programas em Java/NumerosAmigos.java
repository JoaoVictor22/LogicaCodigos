public class NumerosAmigos {
	public static void main (String[] args) {
		
		int N1, N2, Div1, Div2, soma, contador, resultmod;
		
		Div1 = 0;
		Div2 = 0;
		contador = 1;
		
		System.out.println ("Numeros Amigos");
		System.out.println ("Por favor informe dois numeros, a fim de que sejam analisados.");
		N1 = Integer.parseInt (System.console().readLine());
		N2 = Integer.parseInt (System.console().readLine());
		
		while ( contador < N1 ) {
		resultmod = N1 % contador;
			if (resultmod == 0) {
			Div1 = contador + Div1; }
		contador++; }
		
		contador = 1;
		
		while ( contador < N2 ) {
		resultmod = N2 % contador;
			if ( resultmod == 0 ) {
			Div2 = contador + Div2; }
		contador++; }
		
		if (Div1 == N2 && Div2 == N1) {
		System.out.printf ("%d e %d sao numeros amigos.\n", N1, N2); }
		else {
		System.out.printf ("%d e %d nao sao numeros amigos.\n", N1, N2); }
	
	}
}
			
			