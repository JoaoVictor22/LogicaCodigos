public class TabuadaDeNEmRepita {
	public static void main (String[] args) {
		int N, result, contador;
		
		System.out.println("Informe o numero a ser calculada a tabuada:");
		N = Integer.parseInt (System.console().readLine());
		
		contador = 1;
		
		do {
		result = N * contador;
		System.out.printf ("%d * %d = %d.\n", N, contador, result);
		contador++;
		} while(contador <= 10);
		
	}
}

		