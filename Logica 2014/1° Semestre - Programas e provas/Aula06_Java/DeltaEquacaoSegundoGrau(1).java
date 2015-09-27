public class DeltaEquacaoSegundoGrau {
	public static void main (String[]args) {
		double A, B, C, D;
		System.out.println("Informe o valor de A da equacao do segundo grau:");
		A = Double.parseDouble (System.console().readLine());
		System.out.println("Informe o vaolr de B da equacao do segundo grau:");
		B = Double.parseDouble(System.console().readLine());
		System.out.println("Informe o valor de C da equacao do segundo grau:");
		C = Double.parseDouble(System.console().readLine());
		D = B * B - 4 * A * C;
		if (D == 0) System.out.println ("Possui apenas uma raiz real.");
		if (D < 0) System.out.println ("Nao possui raizes reais.");
		if (D > 0) System.out.println ("Possui duas raizes reais.");
	}
}

		