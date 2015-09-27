//aplicativo de teste que exibi a classe Formas
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class FormasTeste {
	public static void main(String[] args) {
		//obtém a escolha do usuário
		String entrada = JOptionPane.showInputDialog(
			"Digite 1 para desenhar retângulos\n"
			+ "Digite 2 para desenhar círculos");
		//converte a entrada em inteiro		
		int escolha = Integer.parseInt( entrada );
		//cria o painel com a entrada do usuário
		Formas painel = new Formas( escolha );
		//cria um novo JFrame		
		JFrame aplicativo = new JFrame();
		aplicativo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		aplicativo.add( painel ); //adiciona o painel ao frame
		aplicativo.setSize( 300, 300 ); //Configura o tamanho desejado
		aplicativo.setVisible( true ); //mostra o frame
	} //fim de main
} //fim da classe FormasTeste
		
	
