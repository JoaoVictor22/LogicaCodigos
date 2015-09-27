public class Exercicio1ListaReforco {
	public static void main (String[] args) {
		int dado, N;
		
		dado = (int) (1 + Math.random() * 100);
		
		System.out.println("Tente adivinhar um numero entre 1 e 100:");
		N = Integer.parseInt (System.console().readLine());
		if (N > dado) {
		System.out.println ("Este numero e maior do que deveria.\n");
		} 
		if (N < dado) { 
		System.out.println ("Este numero e menor do que deveria.\n");
		}
		
		for (; N != dado; ) {
		System.out.println("Tente adivinhar um numero entre 1 e 100:");
		N = Integer.parseInt (System.console().readLine());
		if (N > dado) {
		System.out.println ("Este numero e maior do que deveria.\n");
		} 
		if (N < dado) { 
		System.out.println ("Este numero e menor do que deveria.\n");
		} }
		
		System.out.printf("Parabens! O numero e %d.\n", dado);
	
	}
}
		