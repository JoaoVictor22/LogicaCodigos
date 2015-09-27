public class SalLiqProfessor {
	public static void main (String[] args) {
		double valor_h_aula, sal_bruto, per_INSS, INSS, sal_liq;
		int num_horas;
		System.out.println("Entre com o valor da hora aula:");
		valor_h_aula = Double.parseDouble (System.console().readLine());
		System.out.println("Entre com o numero de horas aula:");
		num_horas = Integer.parseInt (System.console().readLine());
		sal_bruto = valor_h_aula * num_horas;
		System.out.println("Entre com o percentual de desconto do INSS:");
		per_INSS = Double.parseDouble (System.console().readLine());
		INSS = per_INSS / 100 * sal_bruto;
		sal_liq = sal_bruto - INSS;
		System.out.println("Salario Liquido:");
		System.out.print(sal_liq);		
	}
}
	
	