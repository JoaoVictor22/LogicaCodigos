// Escreva um programa em Java que calcule o somat�rio dos N primeiros n�meros de um conjunto, onde o
// valor de N dever� ser informado pelo usu�rio.

public class Exercicio07 {
	
	public static int SomaNumeros (int N) {
		int soma = 0;
		for(int i = 1; i <= N; i++) {
		soma += i; }
		return soma; }
	
	public static void main (String[] args) {
		int N;
		System.out.printf("\n----------- Somatorio -----------\n\nEste programa calcula o somatorio de todos os numeros de zero ate o numero que voce desejar.\n");
		System.out.printf("\nPor favor informe um numero: ");
		N = Integer.parseInt(System.console().readLine());
		System.out.printf("\nSomatorio = %d.", SomaNumeros(N));
	}
}