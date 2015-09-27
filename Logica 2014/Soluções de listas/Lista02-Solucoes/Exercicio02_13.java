public class Exercicio02_13 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		int a, b, c, somaQuad;
		
		// Entrada de dados
		System.out.println("Digite abaixo tres numeros inteiros:");
		entrada = System.console().readLine();
		a = Integer.parseInt(entrada);
		entrada = System.console().readLine();
		b = Integer.parseInt(entrada);
		entrada = System.console().readLine();
		c = Integer.parseInt(entrada);
		
		// Processamento.
		somaQuad = a*a + b*b + c*c;
		
		// Saida de dados.
		System.out.printf("A soma dos quadrados dos numeros digitados eh %d\n", somaQuad);
	}

}