public class Exercicio02 {
	public static void main (String[] args) {
		int numero, soma_divisores = 0, cont = 1;
	
		System.out.println("Informe um numero para que seja analisado:");
		numero = Integer.parseInt(System.console().readLine());
		
		for( ; cont < numero; cont++) {
		if (numero % cont == 0) {
		soma_divisores = soma_divisores + cont;
		} }
		
		if (soma_divisores == numero) {
		System.out.printf("%d e um numero perfeito!", numero); 
		} else { System.out.printf ("%d nao e um numero perfeito.", numero); }
	
	}
}

		