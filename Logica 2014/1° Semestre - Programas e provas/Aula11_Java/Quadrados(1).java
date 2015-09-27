public class Quadrados {
	public static void main (String [] args) {
		int cont, cont1, cont2, N;
		
		System.out.println ("Informe um numero:");
		N = Integer.parseInt (System.console().readLine());
		
		cont = 1;
		cont1 = 1;
		
		while (cont <= N) {
		while (cont1 <= N) {
		System.out.print ("*"); 
		cont1 = cont1 + 1; }
		System.out.println("\n");
		cont = cont + 1 		}
		
	
		
		}
	}
