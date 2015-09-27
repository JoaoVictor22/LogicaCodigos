public class Exercicio1 {

	public static void main(String[] args) {
		double raio, volume;
		System.out.print("Informe o raio: ");
		raio = Double.parseDouble(System.console().readLine());
		volume = 4.0 / 3.0 * 3.14 * raio * raio * raio;
		System.out.printf("Volume da esfera = %f\n", volume);
	}

}