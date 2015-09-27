public class Exercicio4 {
	public static void main (String [] args) {
		int A, B, C;
		double temp;
		
			A = Integer.parseInt (args [0]);
			B = Integer.parseInt (args [1]);
			C = Integer.parseInt (args [2]);
	
		if ((A * A == (B * B) + (C * C)) || (B * B == (C * C) + (A * A)) || (C * C == (A * A) + (B * B))) {
		System.out.println("Estes tres numeros inteiros positivos podem ser os comprimentos dos lados de um triangulo retangulo.");
		}
		else { System.out.println("Estes trs numeros inteiros positivos nao podem ser os comprimentos dos laods de um triangulo retangulo."); }
		
		temp = A * A + B * B + C * C; 
		System.out.printf ("Soma dos quadrados dos numeros = %.1f.\n", temp);
		
		temp = (A + B + C) * (A + B + C);
		System.out.printf ("Quadrado da soma dos numeros = %.1f.\n", temp);
		
		temp = (A + B + C) / 3.0;
		System.out.printf ("Media aritmetica dos numeros = %.1f\n", temp);
	
	}
}