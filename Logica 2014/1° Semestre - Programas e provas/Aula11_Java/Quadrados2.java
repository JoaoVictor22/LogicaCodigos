public class Quadrados2 {
	public static void main (String [] args) {
		int cont, cont1, cont2, N;
		
		System.out.println ("Informe um numero:\n");
		N = Integer.parseInt (System.console().readLine());
		
		cont = 1;
		

		for (cont = 1; cont <= N; cont++)	{
		for (cont1 = 1; cont1 < N; cont1++) {
		System.out.print ("*"); }
		cont2 = N;
		for ( ; cont2 == N; cont2++) {
		System.out.println("*\n"); } }
		
	
		}
	}