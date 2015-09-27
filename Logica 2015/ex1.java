public class ex1 {

	public static void main(String[]args) {

		System.out.println("Digite numero inicial : ");
		int inicial = Integer.parseInt(System.console().readLine());	
		
		System.out.println("Digite numero final : ");
		int fim = Integer.parseInt(System.console().readLine());
		
		int i = inicial;
		
		while (i<fim) {
		System.out.println(i);
		i++;
		}	
	}
}