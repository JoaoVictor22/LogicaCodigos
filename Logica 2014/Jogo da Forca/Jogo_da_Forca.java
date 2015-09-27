public class Jogo_da_Forca {
	public static void main (String[] args) {
		
		boolean continuar = true;
		String A, Y, Z;
		int e, comp, end;
		char s;
		String palavra = "", palavra2, X = " ", letras = "";
		
		System.out.println();
		System.out.println("-------------  JOGO DA FORCA  -------------\n");
		System.out.println("Instrucoes: Insira letras pelo teclado a fim de tentar adivinhar a palavra oculta.\n");
		while (continuar) {
		e = 0;
		comp = 0;
		end = 0;
		letras = "";
		int i = (int) (1 + Math.random() * 10);
		System.out.println("Aguarde enquanto a palavra e computada em nosso banco de dados...\n");
		System.out.println("Palavra processada, confira sua dica e comece a jogar.\n");
				
		switch (i) {  
		case 1 : palavra = "l i b e r d a d e"; X = "_ _ _ _ _ _ _ _ _"; System.out.println("Dica: E um estado de espirito."); break;
		case 2 : palavra = "h i p o t e n u s a"; X = "_ _ _ _ _ _ _ _ _ _"; System.out.println("Dica: Relativo a matematica."); break;
		case 3 : palavra = "h i p e r m e t r o p i a";	X = "_ _ _ _ _ _ _ _ _ _ _ _ _"; System.out.println("Dica: Doenca"); break;
		case 4 : palavra = "i n e x o r a v e l"; X = "_ _ _ _ _ _ _ _ _ _";  System.out.println("Dica: Caracteristica da morte."); break;
		case 5 : palavra = "r e t i f i c a"; X = "_ _ _ _ _ _ _ _"; System.out.println("Dica: Verbo na segunda pessoa."); break;
		case 6 : palavra = "o n i p o t e n c i a"; X = "_ _ _ _ _ _ _ _ _ _ _"; System.out.println("Dica: Muitos governantes atuais acreditam que possuem."); break;
		case 7 : palavra = "d e m o c r a c i a"; X = "_ _ _ _ _ _ _ _ _ _"; System.out.println("Dica: Regime politico."); break;
		case 8 : palavra = "s i n t o n i a"; X = "_ _ _ _ _ _ _ _"; System.out.println("Dica: Relacao harmonica."); break;
		case 9 : palavra = "p i n a c o t e c a"; X = "_ _ _ _ _ _ _ _ _ _"; System.out.println("Dica: Relativo a arte."); break;
		case 10 : palavra = "r e l a m p a g o"; X = "_ _ _ _ _ _ _ _ _"; System.out.println("Dica: Relativo a tempestade."); break; }
		
		comp = palavra.length();
		palavra2 = palavra;
		System.out.printf ("\n%s\n", X);
		do {
		System.out.println("\nInforme uma letra:\n");
		A = System.console().readLine();
		if(!(letras.contains(A))) {
		letras = A + letras;
					if (e == 6 && !(palavra.equals(X))) {
					System.out.println("Fim de jogo, voce perdeu!"); }
					else {
						palavra = palavra2;
						if (palavra.contains(A)) {
						for (int cont = 0; comp != 0 && palavra.contains(A);cont++) {
						if (cont != 0) {	
						end = palavra.indexOf(A) + end; }
						else {end = palavra.indexOf(A); }
						end++;	
						palavra = palavra2;
						palavra = palavra.substring(end);
						end--;
						if (end == 0) {
						Y = X.substring(1);
						X = A + Y; }
						else { Y = X.substring(0, end);
							   end += 1;
						       Z = X.substring(end);
							   X = Y + A + Z; } } 
						if (X.contains("oo")) {
						X = X.replace("oo", " o"); }
						System.out.printf ("\n%s\n", X); } else { e++;}} 
							if(e != 0) {
							switch (e) {
								case 1 : System.out.print("\n   0   \n\n"); break;
								case 2 : System.out.print("\n   0   \n   |   \n\n"); break;
								case 3 : System.out.print("\n   0   \n  /|   \n\n"); break;
								case 4 : System.out.print("\n   0   \n  /|\\ \n\n"); break;
								case 5 : System.out.print("\n   0   \n  /|\\ \n  /    \n\n"); break;
								case 6 : System.out.print("\n   0   \n  /|\\ \n  / \\ \n\n"); break; } } } else { System.out.println("Letra ja informada."); }
						} while (e < 6 && !(palavra2.equals(X)));
				if (palavra2.equals(X)) {
				System.out.println("\nParabens! Voce venceu!\nDeseja jogar novamente? (s/n)\n");
				s = System.console().readLine().charAt(0);
				if (s == 's') {	continuar = true; } else { continuar = false; }
				} else { System.out.println("\nQue pena! Voce perdeu!\nDeseja jogar novamente? (s/n)\n"); 
				s = System.console( ).readLine().charAt(0);
				if (s == 's') {	continuar = true; } else { continuar = false; } } }
						
}
}
						
						
						
						
		