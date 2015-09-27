public class MaterialRadioativo {	
	public static void main (String[] args) {
		double massa, massaf;
		int tempo;
			System.out.println("Informe a massa do material radioativo:");
			massa = Double.parseDouble (System.console().readLine());
			massaf = massa;
			tempo = 0;
				while (massaf >= 0.5) {
				massaf = massaf / 2;
				tempo = tempo + 50; }
			System.out.printf("Massa inicial = %fg.\nMassa final = %fg.\nTempo utilizado = %ds.\n", massa, massaf, tempo);
		}
}		