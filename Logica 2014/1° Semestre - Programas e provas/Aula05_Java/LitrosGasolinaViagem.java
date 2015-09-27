public class LitrosGasolinaViagem {
	public static void main (String[] args) {
		double temp_gast, vel_med, distancia, litros_usados;
		System.out.print("Entre com o tempo gasto na viagem:");
		temp_gast = Double.parseDouble (System.console().readLine());
		System.out.print("Entre com a velocidade media:");
		vel_med = Double.parseDouble (System.console().readLine());
		distancia = temp_gast * vel_med;
		litros_usados = distancia / 12;
		System.out.println("Litros de gasolina utilizados na viagem:");
		System.out.print(litros_usados);
	}
}