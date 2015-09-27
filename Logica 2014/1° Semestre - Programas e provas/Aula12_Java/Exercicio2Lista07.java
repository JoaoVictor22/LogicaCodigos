public class Exercicio2Lista07 {
	public static void main (String [] args) {
		int cont;
		String bin;
		
		for (cont = 1; cont <= 100; cont++) {
		bin = Integer.toString(cont, 2);
		System.out.printf("%d em binario = %s.\n", cont, bin);
		}
	}
}