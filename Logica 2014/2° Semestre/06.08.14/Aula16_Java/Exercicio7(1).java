 // Escreva um programa em Java que repita o que foi feito no exercício 6, até que o usuário digite sair.
 
 public class Exercicio7 {
	public static void main (String [] args) {
		String exp = "", pri = "",seg ="";
		int N;
		int N2, comp, i, op = 0, end_op, resp = 0;
		char x = 'x', y = 'y';
		
		System.out.println("Informe uma expressao no seguinte formato: N1 operador N2.");
		exp = System.console().readLine();
		while (!(exp.equals("sair"))) {
		exp = exp.replace(" ", "");
		comp = exp.length();
		for (i = 0; i < comp && ( x != '+' && x != '-' && x != '*' && x != '/') ; i++) {
		x = exp.charAt(i);
		switch (x) {
		case '0' :pri =  pri + '0'; break;
		case '1' :pri =  pri + '1'; break;
		case '2' :pri =  pri + '2'; break;
		case '3' :pri =  pri + '3'; break;
		case '4' :pri =  pri + '4'; break;
		case '5' :pri =  pri + '5'; break;
		case '6' :pri =  pri + '6'; break;
		case '7' :pri =  pri + '7'; break;
		case '8' :pri =  pri + '8'; break;
		case '9' :pri =  pri + '9'; break;
		case '-' : y = '-'; break;
		case '+' : y = '+'; break;
		case '*' : y = '*'; break;
		case '/' : y = '/'; break;} }
		end_op = exp.indexOf(y);
		end_op++;
		seg = exp.substring(end_op, comp);
		N = Integer.parseInt(pri);
		N2 = Integer.parseInt(seg);
		switch (y) {
		case '-' : resp = N - N2; break;
		case '+' : resp = N + N2; break;
		case '*' : resp = N * N2; break;
		case '/' : resp = N / N2; break;
		}
		x = 'x';
		y = 'y';
		comp = 0;
		seg = "";
		pri ="";
		exp = "";
		System.out.println (resp);
		System.out.println("Informe uma expressao no seguinte formato: N1 operador N2.");
		exp = System.console().readLine();		}
	}
}

		
