public class Conversao {
	public static void main (String[] args) {
		double Celsius, Fahrenheit;
		System.out.print("Entre com a temperatura em Celsius:");
		Celsius = Double.parseDouble (System.console().readLine());
		Fahrenheit = ( 9 * Celsius + 160 ) /5;
		System.out.println("Temperatura em Fahrenheit:");
		System.out.print(Fahrenheit);
	}
}