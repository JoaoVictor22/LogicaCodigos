public class Exercicio02_11 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		int A, B, tmp;
		
		// Apresentacao do texto de abertura do programa.
		System.out.println("--- TROCA VALOR DE VARIAVEIS ---");
		System.out.println();
		
		// Entrada de dados.
		System.out.print("Informe o valor da variavel A.: ");
		entrada = System.console().readLine();
		A = Integer.parseInt(entrada);
		
		System.out.print("Informe o valor da variavel B.: ");
		entrada = System.console().readLine();
		B = Integer.parseInt(entrada);

		// Troca dos valores das variaveis. Usou-se aqui uma terceira variavel para guardar
		// temporariamente o valor da variavel A.
		tmp = A;
		A = B;
		B = tmp;

		// Saida de dados.
		System.out.printf("Valor final de A.: %d\n", A);
		System.out.printf("Valor final de B.: %d\n", B);
	}

}