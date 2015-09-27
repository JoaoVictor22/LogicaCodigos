public class Exercicio02_16 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis
		String entrada;
		double salario, percReajuste, novoSalario;
		
		// Entrada de dados.
		System.out.print("Digite o salario atual do funcionario: ");
		entrada = System.console().readLine();
		salario = Double.parseDouble(entrada);
		
		System.out.print("Digite o percentual de reajuste: ");
		entrada = System.console().readLine();
		percReajuste = Double.parseDouble(entrada);
		
		// Processamento.
		novoSalario = salario + salario * percReajuste / 100;

		// Saida de dados.
		// O %.2f sera substituido pelo valor da variavel "novoSalario" com
		// duas casas apos a virgula.
		System.out.printf("O novo salario do funcionario sera R$ %.2f\n", novoSalario);
	}

}