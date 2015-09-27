public class Exercicio02_01 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis
		String entrada;
		double raio, area;
		
		// Texto de apresentacao do programa (apenas para bonito :) )
		System.out.println("--- CALCULO DA AREA DE UM CIRCULO ---");
		System.out.println();
		
		// Entrada de dados
		System.out.print("Informe a medida do raio do circulo (em metros): ");
		entrada = System.console().readLine();
		raio = Double.parseDouble(entrada);
		
		// Processamento
		area = 3.14159 * raio * raio;
		
		// Mostra resultado
		System.out.printf("A area do circulo eh %f metros quadrados.\n", area);
	}

}