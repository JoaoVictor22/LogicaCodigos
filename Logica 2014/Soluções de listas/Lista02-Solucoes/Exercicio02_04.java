public class Exercicio02_04 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		double tempCelsius, tempFar;
		
		// Texto de abertura do programa.
		System.out.println("--- CONVERSAO DE FARENHEIT PARA CELSIUS ---");
		System.out.println();
		
		// Entrada de dados
		System.out.print("Informe a temperatura em Farenheit.: ");
		entrada = System.console().readLine();
		tempFar = Double.parseDouble(entrada);

		// Processamento
		tempCelsius = 5*(tempFar - 32) / 9;

		// Saida de dados.
		System.out.printf("A temperatura em Celsius equivalente eh %f graus celsius.", tempCelsius);
	}

}