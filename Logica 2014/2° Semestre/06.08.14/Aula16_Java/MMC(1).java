public class MMC {
	public static void main(String[] args) {
		int N, N2;
		N = Integer.parseInt (System.console().readLine());
		N2 =Integer.parseInt (System.console().readLine());
		int MMC;
		MMC = Calculos.MMC(N, N2);
		System.out.println(MMC);
		}}