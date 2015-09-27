// 9. Use o método definido no exercício 9 em um programa Java que leia um número inteiro do usuário e mostre todos os divisores daquele número que são primos.

public class Exercicio9 {
	public static void main (String[] args) {
		int num, dvsr = 2, quant = 0;
				
		System.out.println("Informe um numero: ");
		num = Integer.parseInt(System.console().readLine());
		
		System.out.println("Os numeros abaixo sao os divisores primos do numero informado: ");
		for (dvsr = 2; dvsr <= num; dvsr++) {
			if (num % dvsr == 0) {
				if (Calculos.primo(dvsr)) {
					System.out.println(dvsr); 
					quant++; }
			}
		}
		
		if (quant == 0) {
		System.out.println("Nenhum numero foi encontrado.");
		}
	}
}
				
		
 