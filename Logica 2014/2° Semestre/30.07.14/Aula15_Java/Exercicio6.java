/*Escreva um programa em Java que leia um nome completo digitado pelo usuário, 
retire o último e oprimeiro nome e monte um e-mail no seguinte formato:
			primeironome.ultimonome@riogrande.ifrs.edu.br                 */
			
public class Exercicio6 {
	public static void main (String[] args) {
		String nome, email, primeironome="", sobrenome="";
		int cont=0, comp;
		char caractere;
				
		System.out.println("Informe o seu nome completo:");
		nome = System.console().readLine();
		nome = nome.toLowerCase();
		comp = nome.length();
		
		caractere = nome.charAt(cont);
		while (caractere != ' ') {
		primeironome += caractere;
		cont++;
		caractere = nome.charAt(cont);
		}
		
		comp--;
		
		caractere = nome.charAt(comp);
		while (caractere != ' ') {
		sobrenome = caractere + sobrenome;
		comp--;
		caractere = nome.charAt(comp); }
		
		email = primeironome+"."+sobrenome+"@riogrande.ifrs.edu.br";
		
		System.out.println(email);
	}
}

		
		
		