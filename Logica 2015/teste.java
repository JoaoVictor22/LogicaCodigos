public class teste {
	public static void main(String[] args) {

		int i = 1;

		while (i < 50) {

			int n = i;
			int d = 2;

			while ((n % d) != 0) {
				if (d == 2) {
					d++;
				} else {
					d = d + 2;
				}
			}
			if (d == n) {
				System.out.println(n + " eh primo");
			}
			i++;
		}
	}
}
