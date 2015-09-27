public class Exercicio3 {
	public static void main (String[] args) {
		double numero, quadrado;
		System.out.print("Informe um numero:");
		numero = Integer.parseInt (System.console().readLine());
		while (numero >= 0) {  	
			quadrado = numero * numero;
			System.out.printf("Numero ao quadrado = %f\n", quadrado);
			numero = Integer.parseInt (System.console().readLine());
		}
	}
}

			