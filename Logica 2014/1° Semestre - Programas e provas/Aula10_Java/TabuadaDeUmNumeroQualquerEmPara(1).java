public class TabuadaDeUmNumeroQualquerEmPara {
	public static void main (String[] args) {	
	
		int N, contador, result;
		
		System.out.println("Informe o numero a ser calculada a tabuada:");
		N = Integer.parseInt (System.console().readLine());
		
		for (contador = 1; contador <= 10; contador++) {
		result = N * contador;
		System.out.printf ("%d * %d = %d.\n", N, contador, result); }

	}
}
		
		