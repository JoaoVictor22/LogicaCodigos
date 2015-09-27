public class Detran {
	public static void main (String[] args) {
		
		int N;
		String data;
		
			System.out.println("Informe o numero da placa de seu carro:");
			N = Integer.parseInt (System.console().readLine());
			
			N = N % 10;
			
			
			switch (N) {
			case 0: 
				data = "Janeiro";
				break;
			case 1:
				data = "Fevereiro";
				break;
			case 2:
				data = "Marco";
				break;
			case 3:
				data = "Abril";
				break;
			case 4:
				data = "Maio";
				break;
			case 5:
				data = "Junho";
				break;
			case 6:
				data = "Setembro";
				break;
			case 7: 
				data = "Outubro";
				break;
			case 8: 
				data = "Novembro";
				break;
			case 9:
				data = "Dezembro";
				break;
			default: data = "Inexistente";
			}
		
		System.out.printf("Mes a ser realizada a vistoria: %s/2014", data);
	}
}