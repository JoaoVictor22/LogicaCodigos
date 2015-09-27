public class Exercicio2 {
	public static void main (String[] args) {
		int n, contador, somatorio, somaquadrados; 
		double media;
			System.out.print("Informe o numero máximo:");
			n = Integer.parseInt (System.console().readLine());
			contador = 1;
			somatorio = 0;
		while (contador <= n) { somatorio = contador + somatorio;
			contador = contador + 1; }
			contador = 1;
			somaquadrados = 0;
		while (contador <= n) { somaquadrados = contador * contador + somaquadrados;
			contador = contador + 1; }
		media = (double) somatorio / n;
			System.out.printf("Somatorio: %d\n", somatorio);
			System.out.printf("Soma dos quadrados: %d\n", somaquadrados);
			System.out.printf("Media: %f\n", media);
	}
}