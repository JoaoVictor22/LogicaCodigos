public class Exercicio02_10 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		double dolares, reais, cotacao;
		
		// Texto de abertura do programa.
		System.out.println("--- CALCULO DA CONVERSAO DE REAIS PARA DOLARES ---");
		System.out.println();
		
		// Entrada de dados.
		System.out.print("Informe o valor em reais.....................: ");
		entrada = System.console().readLine();
		reais = Double.parseDouble(entrada);
		
		System.out.print("Informe o valor da cotacao do dolar em reais.: ");
		entrada = System.console().readLine();
		cotacao = Double.parseDouble(entrada);

		// Processamento.
		dolares = reais / cotacao;

		// Saida de dados.
		// O %.2f sera substituido pelo valor da variavel "dolares" com
		// duas casas apos a virgula.
		System.out.printf("Valor em dolares = US$ %.2f\n", dolares);
	}
}