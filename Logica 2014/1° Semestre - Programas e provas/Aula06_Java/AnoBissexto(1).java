public class AnoBissexto {
	public static void main (String[] args) {
		int Ano;
		System.out.print("Informe o ano a ser analisado:");
		Ano = Integer.parseInt (System.console().readLine());
		if (Ano > 1584 && Ano%4==0 || Ano%400==0){System.out.print(Ano);
		System.out.println(" e um ano bissexto."); }
		else System.out.print("Nao e um ano bissexto.");
	}
}
		