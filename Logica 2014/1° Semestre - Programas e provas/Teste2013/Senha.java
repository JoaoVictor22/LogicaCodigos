public class Senha {
	public static void main (String [] args) {
		int N;
		System.out.println("Informe a senha:");
		N = Integer.parseInt (System.console().readLine());
			while (N != 29 && N != 5) {
			System.out.println ("Senha invalida."); 
			System.out.println("Informe a senha:");
			N = Integer.parseInt (System.console().readLine()); }
			System.out.println ("Senha correta! Acesso liberado.");
	}
}
			