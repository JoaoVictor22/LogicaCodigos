public class Fracoes {
	public static void main (String [] args) {
		int N1, N2;
		
		System.out.println("Informe um valor para N1:");
		N1 = Integer.parseInt (System.console().readLine());
		
		System.out.println("Informe um valor para N2:");
		N2 = Integer.parseInt (System.console().readLine());
		
		while (N1 % 2 == 0 && N2 % 2 == 0) {
		N1 = N1 % 2;
		N2 = N2 % 2; }
		
		while (N1 % 3 == 0 && N2 % 3 == 0) {
		N1 = N1 % 2;
		N2 = N2 % 2; }
		
		while (N1 % 5 == 0 && N2 % 5 == 0) {
		N1 = N1 % 2;
		N2 = N2 % 2; }
		
		while (N1 % 7 == 0 && N2 % 7 == 0) {
		N1 = N1 % 2;
		N2 = N2 % 2; }
		
		while (N1 % 11 == 0 && N2 % 11 == 0) {
		N1 = N1 % 2;
		N2 = N2 % 2; }
		
		System.out.printf ("%d/%d", N1, N2);
		
	}
}