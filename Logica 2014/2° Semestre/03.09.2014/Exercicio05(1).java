// Necessita-se calcular alguns dados correspondentes aos animais de uma fazenda. Os animais
// pertencem a espécies diferentes, a saber: bovinos, ovinos e caprinos. Construa um programa em Java para
// calcular a média de peso de cada espécie para os animais do sexo feminino e do sexo masculino, a partir
// de dados fornecidos pelo usuário.
 
 public class Exercicio05 {
 
	public static double BovinosF (int n) {
		double peso_bovinos_f = 0;
		for (int i = 1; i <= n; i++) {
		System.out.printf("Peso bovino %d: ", i);
		peso_bovinos_f += Integer.parseInt(System.console().readLine()); }
		double media = peso_bovinos_f / n;
		return media; }
		
	public static double BovinosM (int n) {
		double peso_bovinos_m = 0;
		for(int i = 1; i <= n; i++){	
		System.out.printf("Peso bovino %d: ", i);
		peso_bovinos_m += Integer.parseInt(System.console().readLine()); }
		double media = peso_bovinos_m / n;
		return media; }
	
	public static double OvinosF (int n) {
		double peso_ovinos_f = 0;
		for (int i = 1; i <= n; i++) {
		System.out.printf("Peso ovino %d: ", i);
		peso_ovinos_f += Integer.parseInt(System.console().readLine()); }
		double media = peso_ovinos_f / n;
		return media; }
	
	public static double OvinosM (int n) {
		double peso_ovinos_m = 0;
		for (int i = 1; i <= n; i++) {
		System.out.printf("Peso ovino %d: ", i);
		peso_ovinos_m += Integer.parseInt(System.console().readLine()); }
		double media = peso_ovinos_m / n;
		return media; }
	
	public static double CaprinosF (int n) {
		double peso_caprinos_f = 0;
		for (int i = 1; i <= n; i++) {
		System.out.printf("Peso ovinos %d: ", i);
		peso_caprinos_f += Integer.parseInt(System.console().readLine()); }
		double media = peso_caprinos_f / n;
		return media; } 
		
	public static double CaprinosM (int n) {
		double peso_caprinos_m = 0;
		for (int i = 1; i <= n; i++) {
		System.out.printf("Peso ovinos %d: ", i);
		peso_caprinos_m += Integer.parseInt(System.console().readLine()); }
		double media = peso_caprinos_m / n;
		return media; } 
 
 
	public static void main (String[] args) {
		int n;
		System.out.print("\n------------ Fazenda ------------\n\nNeste programa sera calculada a media de peso dos caprinos, ovinos e bovinos de sua fazenda,\ndividindo-os em sexo feminino e masculino.\nInsira os dados necessarios para que o programa seja executado corretamente.\n\n");
		System.out.println("Por favor informe a quantidade de bovinos do sexo feminino existentes na fazenda: ");
		n = Integer.parseInt(System.console().readLine());
		System.out.printf("\nMedia de peso dos bovinos do sexo feminino = %.2f.\n\n", BovinosF(n));
		System.out.println("Por favor informe a quantidade de bovinos do sexo masculino existentes na fazenda: ");
		n = Integer.parseInt(System.console().readLine());
		System.out.printf("\nMedia de peso dos bovinos do sexo feminino = %.2f.\n\n", BovinosM(n));
		System.out.println("Por favor informe a quantidade de ovinos do sexo feminino existentes na fazenda: ");
		n = Integer.parseInt(System.console().readLine());
		System.out.printf("\nMedia de peso dos bovinos do sexo feminino = %.2f.\n\n", OvinosF(n));
		System.out.println("Por favor informe a quantidade de ovinos do sexo masculino existentes na fazenda: ");
		n = Integer.parseInt(System.console().readLine());
		System.out.printf("\nMedia de peso dos bovinos do sexo feminino = %.2f.\n\n", OvinosM(n));
		System.out.println("Por favor informe a quantidade de caprinos do sexo feminino existentes na fazenda: ");
		n = Integer.parseInt(System.console().readLine());
		System.out.printf("\nMedia de peso dos bovinos do sexo feminino = %.2f.\n\n", CaprinosF(n));
		System.out.println("Por favor informe a quantidade de caprinos do sexo masculino existentes na fazenda: ");
		n = Integer.parseInt(System.console().readLine());
		System.out.printf("\nMedia de peso dos bovinos do sexo feminino = %.2f.\n\n", CaprinosM(n));
		System.out.println("Obrigada por utilizar este programa."); 
		}
		}
		
	
		