public class Exercicio5 {
	public static void main (String[] args) {
		String nomemerc;
		double faturamento, precomerc, totpmerc;
		int mercadoria, n_merc, contador;
		contador = 1;
		faturamento = 0;
		System.out.println("Informe o numero de mercadorias diferentes vendidas pela loja:");
		mercadoria = Integer.parseInt (System.console().readLine());
			while (contador <= mercadoria) {
			System.out.println("Informe o nome da mercadoria:");
			nomemerc = System.console().readLine();
			System.out.println("Informe o preco da mercadoria:");
			precomerc = Double.parseDouble (System.console().readLine());
			System.out.println("Informe o numero de mercadorias vendidas:");
			n_merc = Integer.parseInt (System.console().readLine());
			totpmerc = precomerc * n_merc;
			faturamento = faturamento + totpmerc;
			contador = contador + 1;
			System.out.println (nomemerc);
			System.out.println(totpmerc); }
		System.out.printf ("Faturamento = %f\n.", faturamento);
	}
}