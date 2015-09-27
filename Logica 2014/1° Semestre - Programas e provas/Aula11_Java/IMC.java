,public class IMC {
	public static void main (String [] args) {
		double peso, altura, IMC;
		
		System.out.println ("Calculo de IMC");
		System.out.println ("Informe o seu peso:");
		peso = Double.parseDouble (System.console().readLine());
		
		System.out.println ("Informe a sua altura:");
		altura = Double.parseDouble (System.console().readLine());
		
		IMC = peso / (altura * altura);
		
		if (IMC <= 18.5) {
		System.out.printf ("IMC = %f - Magreza\n", IMC); }
		
		if (IMC >= 18.5 && IMC <= 24.9) {
		System.out.printf ("IMC = %f - Saudavel\n", IMC); }
		
		if (IMC >= 25.0 && IMC <= 29.9) {
		System.out.printf ("IMC = %f - Sobrepeso\n", IMC); }
		
		if (IMC >= 30.0 && IMC <= 34.9 ) {
		System.out.printf ("IMC = %f - Obesidade Grau I.\n", IMC); }
		
		if (IMC >= 35.0 && IMC <= 39.9) {
		System.out.printf ("IMC = %f - Obesidade Grau II (severa).\n", IMC); }
		
		if (IMC >= 40) {
		System.out.printf ("IMC = %f - Obesidade Grau III (morbida) .\n", IMC); }
		
	}
}