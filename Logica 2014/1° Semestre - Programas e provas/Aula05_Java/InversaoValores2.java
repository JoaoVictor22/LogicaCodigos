public class InversaoValores2 {
	public static void main (String[] args) {
		double A, B, temporaria;
		System.out.print("Informe o primeiro valor:");
		A = Double.parseDouble (System.console().readLine());
		System.out.print("Informe o segundo valor:");
		B = Double.parseDouble (System.console().readLine());
		temporaria = A;
		A = B;
		B = temporaria;
		System.out.println("Aqui estao os valores invertidos:");
		System.out.println(A);
		System.out.println(B);
	}
}
