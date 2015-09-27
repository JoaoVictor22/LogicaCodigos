public class Tabuada {
	public static void main (String[] args) {
		int contador;
		double N, mult;
			contador = 1;
			System.out.print("Informe um numero:");
			N = Double.parseDouble (System.console().readLine());
				while (contador <= 10) {
				mult = N * contador;
				System.out.printf ("%f X %d = %f\n", N, contador, mult);
				contador = contador + 1; }
	}
}