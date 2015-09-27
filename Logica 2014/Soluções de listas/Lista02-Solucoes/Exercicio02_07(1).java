public class Exercicio02_07 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis
		String entrada;
		double valorOrig, taxaJuros, valorFinal;
		int tempoAtraso;
		
		// Texto de entrada do programa.
		System.out.println("--- CALCULO DO VALOR REAJUSTADO DE UMA PRESTACAO ---");
		System.out.println();
		
		// Entrada de dados.
		System.out.print("Informe o valor original da prestacao......: ");
		entrada = System.console().readLine();
		valorOrig = Double.parseDouble(entrada);
		
		System.out.print("Informe o valor da taxa de juros utilizada.: ");
		entrada = System.console().readLine();
		taxaJuros = Double.parseDouble(entrada);
		
		System.out.print("Informe o tempo de atraso (em meses).......: ");
		entrada = System.console().readLine();
		tempoAtraso = Integer.parseInt(entrada);

		// Processamento.
		valorFinal = valorOrig + (valorOrig * taxaJuros / 100) * tempoAtraso;

		//	Saida de dados. 
		//	O %.2f sera substituido pelo valor da variavel "valorFinal" com
		// duas casas apos a virgula.
		System.out.printf("Valor atual da prestacao.: R$ %.2f\n", valorFinal);
	}

}