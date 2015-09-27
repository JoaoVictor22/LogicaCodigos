public class NumerosPrimos {
	public static void main (String[] args) {
		int N, Div1, resultmod, cont;
		
		System.out.println ("Numeros Primos\nPor favor informe um numero para que possamos prosseguir.");
		N = Integer.parseInt (System.console().readLine());
		Div1 = 0;
		
		for (cont = 1; cont <= N; cont++) {
		resultmod = N % cont;
		if (resultmod == 0) {
		Div1 = Div1 + cont; } }
		
		if (Div1 == N + 1) {
		System.out.printf ("%d e um numero primo.", N); }
		else { System.out.printf ("%d nao e um numero primo.", N); }
		
	}
}
