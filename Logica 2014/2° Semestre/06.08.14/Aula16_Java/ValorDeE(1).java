/*Faça um programa em Java que calcule e mostre o resultado da série:

e^x = 1 + x/1! + x^2/2! + x^3/3!+....

O valor de x deve ser informado pelo usuário. A série deve ser calculada até
uma precisão de 0,001.
Utilize o método definido no exercício 1 para o cálculo do fatorial.*/

public class ValorDeE {
	public static void main (String[] args) {
		double num, E, termo;
		int den = 1, cont = 1;
		E = 1;
		System.out.println("Informe um valor numerico:");
		num = Double.parseDouble(System.console().readLine());
		do { 
		termo = Math.pow(num, cont) / Calculos.fatorial(den);
		E = E + termo;
		den++; 
		cont++; } while(termo >= 0.001);
		System.out.printf("E^x = %f", E);
	}
}
		