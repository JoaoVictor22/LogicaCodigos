public class Exercicio05 {
	public static void main(String[] args) {
		int num1, den1, num2, den2, dr, nr;
		
		System.out.println("----------------- FRACAO 1 -----------------");
		System.out.print("Numerador...: ");
		num1 = Integer.parseInt(System.console().readLine());
		System.out.print("Denominador.: ");
		den1 = Integer.parseInt(System.console().readLine());
		
		System.out.println("----------------- FRACAO 2 -----------------");
		System.out.print("Numerador...: ");
		num2 = Integer.parseInt(System.console().readLine());
		System.out.print("Denominador.: ");
		den2 = Integer.parseInt(System.console().readLine());
		
		dr = Calculos.mmc(den1, den2);
		nr = dr / den1 * num1 + dr / den2 * num2;
		
		System.console().printf("\nRESULTADO = %d / %d\n", nr, dr);
	}
}