public class SomaRepita {
	public static void main (String[] args) {
		
		int contador, result;
		
		contador = 2;
		result = 0;
		
		do {
		result = result + contador;
		contador = contador + 2; 
		}while (contador <= 500);
		
		System.out.printf("Soma dos numeros pares entre 1 e 500: %d.\n", result);
	
	}
}
	
	