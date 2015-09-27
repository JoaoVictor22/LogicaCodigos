public class DiferencaMaiorMenor {
	public static void main (String[] args) {	
		int A, B, C;
		System.out.println("Entre com o valor de A:");
		A = Integer.parseInt (System.console().readLine());
		System.out.println("Entre com o valor de B:");
		B = Integer.parseInt (System.console().readLine());
		System.out.println ("Entre com o valor de C:");
		if (A >= B) C = A - B;
		else C = B - A;
		System.out.println( C );
	}
}
