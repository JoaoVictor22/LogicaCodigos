public class H {
	public static void main (String[] args) {
		double H;
		int N, contador;
			H = 0;
			contador = 1;
			System.out.println("Informe um numero:");
			N = Integer.parseInt (System.console().readLine());
				while (contador <= N) {
				H = 1.0/contador + H;
				contador = contador + 1; }
			System.out.printf ("H = %f", H);
	}
}
				
				