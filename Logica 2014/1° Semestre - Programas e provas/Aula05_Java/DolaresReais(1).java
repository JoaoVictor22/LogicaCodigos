public class DolaresReais {
	public static void main (String[] args){
		double cot_dolar, valor, result_real;
		System.out.print("Informe a cotacao do dolar:");
		cot_dolar = Double.parseDouble (System.console().readLine());
		System.out.print("Informe o valor a ser convertido:");
		valor = Double.parseDouble (System.console().readLine());
		result_real = cot_dolar * valor;
		System.out.println("Valor em reais = ");
		System.out.print(result_real);
	}
}