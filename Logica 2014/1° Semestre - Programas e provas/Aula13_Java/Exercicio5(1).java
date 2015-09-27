public class Exercicio5 {
	public static void main (String[] args) {
		String vinho;
		double quantT, quantB, quantR;
		double porcT, porcB, porcR;
		
		porcR = 0;
		porcT = 0;
		porcB = 0;
		quantT = 0;
		quantB = 0;
		quantR = 0;
		do {
			System.out.println("Tipo do vinho (T - tinto, B - branco, R - rose): ");
			vinho = System.console().readLine();
			if (vinho.equals("T")) {
				quantT++; 
			} else {
					if (vinho.equals("B")) {
						quantB++; 
					} else { 
							if (vinho.equals("R")) {
								quantR++;
								} else {
										if( !(vinho.equals("F"))) {
										System.out.println("Tipo de vinho invalido!"); }
										}
									}
								}
							} while ( !(vinho.equals("F"))); 
				porcT = quantT / (quantT + quantB + quantR) * 100.0; 
				porcB = quantB / (quantT + quantB + quantR) * 100.0;
				porcR = quantR / (quantT + quantB + quantR) * 100.0;
				
			System.out.printf ("Percentual de pessoas que gostam de vinho branco: %f.\n", porcB);
			System.out.printf ("Percentual de pessoas que gostam de vinho tinto: %f.\n", porcT);
			System.out.printf ("Percentual de pessoas que gostam de vinho rose: %f.\n", porcR); 
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			