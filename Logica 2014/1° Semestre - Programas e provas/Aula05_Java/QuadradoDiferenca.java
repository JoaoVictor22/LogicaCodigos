public class QuadradoDiferenca {
	public static void main (String[] args) {
		int A, B, result;
		System.out.print("Informe o primeiro valor:");
		A = Integer.parseInt (System.console().readLine());
		System.out.print("Informe o segundo valor:");
		B = Integer.parseInt (System.console().readLine());
		result = (A-B)*(A-B);
		System.out.println("O quadrado da diferenca entre os dois numeros e:");
		System.out.print(result);
	}
}
		