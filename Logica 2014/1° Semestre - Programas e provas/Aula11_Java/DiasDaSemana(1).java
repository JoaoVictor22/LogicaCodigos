public class DiasDaSemana {
	public static void main (String [] args) {
		int N;
		
		System.out.println ("Informe um numero:");
		N = Integer.parseInt (System.console().readLine());
		
		switch (N) {
		case 1: System.out.println ("Domingo");
			break;
		case 2: System.out.println ("Segunda-feira");
			break;
		case 3: System.out.println ("Terca-feira");
			break;
		case 4: System.out.println ("Quarta-feira");
			break;
		case 5: System.out.println ("Quinta-feira");
			break;
		case 6: System.out.println ("Sexta-feira");
			break;
		case 7: System.out.println ("Sabado");
			break;
		default: System.out.println ("Numero invalido"); }
		
	}
}
		