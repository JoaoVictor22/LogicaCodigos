public class Fibonacci {
	public static void main (String[] args) {
		int ultimo, penultimo, tmp;
			ultimo = 1;
			penultimo = 0;
				while (ultimo < 1000) {	
				System.out.println (ultimo);
				tmp = ultimo;
				penultimo = tmp;
				ultimo = penultimo + ultimo; }
	}
}