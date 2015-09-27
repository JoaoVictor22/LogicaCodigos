public class QuadradoSoma3Valores {
	public static void main (String[] args) {
		int A, B, C, result;
		System.out.println("Quadrado da soma de tres valores.");
		System.out.println("Informe o primeiro valor:");
		A = Integer.parseInt (System.console().readLine());
		System.out.println("Informe o segundo valor:");
		B = Integer.parseInt (System.console().readLine());
		System.out.println("Informe o terceiro valor:");
		C = Integer.parseInt (System.console().readLine());
		result = (A+B+C)*(A+B+C);
		System.out.println("Resultado:");
		System.out.print(result);
	}
}