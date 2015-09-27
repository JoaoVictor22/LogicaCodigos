public class ValorDeS {
	public static void main (String[] args) {	
		double termo, S, num, den;
		int sinal;
		S = 1;
		sinal = -1;
		num = 2;
		den = 4;
		termo = num/den;
			while (num <= 10) {
			S = S + termo * sinal;
			num = num + 1;
			den = num * num;
			sinal = sinal * (-1);
			termo = num/den; }
		System.out.printf ("Valor de S = %f. \n", S);
	}
}