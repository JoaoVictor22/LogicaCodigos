public class Exercicio5N {
	public static void main (String[] args) {
		double N, teste;
		int casas;
		
		System.out.println ("Informe um numero:");
		N = Double.parseDouble(System.console().readLine());
		System.out.println ("Informe um numero de casas decimais:");
		casas = Integer.parseInt (System.console().readLine());
		
		N = N * Math.pow (10, casas);
		
		teste = N * 10;
		teste = teste % 10;
		
		if (teste < 5) {
		N = Math.floor (N);
		N = N / Math.pow (10, casas);
		} else {
		N = Math.ceil (N);
		N = N / Math.pow (10, casas); }
		
		System.out.printf("%f\n", N);
	
	}
}
		