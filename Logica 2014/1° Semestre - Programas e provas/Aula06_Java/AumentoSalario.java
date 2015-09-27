public class AumentoSalario {
	public static void main (String[] args) {
		double sal, novosal;
		System.out.println("Informe o salario atual:");
		sal = Double.parseDouble (System.console().readLine());
		if (sal < 5000) { novosal = sal + (sal * 30 / 100);
		System.out.print("Salario reajustado =");
		System.out.println(novosal);
		} else { System.out.println("Nao havera reajuste de salario."); }
	}
}