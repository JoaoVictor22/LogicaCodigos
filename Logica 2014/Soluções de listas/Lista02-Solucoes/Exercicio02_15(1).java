public class Exercicio02_15 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis
		String entrada;
		int a, b, c, d, prodPrimTerc, somaSegQua;
		
		// Entrada de dados
		System.out.println("Digite abaixo quatro numeros inteiros:");
		entrada = System.console().readLine();
		a = Integer.parseInt(entrada);
		entrada = System.console().readLine();
		b = Integer.parseInt(entrada);
		entrada = System.console().readLine();
		c = Integer.parseInt(entrada);
		entrada = System.console().readLine();
		d = Integer.parseInt(entrada);
		
		// Processamento.
		prodPrimTerc = a * c;
		somaSegQua = b + d;
		
		// Saida de dados.
		System.out.printf("O produto do primeiro valor pelo terceiro eh %d\n", prodPrimTerc);
		System.out.printf("A soma do segundo valor com o quarto eh %d\n", somaSegQua);
	}

}