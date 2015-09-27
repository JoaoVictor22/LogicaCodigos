public class NumeroMenorQue3 {
	public static void main (String[] args) {
		int A;
		System.out.println("Informe um numero inteiro:");
		A = Integer.parseInt (System.console().readLine());
		if (! (A > 3)) {System.out.print("Seu numero nao e maior que o limite. Numero informado = ");
		System.out.println (A); }
	}
} 
