//aplicativo para exibir um DrawPanel
import javax.swing.JFrame;
public class DrawPanelTeste {
	public static void main(String[] args) {
		//cria um painel que contém nosso desenho
		DrawPanel panel = new DrawPanel();
		//cria um novo frame para armazenar o painel
		JFrame aplicativo = new JFrame();
		/*configura o frame para ser encerrado quando 
		é fechado*/
		aplicativo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		aplicativo.add( panel ); //adiciona o painel ao frame
		aplicativo.setSize(250, 250); //configura o tamanho do frame
		aplicativo.setVisible( true ); //torna o frame visível
	} //fim de main
} //fim da classe DrawPanelTeste
	


