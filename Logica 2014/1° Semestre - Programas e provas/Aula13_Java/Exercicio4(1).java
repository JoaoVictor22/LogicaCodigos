public class Exercicio4 {
	public static void main (String[] args) {
	
		int sexo, num, homens, n_mulheres, cont;
		double altura, max, min, mulheres, N1;
		
		N1 = 0;
		max = 0;
		min = 0;
		n_mulheres = 0;
		mulheres = 0;
		homens = 0;
		
		System.out.println ("Informe o numero de pessoas do grupo:");
		num = Integer.parseInt (System.console().readLine());
		
		for (cont = 1; cont <= num; cont++) {
		System.out.println ("Informe o sexo (0 = masculino / 1 = feminino) e a altura do individuo:");
		sexo = Integer.parseInt (System.console().readLine());
		altura = Double.parseDouble (System.console().readLine());
		
		switch (sexo) {
			case 0 : homens++;
			break;
			case 1 : { n_mulheres++;
					   mulheres = mulheres + altura; }
			break; }
			
		max = Math.max(N1, altura);
		min = Math.min(N1, altura);
		
		N1 = altura;
		
		}
		
		mulheres = mulheres / n_mulheres;
		
		System.out.printf ("Maior altura = %.2f.\nMenor altura = %.2f.\nMedia de altura das mulheres: %.2f.\nNumero de homens: %d.\n", max, min, mulheres, homens);
		
	}
}
		
			
		
						