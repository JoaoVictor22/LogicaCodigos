/*Fa�a um programa em Java que calcule e mostre o resultado da s�rie:

e^x = 1 + x/1! + x^2/2! + x^3/3!+....

O valor de x deve ser informado pelo usu�rio. A s�rie deve ser calculada at�
uma precis�o de 0,001.
Utilize o m�todo definido no exerc�cio 1 para o c�lculo do fatorial.*/

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
		