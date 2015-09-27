public class Exercicio2 {
	public static void main (String [] args) {
		
		int contador, somaimp, imp;			
			contador = 2;				
				while (contador <= 20) {
				System.out.println(contador);
				contador = contador + 2;}
			somaimp = 0;
			imp = 1;
				while (imp <= 20) {
				somaimp = imp + somaimp;
				imp = imp + 2; }
			System.out.printf ("Soma dos numeros impares de 0 a 20 = %d.", somaimp);
			
	}
}