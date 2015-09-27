public class Exercicio2 {
	public static void main (String[] args) {
		int fun, anos;
		String sexo;
		double montante, sal, bonus;
		
		montante = 0;
		
		for (fun = 1; fun <= 10; fun++) {
		System.out.println ("Informe o numero de anos trabalhados na empresa:");
		anos = Integer.parseInt (System.console().readLine());
		System.out.println ("Informe o seu sexo (masculino/feminino):");
		sexo = System.console().readLine();
		
		if (sexo.equals("masculino") && anos >= 15) {
			System.out.println ("Informe o salario: ");
			sal = Double.parseDouble (System.console().readLine());
			bonus = (sal * 20) / 100; }
		else { 
			if (sexo.equals("feminino") && anos >= 10) {
			System.out.println ("Informe o salario: ");
			sal = Double.parseDouble (System.console().readLine());
			bonus = (sal * 25) / 100; }
			else { bonus = 300; } }
		System.out.printf ("Funcionario %d - Bonus = %.1f.\n", fun, bonus);
		montante = montante + bonus; }
		
		System.out.printf ("Montante = %f.", montante);
	}
}
		
		
		