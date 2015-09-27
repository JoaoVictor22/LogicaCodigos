public class Exercicio1 {
	public static void main (String[] args) {
		
		double sal, novosal;
		int fun;
		
		for (fun = 1; fun <= 10; fun++) {
		System.out.print ("Informe o seu salario: ");
		sal = Double.parseDouble (System.console().readLine());
		if (sal < 1000) {
		novosal = ((sal * 55) / 100) + sal;
		} else { 
			if (sal >= 1000 && sal <= 2500) {
			novosal = ((sal * 30) / 100) + sal ;
			} else {
				novosal = ((sal * 20) / 100) + sal ;
				}
			}
		System.out.printf ("Salario reajustado = %.1f.\n", novosal);
		}
	}
}