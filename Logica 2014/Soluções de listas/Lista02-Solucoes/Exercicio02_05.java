public class Exercicio02_05 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		double raio, altura, volume;
		
		// Texto de abertura do programa.
		System.out.println("--- CALCULO DO VOLUME DE UMA LATA DE OLEO ---");
		System.out.println();
		
		// Entrada de dados
		System.out.print("Informe o raio da lata (em centimetros)....: ");
		entrada = System.console().readLine();
		raio = Double.parseDouble(entrada);
		
		System.out.print("Informe a altura da lata (em centimetros)..: ");
		entrada = System.console().readLine();
		altura = Double.parseDouble(entrada);

		// Processamento.
		volume = 3.14159 * raio * raio * altura;

		// Saida de dados.
		System.out.printf("O volume da lata de oleo eh %f centimetros cubicos.", volume);
	}

}