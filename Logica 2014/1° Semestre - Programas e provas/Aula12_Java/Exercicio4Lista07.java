public class Exercicio4Lista07 {
	public static void main (String[] args) {
		double delta, raizDelta, R1, R2, A, B, C;
		
		System.out.println("Digite os coeficientes a, b e c da sua equacao de segundo grau:");
		
		A = Double.parseDouble(System.console().readLine());
		B = Double.parseDouble(System.console().readLine());
		C = Double.parseDouble(System.console().readLine());
		
		delta = B * B - 4 * A * C;
		raizDelta = Math.sqrt(delta);
		
		R1 = (- B + raizDelta) / (2 * A);
		R2 = (- B - raizDelta) / (2 * A);
			
		System.out.printf ("As raizes da equacao sao: %.1f e %.1f.\n", R1, R2);
	}
}

	
	
	
	
	
	
	
	
	
	