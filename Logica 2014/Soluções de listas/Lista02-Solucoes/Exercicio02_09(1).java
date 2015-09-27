public class Exercicio02_09 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		double dolares, reais, cotacao;
		
		// Texto de apresentacao do programa.
		System.out.println("--- CALCULO DA CONVERSAO DE DOLARES PARA REAIS ---");
		System.out.println();
		
		// Entrada de dados.
		System.out.print("Informe o valor em dolares...................: ");
		entrada = System.console().readLine();
		dolares = Double.parseDouble(entrada);
		
		System.out.print("Informe o valor da cotacao do dolar em reais.: ");
		entrada = System.console().readLine();
		cotacao = Double.parseDouble(entrada);

		// Processamento.
		reais = dolares * cotacao;

		// Saida de dados.
		// O %.2f sera substituido pelo valor da variavel "reais" com
		// duas casas apos a virgula.
		System.out.printf("Valor em reais = R$ %.2f\n", reais);
	}

}