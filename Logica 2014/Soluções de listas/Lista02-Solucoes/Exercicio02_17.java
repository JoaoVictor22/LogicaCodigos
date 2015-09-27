public class Exercicio02_17 {

	public static void main(String[] args) {

		// Declaracao de variaveis
		String entrada;
		int votosA, votosB, votosC, votosBrancos, votosNulos, totalEleitores;
		double percA, percB, percC, percBrancos, percNulos;
		
		// Entrada de dados
		System.out.print("Digite a quantidade de votos recebidos pelo candidato A: ");
		entrada = System.console().readLine();
		votosA = Integer.parseInt(entrada);
		
		System.out.print("Digite a quantidade de votos recebidos pelo candidato B: ");
		entrada = System.console().readLine();
		votosB = Integer.parseInt(entrada);
		
		System.out.print("Digite a quantidade de votos recebidos pelo candidato C: ");
		entrada = System.console().readLine();
		votosC = Integer.parseInt(entrada);
		
		System.out.print("Digite a quantidade de votos em branco: ");
		entrada = System.console().readLine();
		votosBrancos = Integer.parseInt(entrada);
		
		System.out.print("Digite a quantidade de votos nulos: ");
		entrada = System.console().readLine();
		votosNulos = Integer.parseInt(entrada);
		
		// Processamento.
		totalEleitores = votosA + votosB + votosC + votosNulos + votosBrancos;
		percA = votosA * 100.0 / totalEleitores;
		percB = votosB * 100.0 / totalEleitores;
		percC = votosC * 100.0 / totalEleitores;
		percBrancos = votosBrancos * 100.0 / totalEleitores;
		percNulos = votosNulos * 100.0 / totalEleitores;
		
		// Saida de dados. Para inserir um % com printf eh necessario colocar dois sinais de porcentagem.
		System.out.printf("Um total de %d pessoas votaram na eleicao.\n", totalEleitores);
		System.out.printf("Percentual de votos do candidato A.: %.2f%%\n", percA);
		System.out.printf("Percentual de votos do candidato B.: %.2f%%\n", percB);
		System.out.printf("Percentual de votos do candidato C.: %.2f%%\n", percC);
		System.out.printf("Percentual de votos brancos........: %.2f%%\n", percBrancos);
		System.out.printf("Percentual de votos nulos..........: %.2f%%\n", percNulos);
	}

}