/*Escreva um programa em Java que calcule e escreva a soma dos termos da s�rie:

S = 100/0! + 99/1! + 98/2! + 97/3! + ... + 80/20!

Use o m�todo definido no exerc�cio 1 para o c�lculo do fatorial.*/

public class SomaSerie {
		public static void main (String[] args) {
			int den = 0;
			double S = 0.0, num = 100.0;
			for (; num >= 80 && den <= 20; num--, den++) {
			S = num/Calculos.fatorial(den) + S;	}
			System.out.printf("S = %f\n", S);
		}//Fim da classe principal.
}//Fim do software.