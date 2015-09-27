public class Exercicio02_02 {

	public static void main(String[] args) {
	
		// Declaracao de variaveis
		String entrada;
		double valorHA, percINSS, salarioBruto, salarioLiquido;
		int horasTrab;
		
		// Texto de apresentacao do programa.
		System.out.println("--- CALCULO DO SALARIO LIQUIDO DE UM PROFESSOR ---");
		System.out.println();
		
		// Entrada de dados
		System.out.print("Horas trabalhadas pelo professor no mes.: ");
		entrada = System.console().readLine();
		horasTrab = Integer.parseInt(entrada);
		
		System.out.print("Valor pago ao professor por hora-aula...: ");
		entrada = System.console().readLine();
		valorHA = Double.parseDouble(entrada);
		
		System.out.print("Percentual de desconto do INSS..........: ");
		entrada = System.console().readLine();
		percINSS = Double.parseDouble(entrada);
		
		// Processamento
		salarioBruto = horasTrab * valorHA;
		salarioLiquido = salarioBruto - salarioBruto*percINSS/100;
		
		// Saida dos resultados. Veja que no printf usei %.2f em vez de %f. Isso faz com que o 
		// numero apareça arredondado para duas casas apos a virgula.
		System.out.printf("O salario liquido que o professor recebera sera R$ %.2f\n", salarioLiquido);
	}

}