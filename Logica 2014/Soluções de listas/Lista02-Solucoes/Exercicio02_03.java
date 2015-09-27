public class Exercicio02_03 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis
		String entrada;
		double tempCelsius, tempFar;
		
		// Texto de abertura do programa.
		System.out.println("--- CONVERSAO DE CELSIUS PARA FARENHEIT ---");
		System.out.println();
		
		// Entrada de dados
		System.out.print("Informe a temperatura em Celsius.: ");
		entrada = System.console().readLine();
		tempCelsius = Double.parseDouble(entrada);

		// Processamento
		tempFar = (9*tempCelsius + 160) / 5;

		// Saida de dados.
		System.out.printf("A temperatura em Farenheit equivalente eh %f graus farenheit.", tempFar);
	}
	
}