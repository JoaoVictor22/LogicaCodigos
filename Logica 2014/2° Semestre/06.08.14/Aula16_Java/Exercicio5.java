// Escreva um programa em Java que calcule a soma de duas frações. 
// Para isso, o programa deve pedir ao usuário que informe o valor do numerador e do denominador de cada fração (todos são do tipo int).
// Considerando que n1 é o numerador da primeira fração, d1 é o denominador da primeira fração, n2 é o numerador da segunda fração e d2 é o denominador da segunda fração, 
// o resultado da soma será:  
	// dr= MMC de d1 e d2  nr= dr/d1×n1 + dr/d2×n2  
// onde dr é o denominador do resultado e nr é o numerador do resultado. Utilize o método escrito no exercício 4 para calcular o MMC.

public class Exercicio5 {
	public static void main (String [] args) {
		int n1, n2, d1, d2, dr, nr1, nr2, nr;
		System.out.println("Por favor informe as fracoes na seguinte ordem: n1/d1; n2/d2.\n");
		n1 = Integer.parseInt(System.console().readLine());
		d1 = Integer.parseInt(System.console().readLine());
		n2 = Integer.parseInt(System.console().readLine());
		d2 = Integer.parseInt(System.console().readLine());
		dr = Calculos.MMC(d1, d2);
		nr1 = ((dr/d1) * n1);
		nr2 = ((dr/d2) * n2);
		nr =  nr1 + nr2;
		System.out.printf("Soma resultante = %d / %d.\n", nr, dr);
	}
}
		