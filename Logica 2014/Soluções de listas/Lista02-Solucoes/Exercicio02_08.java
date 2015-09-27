public class Exercicio02_08 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		double altura, largura, comprimento, volume;
		
		// Texto de abertura do programa.
		System.out.println("--- CALCULO DO VOLUME DE UMA CAIXA RETANGULAR ---");
		System.out.println();
		
		// Entrada de dados.
		System.out.print("Informe a altura da caixa (em centimetros)......: ");
		entrada = System.console().readLine();
		altura = Double.parseDouble(entrada);
		
		System.out.print("Informe a largura da caixa (em centimetros).....: ");
		entrada = System.console().readLine();
		largura = Double.parseDouble(entrada);
		
		System.out.print("Informe o comprimento da caixa (em centimetros).: ");
		entrada = System.console().readLine();
		comprimento = Double.parseDouble(entrada);

		// Processamento.
		volume = altura * largura * comprimento;

		// Saida de dados.
		System.out.printf("Volume da caixa = %f centimetros cubicos. \n", volume);
	}

}