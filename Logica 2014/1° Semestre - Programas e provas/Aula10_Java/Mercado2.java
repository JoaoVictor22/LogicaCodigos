public class Mercado2 {
	public static void main (String[] args) {
		
		double fat_merc, preco_unitario, fat_mens;
		int quantidade_total, N_mercadorias, contador;
		String nome_merc;
		
			fat_mens = 0;
			contador = 1;
			
			System.out.println("Informe a quantidade de produtos diferentes vendidos no mercado:");
			N_mercadorias = Integer.parseInt(System.console().readLine());
			
			do { 
			System.out.println("Informe o nome da mercadoria:");
			nome_merc = System.console().readLine();
		
			System.out.printf("Informe o preco unitario da mercadoria '%s':\n", nome_merc);
			preco_unitario = Double.parseDouble (System.console().readLine());
			
			System.out.printf("Informe o numero de %s(s) vendidas(os):\n", nome_merc);
			quantidade_total = Integer.parseInt (System.console().readLine());
		
			fat_merc = quantidade_total * preco_unitario;
			fat_mens = fat_merc + fat_mens;
			
			System.out.printf("Faturamento total da mercadoria: %.1f.\n", fat_merc);
			
			contador = contador + 1;
			
			} while ( contador < N_mercadorias);
			
			System.out.printf("Faturamento total do mercado no mes = %f.", fat_mens); 
	}
}