public class primo {

	public static void main(String[] args) {

		int n = 15;
		int d = 2;

		while ((n % d) != 0) {
			if (d == 2) {
				d++;
			} else {
				d = d + 2;
			}
		}
		boolean ehprimo = (d == n);

	}
}