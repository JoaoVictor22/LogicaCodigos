public class Exercicio1Lista07 {
	public static void main (String[] args) {
		int cont;
		double raiz;
		
			
		for (cont = 1; cont <= 100; cont++) {
		raiz = Math.sqrt(cont);
		System.out.printf ("Raiz de %d = %.2f.\n", cont, raiz);
		}
	}
}