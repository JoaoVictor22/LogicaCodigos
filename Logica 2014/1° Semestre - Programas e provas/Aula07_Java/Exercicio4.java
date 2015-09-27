public class Exercicio4 {
	public static void main (String[] args) {
		double y, x;
		System.out.print("Informe o x da funcao f(x)=x*x-5x+6 :");
		x = Double.parseDouble (System.console().readLine());
		while (x != 0) {
			y = x * x - 5 * x + 6;
			System.out.printf("F(x) para x = %f = %f\n", x, y);
			x = Double.parseDouble (System.console().readLine());
		}
	}
}