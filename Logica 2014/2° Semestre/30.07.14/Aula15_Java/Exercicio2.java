public class Exercicio2 {
	public static void main (String[] args) {
		String A, B, C, concatenadas, maior;
		int compA, compB, compC, max = 0, iguais=0, comp_maior;
				
		System.out.println("Informe tres palavras:");
		A = System.console().readLine();
		B = System.console().readLine();
		C = System.console().readLine();
		
		compA = A.length();
		compB = B.length();
		compC = C.length();
		
		max = Math.max(compA, max);
		max = Math.max(compB, max);
		max = Math.max(compC, max);
		
		if (max == compA && max == compB && max == compC) {
		System.out.println ("As tres palavras tem o mesmo comprimento.");
		} else {
		if (max == compA && max == compB) {
		System.out.printf ("As maiores palavras sao: %s e %s.\n", A, B); 
		} else {
		if (max == compA && max == compC) {
		System.out.printf ("As maiores palavras sao: %s e %s.\n", A, C); }
		else {
		if (max == compB && max == compC) {
		System.out.printf ("As maiores palavras sao: %s e %s.\n", B, C);
		} else { maior = compA > compB ? A : B;
				 comp_maior = maior.length();
				 maior = comp_maior > compC ? maior : C;
				 System.out.printf("A maior palavra e %s.\n",maior);
				 }	}	} 	}		
		if (A.equals(B) && B.equals(C)) {
		iguais +=3;
		} else { if (A.equals(C)) {
				 iguais+=2;	}
				 if (B.equals(C)) {
				 iguais+=2;	}	
				 if (A.equals(B)) {
				 iguais+=2; } } 
				 
		System.out.printf("%d palavras sao iguais.\n", iguais);
		concatenadas = 	A + "-" + B + "-" + C;
		System.out.println(concatenadas);
	}
}

		
		
		
		