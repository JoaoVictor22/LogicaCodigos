public class PotenciasDe3ComREPITA {
	public static void main (String[] args) {
		
		int expoente, result;
		
		expoente = 1;
		result = 1;
		
		do { 
		result = result * 3;
		System.out.printf ("3 ^ %d = %d.\n", expoente, result);
		expoente = expoente + 1;
		}  while ( expoente <= 15 ) ;
	
	}
}