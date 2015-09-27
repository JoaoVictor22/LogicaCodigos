// Escreva um programa em Java que calcule o m�ximo divisor comum de dois n�meros fornecidos pelo
// usu�rio.

public class Exercicio04 {
	
	public static boolean Primo (int N) {
		boolean primo = false;
		for (int i = 1, d = 0; i <= N; i++) {
			if (N % i == 0) {
			d++; }
			if (d == 2) { primo = true; }
			else { primo = false; }
			} return primo; }
	
	public static int MDC (int N1, int N2) {
		boolean primo;
		int MDC = 1, i = 1;
		for(; i <= N1 && i <= N2; i++) {
		primo = Primo(i);
		if (primo) {
			if (N1 % i == 0 && N2 % i == 0) { 
			MDC *= i;}
		} }
		return MDC; }
	
	public static void main (String[] args) {
		int N1, N2, MDC;
		System.out.println("Por favor informe dois numeros para que seu maximo divisor comum seja calculado: ");
		N1 = Integer.parseInt(System.console().readLine());
		N2 = Integer.parseInt(System.console().readLine());
		MDC = MDC(N1, N2);
		System.out.printf("MDC(%d, %d) = %d.", N1, N2, MDC);
	}
}