public class Exercicio01 {
	public static void main (String[] args) {
		String nome, saudacao;
		char genero;
		
		do {  System.out.println("Informe seu nome:");
			  nome = System.console().readLine();
			  System.out.println("Informe seu genero(M para masculino e F para feminino): ");
			  genero = System.console().readLine().charAt(0); } while(genero != 'M' && genero != 'F');
			 
		saudacao = genero == 'M' ? "bem-vindo" : "bem-vinda";
		
		System.out.printf("%s, seja %s!", nome, saudacao);
	}
}
			  