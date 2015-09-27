public class Exercicio5Lista07 {
	public static void main (String[] args) {
		double N;
		int casas;
		
		System.out.println ("Informe um numero:");
		N = Double.parseDouble(System.console().readLine());
		System.out.println ("Informe um numero de casas decimais:");
		casas = Integer.parseInt (System.console().readLine());
		
		N = N * Math.pow (10, casas);
		N = Math.round (N);
		N = N / Math.pow (10, casas);
		 
		System.out.printf("%f\n", N);
	
	}
}
		