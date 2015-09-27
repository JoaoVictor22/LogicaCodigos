public class Exercicio02_12 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		int A, B, result;
		
		// Texto de abertura do programa.
		System.out.println("--- CALCULO DO QUADRADO DA DIFERENCA DE A E B ---");
		System.out.println();
		
		// Entrada de dados.
		System.out.print("Informe o valor de A.: ");
		entrada = System.console().readLine();
		A = Integer.parseInt(entrada);
		
		System.out.print("Informe o valor de B.: ");
		entrada = System.console().readLine();
		B = Integer.parseInt(entrada);

		// Processamento.
		result = (A - B)*(A - B);

		// Saida de dados.
		System.out.printf("Resultado = %d\n", result);
	}

}