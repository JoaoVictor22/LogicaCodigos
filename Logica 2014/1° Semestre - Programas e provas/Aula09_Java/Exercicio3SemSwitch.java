public class Exercicio3SemSwitch {
	public static void main (String [] args) {		
		int n;
		System.out.print ("Informe o numero a ser analisado:");
		n = Integer.parseInt (System.console().readLine());
		
		if (n > 0 && n <= 12) {
			if (n == 1) { System.out.println ("Janeiro"); }
			if (n == 2) { System.out.println ("Fevereiro"); }
			if (n == 3) { System.out.println ("Marco"); }
			if (n == 4) { System.out.println ("Abril"); }
			if (n == 5) { System.out.println ("Maio"); }
			if (n == 6) { System.out.println ("Junho"); }
			if (n == 7) { System.out.println ("Julho"); }
			if (n == 8) { System.out.println ("Agosto"); }
			if (n == 9) { System.out.println ("Setembro"); }
			if (n == 10) { System.out.println ("Outubro"); }
			if (n == 11) { System.out.println ("Novembro"); }
			if (n == 12) { System.out.println ("Dezembro"); }
		} else { System.out.println ("Numero invalido!"); }
	}
}
			
			