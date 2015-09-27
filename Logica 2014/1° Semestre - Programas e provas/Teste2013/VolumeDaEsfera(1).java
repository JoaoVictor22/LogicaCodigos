public class VolumeDaEsfera {
	public static void main (String [] args) {
		double V, r;
			System.out.println("Informe o valor do raio da esfera:");
			r = Double.parseDouble (System.console().readLine());
			V = 4.0/3 * 3.14159 * r * r * r;
			System.out.printf("Volume = %f.\n", V);
	}
}