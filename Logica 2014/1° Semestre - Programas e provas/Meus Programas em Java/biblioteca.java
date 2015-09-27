public class biblioteca {
	public static void main (String [] args) {
		int dias;
		double p;
			p = 0;
			System.out.print("Informe o numero de dias de atraso:");
			dias = Integer.parseInt (System.console().readLine());
			if (dias > 0 && dias < 30) p = dias * 1.5;
			if (dias >= 30 && dias < 60) p = dias * 3.5;
			if (dias >= 60 && dias < 90) { p = dias * 6.5;
			System.out.println("Voce pode sofrer uma intimacao policial."); }
			if (dias > 90) { p = dias * 9.5;
			System.out.println("Voce pode sofrer uma intimacao policial."); }
			System.out.printf("Multa a ser paga = R$ %.1f.\n", p);
	}
}