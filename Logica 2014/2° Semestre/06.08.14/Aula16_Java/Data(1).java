public class Data {

// 10. Baseado no exercício 9 da lista 7, escreva um método que receba uma data como String como parâmetro e verifique se ela é válida ou não. 
// O método deve retornar uma resposta do tipo boolean (true se a data é válida e false caso contrário). 
// Coloque este método na classe Data criada na aula do dia 22/06.   

	static boolean validade (String data) {
		String mes;
		boolean validade;
		int controle=0, dia, teste, pos;
			
		validade = data.length() == 10 && ( data.charAt(2) == '/'  && data.charAt(5) == '/' || data.charAt(2) == '.' && data.charAt(5) == '.' || data.charAt(2) == '-' && data.charAt(5) == '-');
		
		dia = Integer.parseInt (data.substring(0,2));
		mes = data.substring(3,5);
		
		switch (mes) {
		case "01" : mes = "janeiro";
					if (dia > 31 || dia < 1) {
					controle++;}
					break;
		case "02" : mes = "fevereiro"; 
					if (dia > 28 || dia < 1) {
					controle++;} break;
		case "03" : mes = "marco"; 
					if (dia > 31 || dia < 1) {
					controle++;} break;
		case "04" : mes = "abril"; ; 
					if (dia > 30 || dia < 1) {
					controle++;} break;
		case "05" : mes = "maio"; 
					if (dia > 31 || dia < 1) {
					controle++;} break;
		case "06" : mes = "junho"; 
					if (dia > 30 || dia < 1) {
					controle++;} break;
		case "07" : mes = "julho"; 
					if (dia > 31 || dia < 1) {
					controle++;} break;
		case "08" : mes = "agosto";
					if (dia > 30 || dia < 1) {
					controle++;}  break;
		case "09" : mes = "setembro";
					if (dia > 31 || dia < 1) {
					controle++;}  break;
		case "10" : mes = "outubro";
					if (dia > 30 || dia < 1) {
					controle++;} break;
		case "11" : mes = "novembro"; 
					if (dia > 30 || dia < 1) {
					controle++;} break;
		case "12" : mes = "dezembro"; 
					if (dia > 31 || dia < 1) {
					controle++;} break;
		default : validade = false; } 
		
		for (pos = 6; pos < data.length(); pos++) {
		if (data.charAt(pos) < '0' || data.charAt(pos) > '9') {
		validade = false;
		}}
		
		if (controle != 0) {
		validade = false; } 
		return validade;}
		
		
		// Escreva um método que receba uma data como String e devolva o dia desta data como int.
		// Este método deve ser definido na classe Data,usada no exercício anterior. 
		// Caso a data informada seja inválida, o método deve retornar -1.   

		static int dia (String data) {
			String dia;
			int pos = 0, N;
			if (Data.validade(data)) {
				if (data.contains("-")) {
					pos = data.indexOf("-"); }
						else { if (data.contains("/")) {
									pos = data.indexOf("/"); } 
										else { if (data.contains(".")) {
												pos = data.indexOf("."); } } }
			if (pos != 0) {
			dia = data.substring(0,pos);
			N = Integer.parseInt(dia); } 
			else { N = -1; } }			
			else { N = -1; }
			return N; } 
			
		 	// Escreva um método que receba uma data como String e devolva o mês desta data como int. 
			// Este método deve ser definido na classe Data,usada no exercício anterior. 
			// Caso a data informada seja inválida, o método deve retornar -1.  

		static int mes (String data) {
			String mes;
			int pos = 0, N;
			if (Data.validade(data)) {
				if (data.contains("-")) {
					pos = data.indexOf("-"); }
						else { if (data.contains("/")) {
									pos = data.indexOf("/"); } 
										else { if (data.contains(".")) {
												pos = data.indexOf("."); } } }
			if (pos != 0) {
			pos++;
			mes = data.substring(pos, pos+2);
			N = Integer.parseInt(mes); } 
			else { N = -1; } }			
			else { N = -1; }
			return N; } 
			
			// 13. Escreva um método que receba uma data como String e devolva o ano desta data como int.
			// Este método deve ser definido na classe Data,usada no exercício anterior. 
			// Caso a data informada seja inválida, o método deve retornar -1.   

		static int ano (String data) {
			String ano;
			int comp, N, s;
			if (Data.validade(data)) {
			comp = data.length();
			ano = data.substring(6, comp++);
			N = Integer.parseInt(ano);	}
			else { N = -1; }
			return N; }
	}