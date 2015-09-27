public class Data {
	static boolean ehValida(String data) {
		int pos, dia, mes;
		if (data.length() != 10 ||	
		    (data.charAt(2) != '/' && data.charAt(2) != '-' && data.charAt(2) != '.') ||
			(data.charAt(5) != '/' && data.charAt(5) != '-' && data.charAt(5) != '.') ||
			 data.charAt(2) != data.charAt(5))
			 return false;
		
		for(pos = 0; pos < data.length(); pos++) {
			if(pos != 2 && pos != 5 && (data.charAt(pos) < '0' || data.charAt(pos) > '9'))
				return false;
		}
		
		dia = Integer.parseInt(data.substring(0,2));
		mes = Integer.parseInt(data.substring(3,5));
		
		if(mes < 1 || mes > 12 || dia < 1)
			return false;
			
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			return dia <= 31;
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return dia <= 30;
		else
			return dia <= 29;
	}
	
	static int extraiDia(String data) {
		if(ehValida(data))
			return Integer.parseInt(data.substring(0,2));
		else
			return -1;
	}
	
	static int extraiMes(String data) {
		if(ehValida(data))
			return Integer.parseInt(data.substring(3,5));
		else
			return -1;
	}
	
	static int extraiAno(String data) {
		if(ehValida(data))
			return Integer.parseInt(data.substring(6));
		else
			return -1;
	}
}