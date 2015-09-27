public class Exercicio09 {
	public static void main(String[] args) {
		int num, cont;
		
		System.out.print("Digite um numero inteiro: ");
		num = Integer.parseInt(System.console().readLine());
		
		System.out.println("\nDivisores primos do numero: ");
		for(cont = 2; cont <= num; cont++) {
			if(num % cont == 0 && Calculos.ehPrimo(cont))
				System.out.println(cont);
		}
	}
}