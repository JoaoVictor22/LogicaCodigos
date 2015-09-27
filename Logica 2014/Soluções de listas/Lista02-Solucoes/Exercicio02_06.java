public class Exercicio02_06 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		double tempoGasto, velocMedia, distancia, gastoComb;
		
		// Texto de abertura do programa
		System.out.println("--- CALCULO DO GASTO DE UMA VIAGEM ---");
		System.out.println("Considerando um automovel que faz 12 km/l");
		System.out.println();
		
		// Entrada de dados.
		System.out.print("Informe o tempo gasto(em horas)......: ");
		entrada = System.console().readLine();
		tempoGasto = Double.parseDouble(entrada);
		
		System.out.print("Informe a velocidade media(em km/h)..: ");
		entrada = System.console().readLine();
		velocMedia = Double.parseDouble(entrada);

		// Processamento.
		distancia = tempoGasto * velocMedia;
		gastoComb = distancia / 12;

		// Saida de dados.
		System.out.println("--- ESTATISTICAS DA VIAGEM ---");
		System.out.printf("Velocidade media.....: %f km/h \n", velocMedia);
		System.out.printf("Tempo Gasto..........: %f horas \n", tempoGasto);
		System.out.printf("Distancia percorrida.: %f km \n", distancia);
		System.out.printf("Combustivel gasto....: %f litros \n", gastoComb);
	}

}