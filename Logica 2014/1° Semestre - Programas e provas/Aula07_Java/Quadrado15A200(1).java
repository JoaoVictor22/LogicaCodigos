public class Quadrado15A200 {
	public static void main (String[] args) {
		int contador, quadrado;
		contador = 15;
			while (contador >= 15 && contador <= 200) { 
			quadrado = contador * contador;
			System.out.printf ("%d * %d = %d.\n", contador, contador, quadrado);
			contador = contador + 1; }
	}
}
