public class Exercicio02_14 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis
		String entrada;
		int a, b, c, quadSoma;
		
		// Entrada de dados
		System.out.println("Digite abaixo tres numeros inteiros:");
		entrada = System.console().readLine();
		a = Integer.parseInt(entrada);
		entrada = System.console().readLine();
		b = Integer.parseInt(entrada);
		entrada = System.console().readLine();
		c = Integer.parseInt(entrada);
		
		// Processamento.
		quadSoma = (a + b + c) * (a + b + c);
		
		// Saida de dados.
		System.out.printf("O quadrado da soma dos numeros digitados eh %d\n", quadSoma);
	}

}