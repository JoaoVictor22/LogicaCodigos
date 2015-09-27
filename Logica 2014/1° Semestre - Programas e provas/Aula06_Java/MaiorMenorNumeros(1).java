public class MaiorMenorNumeros {
	public static void main (String[] args) {
		int A, B, C, D, E;
		System.out.println("Informe o primeiro numero:");
		A = Integer.parseInt (System.console().readLine());
		System.out.println("Informe o segundo numero:");
		B = Integer.parseInt (System.console().readLine());
		System.out.println ("Informe o terceiro numero:");
		C = Integer.parseInt (System.console().readLine());
		System.out.println ("Informe o quarto numero:");
		D = Integer.parseInt (System.console().readLine());
		System.out.println ("Informe o quinto numero:");
		E = Integer.parseInt (System.console().readLine());
		if (A > B && A > C && A > D && A > E) { System.out.print("O maior numero e:");
		System.out.println(A); }
		if (A < B && A < C && A < D && A < E) { System.out.print("O menor numero e:");
		System.out.println(A); }
		if (B > A && B > C && B > D && B > E) { System.out.print("O maior numero e:");
		System.out.println(B); }
		if (B < A && B < C && B < D && B < E) { System.out.print("O menor numero e:");
		System.out.println(B); }
		if (C > A && C > B && C > D && C > E) { System.out.print("O maior numero e:");
		System.out.println(C); }
		if (C < A && C < B && C < D && C < E) { System.out.print("O menor numero e:");
		System.out.println(C); }
		if (D > A && D > B && D > C && D > E) { System.out.print("O maior numero e:");
		System.out.println(D); }
		if (D < A && D < B && D < C && D < E) { System.out.print("O menor numero e:");
		System.out.println(D); }
		if (E > A && E > B && E > C && E > D) { System.out.print("O maior numero e:");
		System.out.println(E); }
		if (E < A && E < B && E < C && E < D) { System.out.print("O menor numero e:");
		System.out.println(E); }
	}
}
		
