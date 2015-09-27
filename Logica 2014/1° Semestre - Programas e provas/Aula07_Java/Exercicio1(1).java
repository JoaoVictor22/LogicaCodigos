public class Exercicio1 {
	public static void main (String[] args) {
		int soma, N, c;
		soma = 0;
		c = 1;	
		while (c <= 10) {		
		System.out.print("Informe um numero:");
		N = Integer.parseInt (System.console().readLine());
		soma = soma + N; 
		c = c + 1; }
		System.out.print(soma);
	}
}
