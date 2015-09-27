public class Exercicio02 {
	public static void main(String[] args) {
		double s;
		int cont;
		
		s = 0;
		for(cont = 0; cont <= 20; cont++) {
			s += (100.0-cont) / Calculos.fatorial(cont);
		}
		System.out.printf("S = %f\n", s);
	}
}