// Escreva um programa em Java que calcule o número de horas de determinado período estabelecido por
// duas datas.

public class Exercicio08 {
	
	public static int IntervaloHoras (int data1, int data2) {
		int intervalo_dias = data1 - data2;
		int horas = intervalo_dias * 24;
		return horas; }
			
	public static void main (String[] args) {
		int data1, data2;
		
		System.out.println("Este programa o intervalo de horas existente entre duas datas.");
		
		System.out.print("\nPor favor informe a primeira data: ");
		data1 = Integer.parseInt(System.console().readLine());
		System.out.print("\nPor favor informe a segunda data: ");
		data2 = Integer.parseInt(System.console().readLine());
		System.out.printf("\nIntervalo de horas entre as datas: %d.", IntervaloHoras(data1, data2));
	}
}
			