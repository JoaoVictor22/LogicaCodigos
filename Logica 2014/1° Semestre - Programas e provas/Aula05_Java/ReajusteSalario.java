public class ReajusteSalario {
	public static void main (String[] args) {
		double salmens, per_reajuste, novo_sal;
		System.out.print("Informe o salario mensal:");
		salmens = Double.parseDouble (System.console().readLine());
		System.out.print("Informe o percentual de reajuste:");
		per_reajuste = Double.parseDouble (System.console().readLine());
		novo_sal = (salmens * per_reajuste ) + salmens;
		System.out.print("Novo salario =");
		System.out.print(novo_sal);
	}
}
