public class CustoELatasNecessariasParaPintarUmCilindro {
	public static void main (String[] args) {
		 double area, raio, altura, n_latas, custo;
		 System.out.println("Sabe-se que cada lata custa 50 reais e possui 15 litros, logo para pintar um cilindro com raio = x e altura = y, sao necessarias z latas e a reais.");
		 System.out.print("Informe o valor do raio do cilindro:");
		 raio = Double.parseDouble (System.console().readLine());
		 System.out.print("Informe o valor da altura do cilindro:");
		 altura = Double.parseDouble (System.console().readLine());
		 area =  2 * 3.14159 * raio * (raio + altura);
		 n_latas = area/15;
		 custo = n_latas * 50;
		 System.out.print ("Numero de latas = ");
		 System.out.println(n_latas);
		 System.out.print ("Custo = ");
		 System.out.println(custo);
	}
}
		 