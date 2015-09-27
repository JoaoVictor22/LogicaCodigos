public class HorarioValido {
	public static void main (String[]args) {
	
		int hora, minuto;
		
		System.out.println("Informe as horas:");
		hora = Integer.parseInt (System.console().readLine());
		System.out.println("Informe os minutos:");
		minuto = Integer.parseInt (System.console().readLine());
		
			if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <=59) {
			System.out.println("Horario valido!"); }
			else { System.out.println ("Horario invalido."); }
	}
}
			