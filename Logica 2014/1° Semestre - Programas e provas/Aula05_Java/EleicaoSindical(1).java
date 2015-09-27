public class EleicaoSindical {
	public static void main (String[] args) {
		int A, B, C, Nulos, Brancos, n_eleitores;
		double per_A, per_B, per_C, per_Nulos, per_Brancos;
		System.out.println("  Eleicao Sindical  ");
		System.out.print("Informe o numero de votos para A:");
		A = Integer.parseInt (System.console().readLine());
		System.out.print("Informe o numero de votos para B:");
		B = Integer.parseInt (System.console().readLine());
		System.out.print("Informe o numero de votos para C:");
		C = Integer.parseInt (System.console().readLine());
		System.out.print("Informe o numero de votos nulos:");
		Nulos = Integer.parseInt (System.console().readLine());
		System.out.print("Informe o numero de votos brancos:");
		Brancos = Integer.parseInt (System.console().readLine());
		n_eleitores = A + B + C + Nulos + Brancos;
		per_A = A * 100 / n_eleitores;
		per_B = B * 100 / n_eleitores;
		per_C = C * 100 / n_eleitores;
		per_Nulos = Nulos * 100 / n_eleitores;
		per_Brancos = Brancos * 100 / n_eleitores;
		System.out.print("Numero de eleitores = ");
		System.out.println(n_eleitores);
		System.out.print("Percentual de votos para A = ");
		System.out.println(per_A);
		System.out.print("Percentual de votos para B = ");
		System.out.println(per_B);
		System.out.print("Percentual de votos para C = ");
		System.out.println(per_C);
		System.out.print("Percentual de votos brancos = ");
		System.out.println(per_Brancos);
		System.out.print("Percentual de votos nulos = ");
		System.out.println(per_Nulos);
	}
}