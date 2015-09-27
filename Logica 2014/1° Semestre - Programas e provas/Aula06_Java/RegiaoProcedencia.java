public class RegiaoProcedencia {
	public static void main (String[] args) {
		double preco;
		int codigo;
		System.out.print("Informe o preco do produto:");
		preco = Double.parseDouble (System.console().readLine());
		System.out.println("Informe o codigo do produto(numero inteiro):");
		codigo = Integer.parseInt (System.console().readLine());
		if (codigo == 1){System.out.print(preco);
		System.out.println(" produto originario do norte.");}
		if (codigo == 2 || codigo == 5 || codigo == 9) { System.out.print(preco);
		System.out.println(" produto originario do sul."); }
		if (codigo == 3 || codigo == 10 || codigo == 11 || codigo == 12 || codigo == 13 || codigo == 14 || codigo == 15) { System.out.print(preco);
		System.out.println(" produto originario do leste."); }
		if (codigo == 7 || codigo == 20) { System.out.print(preco);
		System.out.println(" produto originario do oeste."); }
		if (!(codigo == 1 || codigo == 2 || codigo == 5 || codigo == 9 ||codigo == 3 || codigo == 10 || codigo == 11 || codigo == 12 || codigo == 13 || codigo == 14 || codigo == 15 || codigo == 7 || codigo == 20)){
		System.out.print(preco);
		System.out.println (" produto importado."); }
	}
}
		