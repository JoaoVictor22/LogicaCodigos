public class Exercicio03 {
	public static void main (String[] args) {
		String sequencia, sequencia_invertida = "";
		char letra;
		int comp, caracteres_invalidos = 0;
		
		System.out.println("Informe uma sequencia de DNA contendo apenas as letras A, C, G e T:");
		sequencia = System.console().readLine();
		
		sequencia = sequencia.toUpperCase();
		comp = sequencia.length();
		comp--;
		
		for(int cont = 0; cont <= comp; cont++) {
		letra = sequencia.charAt(cont);
		switch (letra) {
		case 'A' : break;
		case 'C' : break;
		case 'T' : break;
		case 'G' : break;
		default : caracteres_invalidos++; } }
		
		if (caracteres_invalidos == 0) {
		for (int cont = 0; cont <= comp; cont++) {
		letra = sequencia.charAt(cont);
		switch (letra) {
		case 'A' : sequencia_invertida = 'T' + sequencia_invertida; break;
		case 'T' : sequencia_invertida = 'A' + sequencia_invertida; break;
		case 'G' : sequencia_invertida = 'C' + sequencia_invertida; break;
		case 'C' : sequencia_invertida = 'G' + sequencia_invertida; break; }
		} System.out.printf("Complementar = %s", sequencia_invertida); }
		else { System.out.printf("Sequencia incorreta. %d caracteres invalidos encontrados.", caracteres_invalidos); } 
		
	}
}
		