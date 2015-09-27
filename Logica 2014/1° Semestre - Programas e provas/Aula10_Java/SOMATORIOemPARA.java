public class SOMATORIOemPARA {
	public static void main (String[] args) {
		
		int contador, result;
		
		for (result= 0, contador = 2; contador <= 500; contador = contador + 2) {
		result = result + contador; }
		
		System.out.printf("A soma de todos os numeros pares entre 1 e 500 e igual a: %d.\n", result);

	}
}