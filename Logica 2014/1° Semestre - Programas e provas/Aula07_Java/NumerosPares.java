public class NumerosPares {
	public static void main (String[] args) {
		int contador, soma;
			soma = 0;
			contador = 2;
				while (contador >= 2 && contador <= 500) {
				soma = soma + contador;
				contador = contador + 2; }
				System.out.print (soma);
	}
}