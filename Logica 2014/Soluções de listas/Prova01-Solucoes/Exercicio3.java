public class Exercicio3 {

	public static void main(String[] args) {
		int contador, sinal;
		double S;
		contador = 1;
		S = 0;
		sinal = 1;
		while(contador <= 10) {
			S = S + sinal * (double) contador / (contador * contador);
			contador = contador + 1;
			sinal = -sinal;
		}
		System.out.printf("S = %f\n", S);
	}

}