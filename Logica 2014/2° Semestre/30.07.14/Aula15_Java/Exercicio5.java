public class Exercicio5 {
	public static void main (String[] args) {
		String CPF, novo_CPF="", primeira, segunda, terceira, quarta;
		char numero;
		int cont=0, comp, erro=0;
		
		System.out.println("Por favor informe seu CPF (11 digitos):");
		CPF = System.console().readLine();
		comp = CPF.length();
		
		if (comp == 11) {
		while(cont<comp) {
		numero = CPF.charAt(cont);		
		switch (numero) {
		case '0' : break;
		case '1' : break;
		case '2' : break;
		case '3' : break;
		case '4' : break;
		case '5' : break;
		case '6' : break;
		case '7' : break;
		case '8' : break;
		case '9' : break;
		default : erro++;
		} cont++; }
		if (erro==0) {
		primeira = CPF.substring(0, 3);
		segunda = CPF.substring(3, 6);
		terceira = CPF.substring(6, 9);
		quarta = CPF.substring(9, 11);
		novo_CPF = primeira + "." + segunda + "." + terceira + "-" + quarta;
		System.out.println(novo_CPF);
		} else {
		System.out.println("Voce informou caracteres invalidos."); } }	
		else {
		System.out.println("Voce informou um numero com extensao inapropriada.");
		}
	}
}
		