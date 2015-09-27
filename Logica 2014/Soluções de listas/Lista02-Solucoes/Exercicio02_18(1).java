public class Exercicio02_18 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis.
		String entrada;
		double altura, raio, area, litrosTinta, numLatas, custo;
		
		// Entrada de dados.
		System.out.print("Digite a altura do cilindro (em metros).: ");
		entrada = System.console().readLine();
		altura = Double.parseDouble(entrada);
		
		System.out.print("Digite o raio do cilindro (em metros)...: ");
		entrada = System.console().readLine();
		raio = Double.parseDouble(entrada);
		
		// Processamento.
		area = 2 * 3.14159 * raio * (altura + raio);
		litrosTinta = area / 3;
		numLatas = litrosTinta / 5;
		custo = numLatas * 50;
		
		// Saida de dados. A mascara %.0f no printf faz com que o numero real apareca arredondado para
		// um inteiro (sem casas apos a virgula).
		System.out.printf("Quantidade de latas de tinta necessarias para pintar o tanque: %.0f\n", numLatas);
		System.out.printf("Custo da pintura: R$ %.2f\n", custo);
	}

}