public class VolCaixaRet {
	public static void main (String[] args) {
		double alt, larg, comp, vol ;
		System.out.print("Informe a altura da caixa:");
		alt = Double.parseDouble (System.console().readLine());
		System.out.print("Informe a largura da caixa:");
		larg = Double.parseDouble (System.console().readLine());
		System.out.print("Infor,e o comprimento da caixa:");
		comp = Double.parseDouble (System.console().readLine());
		vol = alt * larg * comp;
		System.out.println("Volume da caixa = ");
		System.out.print(vol);
	}
}