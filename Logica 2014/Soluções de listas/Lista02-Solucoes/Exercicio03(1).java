public class Exercicio03 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		int numero, d1, d2, d3, d4, d5;
		
		// Entrada de dados.
		System.out.print("Digite o numero inteiro desejado: ");
		entrada = System.console().readLine();
		numero = Integer.parseInt(entrada);
		
		// Processamento.
		d5 = numero % 10;
		d4 = numero / 10 % 10;
		d3 = numero / 100 % 10;
		d2 = numero / 1000 % 10;
		d1 = numero / 10000 % 10;
		
		// Saida de dados. 
		System.out.printf("Numero invertido: %d%d%d%d%d\n", d5, d4, d3, d2, d1);
	}

}