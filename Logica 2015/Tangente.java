/* aproximar o valor do arctan de t com p termos
 * arctan(t) = t-t³/3+t^5/5-t^7/7+t^9...
 * 
 * aproximar o valor de PI com p termos
 * PI = 4*(1-1/3+1/5-1/7+1/9...)
 * 
 * aproximar o valor de E com p termos
 * E = (1+1/2!+1/3!+1/4!+1/5!...)
 * 
 */

public class Tangente {

	public static void main(String[] args) {
		// aproximar o valor do arctan de t com p termos
		// * arctan(t) = t-t³/3+t^5/5-t^7/7+t^9...
		double t = Double.parseDouble(System.console().readLine(
				"Qual o valor de t : "));
		int p = Integer
				.parseInt(System.console().readLine("Quantos passos : "));
		int i = 0;
		int s = +1;
		int d = 1;
		double r = 0;
		while (i < p) {
			r = r + s * Math.pow(t, d) / d;
			s = -s;
			d = d + 2;
			p = p - 1;
		}
		System.out.println(r);

	}
}
