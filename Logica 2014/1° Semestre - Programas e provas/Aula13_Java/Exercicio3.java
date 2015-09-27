public class Exercicio3 {

	public static void main (String[] args) {
	
		int N1, maior, menor, cont = 2;
		
		System.out.println ("Informe 20 numeros inteiros a fim de que sejam analisados:");
		N1 = Integer.parseInt (System.console().readLine());
		
		maior = N1;
		menor = N1;
		
		for (; cont <= 20; cont++){
		N1 = Integer.parseInt (System.console().readLine());
		
		maior = N1 > maior ? N1 : maior;
		menor = N1 < menor ? N1 : menor;
		
		}
		
		System.out.printf ("Maior = %d \nMenor = %d", maior, menor);
	
	}
}
		