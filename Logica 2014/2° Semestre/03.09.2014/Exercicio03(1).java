// Faça um programa em Java que verifique se um número é divisível por outro. Ambos devem ser definidos 
// pelo usuário.

public class Exercicio03 {
	
	public static boolean Divisibilidade(int N1, int N2) {	
		boolean divisivel;
			if (N1 % N2 == 0) {
			divisivel = true; } 
			else { divisivel = false; }
			return divisivel; }
					
	public static void main (String[] args) {
		int N1, N2;
		boolean divisivel;
		
		System.out.println("Por favor informe dois numeros para que sejam analisados:");
		N1 = Integer.parseInt(System.console().readLine());
		N2 = Integer.parseInt(System.console().readLine());
		divisivel = Divisibilidade(N1, N2);
		if (divisivel) {
		System.out.printf("%d e divisivel por %d.", N1, N2); }
		else { System.out.printf("%d nao e divisivel por %d.", N1, N2); }
	
}
}
		