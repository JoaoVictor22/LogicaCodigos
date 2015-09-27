public class MultiplicacaoSoma {
	public static void main (String[] args) {
		int A, B, C, D, result1, result2;
		System.out.print("Informe o primeiro valor (A):");
		A = Integer.parseInt (System.console().readLine());
		System.out.print("Informe o segundo valor (B):");
		B = Integer.parseInt (System.console().readLine());
		System.out.print ("Informe o terceiro valor (C):");
		C = Integer.parseInt (System.console().readLine());
		System.out.print ("Informe o quarto valor (D):");
		D = Integer.parseInt (System.console().readLine());
		result1 = A * C;
		result2 = B + D;
		System.out.print("AxC=");
		System.out.println(result1);
		System.out.print("B+D=");
		System.out.println(result2);
	}
}