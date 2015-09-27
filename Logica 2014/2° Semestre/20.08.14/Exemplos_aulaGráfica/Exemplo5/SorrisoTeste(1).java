//aplicativo de teste que exibe um rosto sorridente
import javax.swing.JFrame;
public class SorrisoTeste {
	public static void main(String[] args) {
		Sorriso painel = new Sorriso();
		JFrame aplicativo = new JFrame();
		aplicativo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		aplicativo.add( painel );
		aplicativo.setSize( 230, 250 );
		aplicativo.setVisible( true );
	} //fim de main
} //fim da classe SorrisoTeste
