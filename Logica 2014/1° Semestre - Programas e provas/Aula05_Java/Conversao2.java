public class Conversao2 {
	public static void main (String[] args) {
		double Celsius, Fahrenheit;
		System.out.print("Entre com a temperatura em Fahrenheit:");
		Fahrenheit = Double.parseDouble(System.console().readLine());
		Celsius = 5 * ( Fahrenheit - 32) / 9;
		System.out.println("Temperatura em Celsius:");
		System.out.print(Celsius);
	}
}