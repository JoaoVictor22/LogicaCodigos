// Escreva um programa em Java que seja capaz de fazer a conversão de um valor em reais para o
// correspondente em dólares, libras, francos e ienes e vice-versa.

public class Exercicio02 {
	 
	public static double Reais_Dolares (double valor, int op) {
		double conversao = 0;
		double cot_dolares_reais = 2.23;
		double cot_reais_dolares = 0.45;
		switch (op) {
			// Conversao de reais para dolares.
			case 1 : conversao = valor * cot_reais_dolares; break;
			// Conversao de dolares para reais.
			case 2 : conversao = valor * cot_dolares_reais; break;
			}
		return conversao; }
	
	public static double Reais_Libras (double valor, int op) {
		double conversao = 0;
		double cot_libras_reais = 3.67;
		double cot_reais_libras = 0.27;
		switch (op) {
			// Conversao de reais para libras.
			case 3 : conversao = valor * cot_reais_libras; break;
			// Conversao de libras para reais.
			case 4 : conversao = valor * cot_libras_reais; break;
			}
		return conversao; }
	
	public static double Reais_Francos (double valor, int op) {
		double conversao = 0;
		double cot_francos_reais = 2.43;
	double cot_reais_francos = 0.41;
		switch (op) {
			// Conversao de reais para francos.
			case 5 : conversao = valor * cot_reais_francos; break;
			// Conversao de francos para reais.
			case 6 : conversao = valor * cot_francos_reais; break;
			}
		return conversao; }
	
	public static double Reais_Ienes (double valor, int op) {
		double conversao = 0;
		double cot_reais_ienes = 46.95;
		double cot_ienes_reais = 0.02;
		switch (op) {
			// Conversao de reais para ienes.
			case 7 : conversao = valor * cot_reais_ienes; break;
			// Conversao de ienes para reais.
			case 8 : conversao = valor * cot_ienes_reais; break;
			}
		return conversao; }
	
	public static void main (String[] args) {
		int op;
		double valor;
		
		System.out.print("\n----------- COTACAO -------------\n\n1 - Reais -> Dolares\n2 - Dolares -> Reais\n3 - Reais -> Libras\n4 - Libras -> Reais\n5 - Reais -> Francos\n6 - Francos -> Reais\n7 - Reais -> Ienes\n8 - Ienes -> Reais\n\n-> ");
		op = Integer.parseInt(System.console().readLine());
		
		System.out.println("Informe o valor a ser transferido: ");
		valor = Double.parseDouble(System.console().readLine());
		
		double conversao = 0;
			switch (op) {
			case 1 : conversao = Reais_Dolares(valor, op); break;
			case 2 : conversao = Reais_Dolares(valor, op); break;
			case 3 : conversao = Reais_Libras(valor, op); break;
			case 4 : conversao = Reais_Libras(valor, op); break;
			case 5 : conversao = Reais_Francos(valor, op); break;
			case 6 : conversao = Reais_Francos(valor, op); break;
			case 7 : conversao = Reais_Ienes(valor, op); break;
			case 8 : conversao = Reais_Ienes(valor, op); break;
			}
		
		System.out.printf("Conversao: %.2f.", conversao);
	}
}

	
	
		