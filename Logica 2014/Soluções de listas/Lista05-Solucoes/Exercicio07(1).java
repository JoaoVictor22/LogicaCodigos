public class Exercicio07 {
	public static void main(String[] args) {
		double termo, pi;
		int den, sinal;
		den = 1;
		pi = 0.0;
		sinal = 1;
		termo = 4.0 / den;
		while(termo >= 0.000001) {
			pi = pi + termo * sinal;
			den = den + 2;
			termo = 4.0 / den;
			sinal = sinal * (-1);
		}
		System.out.printf("PI = %.6f\n", pi);
	}
}