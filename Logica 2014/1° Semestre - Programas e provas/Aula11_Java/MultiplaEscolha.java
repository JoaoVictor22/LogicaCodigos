public class MultiplaEscolha {
	public static void main (String [] args) {
	
		int N1, N2, soma, div, mult, sub, op;
		
		System.out.println ("Por favor escolha uma das opcoes abaixo:");
		System.out.println ("Digite 0 para soma\nDigite 1 para subtracao\nDigite 2 para Divisao\nDigite 3 para Multiplicacao");
		op = Integer.parseInt (System.console().readLine());
		
		System.out.println ("Informe os valores de N1 e N2");
		N1 = Integer.parseInt (System.console().readLine());
		N2 = Integer.parseInt (System.console().readLine());
				
		switch (op) {
		case 0: soma = N1 + N2;
				System.out.printf ("%d + %d = %d", N1, N2, soma);
				break;
		case 1: sub = N1 - N2;
				System.out.printf ("%d - %d = %d", N1, N2, sub);
				break;
		case 2: div = N1 / N2;
				System.out.printf ("%d / %d = %d", N1, N2, div);
				break;
		case 3: mult = N1 * N2  ;
				System.out.printf ("%d * %d = %d", N1, N2, mult);
				break;
		default: System.out.printf ("Opcao invalida.");
		}
	}
}