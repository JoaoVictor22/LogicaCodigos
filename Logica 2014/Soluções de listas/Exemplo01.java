public class Exemplo01 {

	static int[] leVetor(int tam, String nome) {
		int cont;
		int[] vetor = new int[tam];
		for(cont = 0; cont < tam; cont++) {
			System.out.printf("%s[%d]: ", nome, cont);
			vetor[cont] = Integer.parseInt(System.console().readLine());		
		}
		return vetor;
	}
	
	static void mostraVetor(int[] vetor, String nome) {
		int cont;
		for(cont = 0; cont < vetor.length; cont++) {
			System.out.printf("%s[%d] = %d\n", nome, cont, vetor[cont]);
		}
	}

	public static void main(String[] args) {
	
		int[] a, b, soma;
		int cont;
		
		a = leVetor(10, "A");
		
		System.out.println();
		
		b = leVetor(10, "B");
		
		soma = new int[10];
		
		for(cont = 0; cont < 10; cont++) {
			soma[cont] = a[cont] + b[cont];
		}
		
		System.out.println("Vetor soma:");
		mostraVetor(soma, "Soma");
	}

}