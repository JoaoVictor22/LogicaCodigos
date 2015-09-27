/* Escreva um programa em Java que leia uma String contendo uma palavra digitada
pelo usuário, retorne as letras desta String na tela com sua respectiva posição
na String. Peça para o usuário digitar um caractere a ser verificado se pertence
a String digitada anteriormente, retornando o valor da posição do caractere.
OBS.: Cuide, pois o caractere pode aparecer mais de uma vez na String, verifique 
todas as ocorrências.*/

public class Exercicio3 {
	public static void main (String[] args) {
		String palavra;	
		char letra, letrainformada;
		int comp, cont = 0;
		
		System.out.println("Informe uma palavra:");
		palavra = System.console().readLine();
		comp = palavra.length();
		comp--;
		
		while(cont<=comp) {
		letra = palavra.charAt(cont);
		System.out.printf("%c - posicao %d\n", letra, cont);
		cont++;
		}
		
		System.out.println("\nInforme uma letra para que seja analisada:\n");
		letrainformada = System.console().readLine().charAt(0);
		for(cont = 0; cont<=comp; cont++) {
		if (palavra.charAt(cont) == letrainformada) {
		System.out.printf("\nEste caractere ocorre na posicao %d da String.\n", cont);
		} }
	
	}
}