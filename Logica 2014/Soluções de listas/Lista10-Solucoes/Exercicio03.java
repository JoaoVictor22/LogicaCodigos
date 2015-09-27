public class Exercicio03 {
	public static void main(String[] args) {
		double e, x, termo;
		int cont;
		
		System.out.print("Expoente: ");
		x = Double.parseDouble(System.console().readLine());
		
		e = 1;
		cont = 1;
		do {
			termo = Math.pow(x, cont) / Calculos.fatorial(cont);
			e += termo;
			cont++;
		} while(termo >= 0.001);
		System.out.printf("E = %f\n", e);
	}
}