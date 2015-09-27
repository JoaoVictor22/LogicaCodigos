public class VolLataOleo {
	public static void main (String[] args) {
		double raio, altura, volume;
		System.out.println("Entre com o raio da lata:");
		raio = Double.parseDouble(System.console().readLine());
		System.out.println("Entre com a altura da lata:");
		altura = Double.parseDouble(System.console().readLine());
		volume = 3.14159 * raio * raio * altura;
		System.out.println("Volume da lata:");
		System.out.println(volume);
	}
}