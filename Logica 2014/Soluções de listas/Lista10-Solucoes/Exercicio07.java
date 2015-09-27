public class Exercicio07 {
	static int buscaOperador(String expressao) {
		int posOperador = expressao.indexOf("+");
		if(posOperador == -1)
			posOperador = expressao.indexOf("-");
			if(posOperador == -1)
				posOperador = expressao.indexOf("*");
				if(posOperador == -1)
					posOperador = expressao.indexOf("/");
		return posOperador;
	}
	
	static boolean ehNumero(String valor) {
		int pos;
		for(pos = 0; pos < valor.length(); pos++) {
			if(valor.charAt(pos) < '0' || valor.charAt(pos) > '9')
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String expressao, operando;
		int posOperador, numero1, numero2;
		
		do {
			// Le a expressao
			System.out.print("Expressao: ");
			expressao = System.console().readLine();
			
			// Retira os espaços em branco
			expressao = expressao.replace(" ", "");
			
			if(!expressao.equals("sair")) {
				// Encontra a posição do operador
				posOperador = buscaOperador(expressao);
				
				if(posOperador == -1) {
					System.out.println("Nenhum operador valido foi encontrado na expressao.");
				} else {
				
					// Extrai o primeiro número
					operando = expressao.substring(0, posOperador);
					if(ehNumero(operando)) {
						numero1 = Integer.parseInt(operando);
						
						// Extrai o segundo número
						operando = expressao.substring(posOperador+1);
						if(ehNumero(operando)) {
							numero2 = Integer.parseInt(operando);
							
							// Faz a conta
							switch(expressao.charAt(posOperador)) {
								case '+' : System.out.printf("%d\n", numero1 + numero2); break;
								case '-' : System.out.printf("%d\n", numero1 - numero2); break;
								case '*' : System.out.printf("%d\n", numero1 * numero2); break;
								case '/' : System.out.printf("%d\n", numero1 / numero2); break;
							}
							
						} else {
							System.out.println("A expressao deve conter apenas numeros e um operador.");
						}
					} else {
						System.out.println("A expressao deve conter apenas numeros e um operador.");
					}
				}
			}
		} while(!expressao.equals("sair"));
	}
}




