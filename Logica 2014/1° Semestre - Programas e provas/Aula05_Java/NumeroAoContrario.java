public class NumeroAoContrario {
	public static void main (String[] args) {
		int A, AA, B, BB, C, CC, D, DD, invert, numero;
		System.out.print("Informe o numero a ser invertido:");
		numero = Integer.parseInt (System.console().readLine());
		A = numero / 10000;
		AA = numero % 10000;
		B = AA / 1000;
		BB = AA % 1000;
		C = BB / 100;
		CC = BB % 100;
		D = CC / 10;
		DD = CC % 10;
		invert = DD*10000 + D*1000 + C*100 + B*10 + A*1;
		System.out.print("Numero invertido = ");
		System.out.print(invert);
	}
}