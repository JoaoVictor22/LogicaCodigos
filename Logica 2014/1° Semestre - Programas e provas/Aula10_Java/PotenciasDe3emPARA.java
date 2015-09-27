public class PotenciasDe3emPARA {
	public static void main (String[]args) {
		
		int expoente, result;
		
		for (result = 1, expoente = 1; expoente <= 15; expoente++) {
		result = result * 3;
		System.out.printf ("3 ^ %d = %d.\n", expoente, result); }
	
	}
}