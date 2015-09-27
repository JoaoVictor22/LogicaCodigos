public class InversaoValores {
	public static void main (String[] args) {
		double A, B, AB, AC;
		System.out.print("Informe o primeiro valor:");
		A = Double.parseDouble (System.console().readLine());
		System.out.print ("Informe o segundo valor:");
		B = Double.parseDouble (System.console().readLine());
		AB = A;
		AC = B;
		A = AC;
		B = AB;
		System.out.print("1 =");
		System.out.println(A);
		System.out.print("2 =");
		System.out.print(B);
	}
}