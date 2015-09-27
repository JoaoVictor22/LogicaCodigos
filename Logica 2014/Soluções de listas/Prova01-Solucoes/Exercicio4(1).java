public class Exercicio4 {

	public static void main(String[] args) {
		double massa_inicial, massa_final;
		int tempo;
		System.out.print("Massa inicial: ");
		massa_inicial = Double.parseDouble(System.console().readLine());
		massa_final = massa_inicial;
		tempo = 0;
		while(massa_final >= 0.5) {
			massa_final = massa_final / 2;
			tempo = tempo + 50;
		}
		System.out.printf("Massa inicial = %f gramas\n", massa_inicial);
		System.out.printf("Massa final = %f gramas\n", massa_final);
		System.out.printf("tempo = %d segundos\n", tempo);
	}

}