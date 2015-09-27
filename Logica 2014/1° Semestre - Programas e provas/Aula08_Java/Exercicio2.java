public class Exercicio2 {
	public static void main (String [] args) {
		int num, den;
		double S;
			S = 0;
			num = 1;
			den = 1;
				while (num <= 99 && den <= 50){
				S = num/(double)den + S;
				num = num + 2;
				den = den + 1; }
			System.out.printf ("S = %f.", S);
	}
}