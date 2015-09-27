public class Exercicio1 {
	public static void main (String [] args) {
		int contador, soma;
		
			contador = 1;
			soma = 0;
			
				while (contador <=10) {
				soma = contador + soma;
				contador = contador + 1; }
			System.out.printf ("Soma dos numeros inteiros de 1 a 10 = %d.", soma);
	}
}