/*Escreva um programa em Java que leia uma palavra sem acentos e cedilha e mostre 
essa palavra em letras mai�sculas e min�sculas. Use apenas as estruturas de contro-
le que estudamos e os m�todos de String que j� estudamos.*/


public class Exercicio4 {
	public static void main (String[] args) {
	
		String palavra;
		
		System.out.println("Informe uma palavra se cedilhas nem acentos:");
		palavra = System.console().readLine();
		
		palavra = palavra.toUpperCase();
		System.out.println(palavra);
		
		palavra = palavra.toLowerCase();
		System.out.println(palavra);
		
	}
}
		