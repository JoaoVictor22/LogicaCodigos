public class ValorPrestAtrasada {
	public static void main (String[] args) {
		int tempo;
		double taxa_juros, valor, prestacao;
		System.out.print ("Entre com o tempo de atraso:");
		tempo = Integer.parseInt (System.console().readLine());
		System.out.print ("Entre com a taxa de juros da prestacao atrasada:");
		taxa_juros = Double.parseDouble (System.console().readLine());
		System.out.print ("Entre com o valor da pretacao atrasada:");
		valor = Double. parseDouble (System.console().readLine());
		prestacao = valor + (valor * taxa_juros / 100);
		System.out.println ("Valor da prestacao atrasada:");
		System.out.print(prestacao);
	}
}