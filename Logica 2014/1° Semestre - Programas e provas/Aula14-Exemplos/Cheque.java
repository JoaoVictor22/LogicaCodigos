public class Cheque {
	public static void main(String[] args) {
		String valor, extenso = "", dezena = "", unidade = "", reais = "", centavos = "";
		int pos;

		// Le o valor numerico do cheque.
		System.out.print("Digite o valor do cheque: ");
		valor = System.console().readLine();
		
		for(pos = 0; pos < valor.length(); pos++) {
			if((valor.charAt(pos) < '0' || valor.charAt(pos) > '9') && valor.charAt(pos) != ',') {
				System.out.println("Valor invalido!");
				System.exit(0);
			}
		}
		
		if(valor.indexOf(",") == -1)
			valor += ",";
		
		while(valor.indexOf(",") < 3) {
			valor = "0" + valor;
		}
		
		while(valor.length() < 6) {
			valor += "0";
		}
				
		if(Double.parseDouble(valor.replace(",", ".")) >= 1000 || (valor.length() - valor.indexOf(",")) > 3) {
			System.out.println("Valor invalido!");
			System.exit(0);
		}
		
		// Gera centena por extenso.
		switch(valor.charAt(0)) {
			case '1': 
				if(valor.charAt(1) == '0' && valor.charAt(2) == '0')
					reais = "Cem";
				else
					reais = "Cento";
				break;
			case '2': reais = "Duzentos"; break;
			case '3': reais = "Trezentos"; break;
			case '4': reais = "Quatrocentos"; break;
			case '5': reais = "Quinhentos"; break;
			case '6': reais = "Seiscentos"; break;
			case '7': reais = "Setecentos"; break;
			case '8': reais = "Oitocentos"; break;
			case '9': reais = "Novecentos"; break;
		}
		
		// Gera dezena dos reais por extenso.
		switch(valor.charAt(1)) {
			case '1': 
				switch(valor.charAt(2)) {
					case '0': dezena = "Dez"; break;
					case '1': dezena = "Onze"; break;
					case '2': dezena =  "Doze"; break;
					case '3': dezena =  "Treze"; break;
					case '4': dezena =  "Quatorze"; break;
					case '5': dezena =  "Quinze"; break;
					case '6': dezena =  "Dezesseis"; break;
					case '7': dezena =  "Dezessete"; break;
					case '8': dezena =  "Dezoito"; break;
					case '9': dezena =  "Dezenove"; break;
				}
				break;
			case '2': dezena =  "Vinte"; break;
			case '3': dezena =  "Trinta"; break;
			case '4': dezena =  "Quarenta"; break;
			case '5': dezena =  "Cinquenta"; break;
			case '6': dezena =  "Sessenta"; break;
			case '7': dezena =  "Setenta"; break;
			case '8': dezena =  "Oitenta"; break;
			case '9': dezena =  "Noventa"; break;
		}
		
		if(reais.length() > 0) {
			if(!dezena.equals(""))
				reais += " e " + dezena;
		} else
			reais = dezena;

		// Gera unidade dos reais por extenso.
		if(valor.charAt(1) != '1') {
			switch(valor.charAt(2)) {
				case '1': unidade = "Um"; break;
				case '2': unidade = "Dois"; break;
				case '3': unidade = "Tres"; break;
				case '4': unidade = "Quatro"; break;
				case '5': unidade = "Cinco"; break;
				case '6': unidade = "Seis"; break;
				case '7': unidade = "Sete"; break;
				case '8': unidade = "Oito"; break;
				case '9': unidade = "Nove"; break;
			}
			
			if(reais.length() > 0) {
				if(!unidade.equals(""))
					reais += " e " + unidade;
			} else
				reais = unidade;
		}
		
		if(!reais.equals(""))
			if(reais.equals("Um"))
				extenso = reais + " Real";
			else
				extenso = reais + " Reais";
		
		unidade = dezena = "";
		
		// Gera dezena dos centavos por extenso.
		switch(valor.charAt(4)) {
			case '1': 
				switch(valor.charAt(5)) {
					case '0': dezena = "Dez"; break;
					case '1': dezena = "Onze"; break;
					case '2': dezena =  "Doze"; break;
					case '3': dezena =  "Treze"; break;
					case '4': dezena =  "Quatorze"; break;
					case '5': dezena =  "Quinze"; break;
					case '6': dezena =  "Dezesseis"; break;
					case '7': dezena =  "Dezessete"; break;
					case '8': dezena =  "Dezoito"; break;
					case '9': dezena =  "Dezenove"; break;
				}
				break;
			case '2': dezena =  "Vinte"; break;
			case '3': dezena =  "Trinta"; break;
			case '4': dezena =  "Quarenta"; break;
			case '5': dezena =  "Cinquenta"; break;
			case '6': dezena =  "Sessenta"; break;
			case '7': dezena =  "Setenta"; break;
			case '8': dezena =  "Oitenta"; break;
			case '9': dezena =  "Noventa"; break;
		}
		
		centavos = dezena;
		
		// Gera unidade dos centavos por extenso.
		if(valor.charAt(4) != '1') {
			switch(valor.charAt(5)) {
				case '1': unidade = "Um"; break;
				case '2': unidade = "Dois"; break;
				case '3': unidade = "Tres"; break;
				case '4': unidade = "Quatro"; break;
				case '5': unidade = "Cinco"; break;
				case '6': unidade = "Seis"; break;
				case '7': unidade = "Sete"; break;
				case '8': unidade = "Oito"; break;
				case '9': unidade = "Nove"; break;
			}
			
			if(centavos.length() > 0) {
				if(!unidade.equals(""))
					centavos += " e " + unidade;
			} else
				centavos = unidade;
		}
		
		if(!centavos.equals("")) {
			if(!extenso.equals(""))
				extenso += " e " + centavos;
			else
				extenso += centavos;
			if(centavos.equals("Um"))
				extenso += " Centavo";
			else
				extenso += " Centavos";
		}
		
		System.out.println(extenso);
	}
}
