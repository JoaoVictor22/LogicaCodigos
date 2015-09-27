public class Exercicio1 {
	public static void main (String[] args) {
		String palavra, nova_palavra = "";
		char letra;
		int comp, numero_consoantes = 0, cont = 0;
		
		System.out.println("Informe uma palavra:");
		palavra = System.console().readLine();
		
		comp = palavra.length();
		comp--;
		palavra= palavra.toLowerCase();
		
		for(; cont <= comp; cont++) {
		letra = palavra.charAt(cont);
		switch (letra) {
		case 'a' : nova_palavra = nova_palavra + "a "; break;
		case 'e' : nova_palavra = nova_palavra + "e "; break;
		case 'i' : nova_palavra = nova_palavra + "i "; break;
		case 'o' : nova_palavra = nova_palavra + "o "; break;
		case 'u' : nova_palavra = nova_palavra + "u "; break;
		default : numero_consoantes++; } }
		
		System.out.printf("Vogais na palavra: %s\n", nova_palavra);
		System.out.printf("Numero de consoantes na palavra: %d\n", numero_consoantes);
		
	}
}