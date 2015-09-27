public class FaixaPermitida {
	public static void main (String[] args) {
		int numero;
		System.out.print("Informe o numero a ser analizado:");
		numero = Integer.parseInt (System.console().readLine());
		if (numero >= 1 && numero <= 9) {
			System.out.println("O valor esta na faixa permitida.");
		} else {
			System.out.println("O valor nao esta na faixa permitida."); }
	}
}