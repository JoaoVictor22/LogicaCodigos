public class Cheque {
	public static void main (String[] args) {
		String numero, nAv, nDv, saida = "a";
		char car;
		int comp, car_invalido = 0, index;
		
		
		System.out.println("Por favor informe o valor numerico do cheque:");
		numero = System.console().readLine();
		
		comp = numero.length();
		index = numero.indexOf(',');
		if (index == -1) {
		numero = numero + ",00"; }
		if (index == comp - 2) {
		numero = numero + "0"; }
		
		comp = numero.length();
		int cont = 0;
		
		for (; cont < comp; cont++) {
		car = numero.charAt(cont);
		switch (car) {
		case '1' : ; break;
		case '2' : ; break;
		case '3' : ; break; 
		case '4' : ; break;
		case '5' : ; break;
		case '6' : ; break;
		case '7' : ; break;
		case '8' : ; break;
		case '9' : ; break;
		case '0' : ; break;
		case ',' : ; break;
		default : car_invalido++; } }
		
		if (car_invalido != 0) {
		System.out.println("ERRO! Valor invalido!"); }
		else {  
				index = numero.indexOf(",");
				nAv = numero.substring(0, index);
				index++;
				nDv = numero.substring (index, comp);
				int NA = Integer.parseInt(nAv);
				int ND = Integer.parseInt(nDv);
				double vreal = ND / 100;
				numero = numero.replace(",", ".");
				double numeroReal = Double.parseDouble(numero);
				if (numeroReal <= 999.99 && numeroReal >= 0.01) {
				int PrimCasa = NA / 100;
				int N = NA % 100;
				switch (PrimCasa) {
				case 9 : saida = "Novecentos"; break;
				case 8 : saida = "Oitocentos"; break;
				case 7 : saida = "Setecentos"; break;
				case 6 : saida = "Seiscentos"; break;
				case 5 : saida = "Quinhentos"; break;
				case 4 : saida = "Quatrocentos"; break;
				case 3 : saida = "Trezentos"; break;
				case 2 : saida = "Duzentos"; break;
				case 1 : { 
						 if(N == 0) {
						 saida = "Cem "; }
						 else { 
						 saida = "Cento "; } 
						 break; }	
				}
				if (N == 0 && ND == 0 && PrimCasa != 0) {
				saida = saida + " reais."; } 
				else {
						if (N == 0 && ND != 0 && PrimCasa != 0) {
				saida = saida + " reais"; } }  
				
				
				int SegCasa = N / 10;
				int NN = N % 10;
				if (saida != "a") {
				switch (SegCasa) {
				case 9 : saida = saida + " e noventa"; break;
				case 8 : saida = saida + " e oitenta"; break;
				case 7 : saida = saida + " e setenta"; break;
				case 6 : saida = saida + " e sessenta"; break;
				case 5 : saida = saida + " e cinquenta"; break;
				case 4 : saida = saida + " e quarenta"; break;
				case 3 : saida = saida + " e trinta"; break;
				case 2 : saida = saida + " e vinte"; break;
				} }
				else {	
				if (!(N < 20 && N > 10)) {
				switch (SegCasa) {
				case 9 : saida = "Noventa"; break;
				case 8 : saida = "Oitenta"; break;
				case 7 : saida = "Setenta"; break;
				case 6 : saida = "Sessenta"; break;
				case 5 : saida = "Cinquenta"; break;
				case 4 : saida = "Quarenta"; break;
				case 3 : saida = "Trinta"; break;
				case 2 : saida = "Vinte"; break; 
				case 1: saida = "Dez"; break;
				}	if (NN == 0 && ND == 0) {
					saida = saida + " reais"; } 
					else {
						if (NN == 0 && ND != 0 && SegCasa != 0) {
						saida = saida + " reais"; } } } }
						
				if (N < 20 && N!=10 && saida != "a") {
				switch (N) {
				case 19 : saida = saida + " e dezenove reais"; break;
				case 18 : saida = saida + " e dezoito reais"; break;
				case 17 : saida = saida + " e dezessete reais"; break;
				case 16 : saida = saida + " e dezesseis reais"; break;
				case 15 : saida = saida + " e quinze reais"; break;
				case 14 : saida = saida + " e dezesseis reais"; break;
				case 13 : saida = saida + " e treze reais"; break;
				case 12 : saida = saida + " e doze reais"; break;
				case 11 : saida = saida + " e onze reais"; break;
				case 10 : saida = saida + " e dez reais"; break; } }
				int Nnovo = N % 10;
				if (N >= 20 || N < 10 && saida != "a" ) {
				switch (Nnovo) {
				case 9 : saida = saida + " e nove reais"; break;
				case 8 : saida = saida + " e oito reais"; break;
				case 7 : saida = saida + " e sete reais"; break;
				case 6 : saida = saida + " e seis reais"; break;
				case 5 : saida = saida + " e cinco reais"; break;
				case 4 : saida = saida + " e quatro reais"; break;
				case 3 : saida = saida + " e tres reais"; break;
				case 2 : saida = saida + " e dois reais"; break;
				case 1 : saida = saida + " e um reais"; break;
				} }
				if (N < 20 && saida == "a"){
				switch (N) {
				case 19 : saida = "Dezenove reais"; break;
				case 18 : saida = "Dezoito reais"; break;
				case 17 : saida = "Dezessete reais"; break;
				case 16 : saida = "Dezesseis reais"; break;
				case 15 : saida = "Quinze reais"; break;
				case 14 : saida = "Quatorze reais"; break;
				case 13 : saida = "Treze reais"; break;
				case 12 : saida = "Doze reais"; break;
				case 11 : saida = "Onze reais"; break;
				case 10 : saida = "Dez reais"; break;
				case 9 : saida = "Nove reais"; break;
				case 8 : saida = "Oito reais"; break;
				case 7 : saida = "Sete reais"; break;
				case 6 : saida = "Seis reais"; break;
				case 5 : saida = "Cinco reais"; break;
				case 4 : saida = "Quatro reais"; break;
				case 3 : saida = "Tres reais"; break;
				case 2 : saida = "Dois reais"; break;
				case 1 : saida = "Um real"; break; }}				
				if (ND != 0) {
				int NDS = ND % 10;
				int NND = ND / 10;
					if (saida == "a" && NND == 0 && NDS != 0) {
						switch (NDS) {
						case 9 : saida = "Nove centavos"; break;
						case 8 : saida = "Oito centavos"; break;
						case 7 : saida = "Sete centavos"; break;
						case 6 : saida = "Seis centavos"; break;
						case 5 : saida = "Cinco centavos"; break;
						case 4 : saida = "Quatro centavos"; break;
						case 3 : saida = "Tres centavos"; break;
						case 2 : saida = "Dois centavos"; break;
						case 1 : saida = "Um centavo"; break; } } 
				if (NDS == 0 && saida != "a") {
				switch (NND) {
				case 9 : saida = saida + " e noventa centavos."; break;
				case 8 : saida = saida + " e oitenta centavos."; break;
				case 7 : saida = saida + " e setenta centavos."; break;
				case 6 : saida = saida + " e sessenta centavos."; break;
				case 5 : saida = saida + " e cinquenta centavos."; break;
				case 4 : saida = saida + " e quarenta centavos."; break;
				case 3 : saida = saida + " e trinta centavos."; break;
				case 2 : saida = saida + " e vinte centavos."; break; 
				case 1 : saida = saida + " e dez centavos."; break;
				}} 
				if (NDS == 0 && saida == "a") {
				switch (NND) {
				case 9 : saida = "Noventa centavos."; break;
				case 8 : saida = "Oitenta centavos."; break;
				case 7 : saida = "Setenta centavos."; break;
				case 6 : saida = "Sessenta centavos."; break;
				case 5 : saida = "Cinquenta centavos."; break;
				case 4 : saida = "Quarenta centavos."; break;
				case 3 : saida = "Trinta centavos."; break;
				case 2 : saida = "Vinte centavos."; break; 
				case 1 : saida = "Dez centavos." ; break;}}
				if (NDS != 0) {
					if (saida == "a" && NND != 0 ) {
						switch (NND) {
						case 9 : saida = "Noventa"; break;
						case 8 : saida = "Oitenta"; break;
						case 7 : saida = "Setenta"; break;
						case 6 : saida = "Sessenta"; break;
						case 5 : saida = "Cinquenta"; break;
						case 4 : saida = "Quarenta"; break;
						case 3 : saida = "Trinta"; break;
						case 2 : saida = "Vinte"; break; 
						}
						switch (ND) {
						case 19 : saida = "Dezenove centavos."; break;
						case 18 : saida = "Dezoito centavos."; break;
						case 17 : saida = "Dezessete centavos."; break;
						case 16 : saida = "Dezesseis centavos."; break;
						case 15 : saida = "Quinze centavos."; break;
						case 14 : saida = "Quatorze centavos."; break;
						case 13 : saida = "Treze centavos."; break;
						case 12 : saida = "Doze centavos."; break;
						case 11 : saida = "Onze centavos."; break;
						case 10 : saida = "Dez centavos."; break;
						} 
						if (saida != "a" && ! (ND < 20 && ND > 10) ) { switch (NDS) {
						case 9 : saida = saida + " e nove centavos."; break;
						case 8 : saida = saida + " e oito centavos."; break;
						case 7 : saida = saida + " e sete centavos."; break;
						case 6 : saida = saida + " e seis centavos."; break;
						case 5 : saida = saida + " e cinco centavos."; break;
						case 4 : saida = saida + " e quatro centavos."; break;
						case 3 : saida = saida + " e tres centavos."; break;
						case 2 : saida = saida + " e dois centavos."; break;
						case 1 : saida = saida + " e um centavos."; break; } } }
						else { 
					if (saida != "a") {
						switch (NND) { 
						case 9 : saida = saida + " e noventa"; break;
						case 8 : saida = saida + " e oitenta"; break;
						case 7 : saida = saida + " e setenta"; break;
						case 6 : saida = saida + " e sessenta"; break;
						case 5 : saida = saida + " e cinquenta"; break;
						case 4 : saida = saida + " e quarenta"; break;
						case 3 : saida = saida + " e trinta"; break;
						case 2 : saida = saida + " e vinte"; break; }
						switch (ND) {
						case 19 : saida = " e dezenove centavos."; break;
						case 18 : saida = saida + " e dezoito centavos."; break;
						case 17 : saida = saida + " e dezessete centavos."; break;
						case 16 : saida = saida + " e dezesseis centavos."; break;
						case 15 : saida = saida + " e quinze centavos."; break;
						case 14 : saida = saida + " e quatorze centavos."; break;
						case 13 : saida = saida + " e treze centavos."; break;
						case 12 : saida = saida + " e doze centavos."; break;
						case 11 : saida = saida + " e onze centavos."; break;
						case 10 : saida = saida + " e dez centavos."; break;}
						if (ND > 20) {
						switch (NDS) {
						case 9 : saida = saida + " e nove centavos."; break;
						case 8 : saida = saida + " e oito centavos."; break;
						case 7 : saida = saida + " e sete centavos."; break;
						case 6 : saida = saida + " e seis centavos."; break;
						case 5 : saida = saida + " e cinco centavos."; break;
						case 4 : saida = saida + " e quatro centavos."; break;
						case 3 : saida = saida + " e tres centavos."; break;
						case 2 : saida = saida + " e dois centavos."; break;
						case 1 : saida = saida + " e um centavo."; break; } } } 
						} } } 
						
						if (saida == "a") {
						if (car_invalido == 0) {
					System.out.println("Numero fora do intervalo permitido. Por favor informe um numero entre 0,01 e 999,99."); } 
					} else {
					if (!(saida.endsWith(".") )){
					saida = saida + "."; } } }
				
		
				else { if(car_invalido == 0) {
				System.out.println("Numero fora do intervalo permitido. Por favor informe um numero entre 0,01 e 999,99.");}  }
				}
				
				if (!(saida.equals("a"))) {
				System.out.println(saida); }
				
				
				}  }
	
				
				
		
		