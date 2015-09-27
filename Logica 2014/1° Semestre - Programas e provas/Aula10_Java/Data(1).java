public class Data {
	public static void main (String[] args) {
		String mes_nome;
		int dia, mes, ano;
			
			System.out.println("Informe o dia:");
			dia = Integer.parseInt(System.console().readLine());
			
			System.out.println("Informe o mes (ex.: 9):");
			mes = Integer.parseInt(System.console().readLine());
			
			System.out.println("Informe o ano:");
			ano = Integer.parseInt (System.console().readLine());
			
			switch (mes) {
				case 1: 
					mes_nome = "janeiro";
					break;
				case 2: 
					mes_nome = "fevereiro";
					break;
				case 3:
					mes_nome = "marco";
					break;
				case 4: 
					mes_nome = "abril";
					break;
				case 5: 
					mes_nome = "maio";
					break;
				case 6: 
					mes_nome = "junho";
					break;
				case 7: 
					mes_nome = "julho";
					break;
				case 8:
					mes_nome = "agosto";
					break;
				case 9:
					mes_nome = "setembro";
					break;
				case 10: 
					mes_nome = "outubro";
					break;
				case 11:
					mes_nome = "novembro";
					break;
				case 12:
					mes_nome = "dezembro";
					break;
				default: mes_nome = "invalido";
				}
				
			System.out.printf ("%d de %s de %d.", dia, mes_nome, ano);
	}
}