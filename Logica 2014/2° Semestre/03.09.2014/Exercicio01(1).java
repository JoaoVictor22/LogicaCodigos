// Escreva um programa em Java para ordenar três números fornecidos pelo usuário.

public class Exercicio01 {
		
	public static int MaiorNumero (int A, int B, int C) {
		int max;
		max = Math.max(B, A);
		max = Math.max(max, C);
		return max; }
	
	public static int MenorNumero (int A, int B, int C) {
		int min;
		min = Math.min(A, B);
		min = Math.min(min, C);
		return min; }
	
	public static int NumeroMedio (int A, int B, int C, int max, int min) {
		int medio;
		if (A != max && A != min) {
			medio = A; } 
				else { if (B != max && B != min) {
					medio = B; }
						else { medio = C; } } 
		if(A == B && B == min) {
		medio = A; }
		if(B == C && C == max || A == C && A == max) {
		medio = C; }
		if(A == B && B == max) {
		medio = A; }
		return medio;}
	
	public static void main (String[] args) {
		
		int A, B, C;
		int max_usuario;
		int min_usuario;
		int medio_usuario;
		
		System.out.println("Informe tres numeros para serem ordenados:");
		
		A = Integer.parseInt(System.console().readLine());
		B = Integer.parseInt(System.console().readLine());
		C = Integer.parseInt(System.console().readLine());
		
		max_usuario = MaiorNumero(A, B, C);
		min_usuario = MenorNumero(A, B, C);
		medio_usuario = NumeroMedio(A, B, C, max_usuario, min_usuario);
		
		System.out.printf("%d, %d, %d.", min_usuario, medio_usuario, max_usuario); }
}