public class AreaCirc {
	public static void main (String[] args) {
		double area, raio;
		System.out.print("Entre com o raio:");
		raio = Double.parseDouble (System.console().readLine());
		area = 3.14159 * raio * raio;
		System.out.print("Aqui esta a area:");
		System.out.print(area);
	}
}
