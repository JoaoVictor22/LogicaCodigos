public class TudoSobreN {
	public static void main (String [] args) {
		int N, senha, inteiro, res, N2, contador, opcao, cont2;
		double NR, resR;
		
		System.out.print("Ola!\nAqui teras conhecimento de qualquer coisa sobre um numero.\n");
		System.out.println("Informe a senha para prosseguir:");
		senha = Integer.parseInt (System.console().readLine());
		contador = 2;
		while (senha != 779 && contador > 0) {
		System.out.printf ("Senha incorreta.\n");
		System.out.printf("Voce possui mais %d tentativa(s).\n", contador); 
		contador = contador - 1;
		System.out.println("Informe a senha para prosseguir:\n\n");
		senha = Integer.parseInt (System.console().readLine());	}	
		if (contador == 0) {
		System.out.println("Acesso negado, tentativas expiradas.\n"); }
		if (contador > 0) { System.out.println("Acesso liberado! O que desejas?\n\n");
		System.out.println("1 = Tabuada de N.\n2 = Divisibilidade de N por N2.\n3 = N ao quadrado.\n4 = Encerrar.\n");
		opcao = Integer.parseInt (System.console().readLine());
			while (opcao == 1 || opcao == 2 || opcao == 3) {
			
			if (opcao == 1) {
			System.out.println("Informe o numero a ser calculada a tabuada:");
			N = Integer.parseInt (System.console().readLine());
			cont2 = 1;
			while (cont2 <= 10) {
			res = N * cont2;
			System.out.printf ("%d X %d = %d\n", N, cont2, res);
			cont2 = cont2 + 1; } }
			
			if (opcao == 2) {
			System.out.println("Informe o valor de N:");
			N = Integer.parseInt (System.console().readLine());
			System.out.println("Informe o valor de N2:");
			N2 = Integer.parseInt (System.console().readLine());
			res = N % N2;
			if (res == 0) {
			System.out.printf ("%d e divisivel por %d.\n", N, N2); }
			else { System.out.printf("%d nao e divisivel por %d", N, N2); }}
			
			if (opcao == 3) {
			System.out.println("Informe o valor de N:");
			NR = Double.parseDouble (System.console().readLine());
			resR = NR * NR;
			System.out.printf ("%f * %f = %f.", NR, NR, resR); }	
			
			System.out.println("\nO que desejas?\n\n");
			System.out.println("1 = Tabuada de N. \n2 = Divisibilidade de N por N2. \n3 = N ao quadrado \n4 = Encerrar");
			opcao = Integer.parseInt (System.console().readLine()); } }
			

			System.out.println ("Ate logo!");
	}
}
			
			
			
			
			