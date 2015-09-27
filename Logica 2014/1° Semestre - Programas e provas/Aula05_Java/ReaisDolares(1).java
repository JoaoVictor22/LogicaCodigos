public class ReaisDolares {
	public static void main (String[] args) {
		double cot_dolar, valor_reais, result;
		System.out.print("Informe a cotacao do dolar:");
		cot_dolar = Double.parseDouble (System.console().readLine());
		System.out.print("Informe o valor em reais:");
		valor_reais = Double.parseDouble (System.console().readLine());
		result = valor_reais / cot_dolar;
		System.out.println ("Resultado em dolares:");
		System.out.print (result);
	}
}
		