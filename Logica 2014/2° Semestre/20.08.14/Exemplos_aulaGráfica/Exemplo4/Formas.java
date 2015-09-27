//demonstra o desenho de diferentes formas
import java.awt.Graphics;
import javax.swing.JPanel;
public class Formas extends JPanel {
	int escolha; //escolha da forma a desenhar
	//construtor configura a escolha do usuário
	public Formas ( int escolhaUsuario ) {
		escolha = escolhaUsuario;
	} //fim do construtor
	/*desenha uma cascata de formas que 
	iniciam do canto superior esquerdo*/
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		for(int i = 0; i < 10; i++) {
		//seleciona a forma com base na escolha do usuário
			switch(escolha) {
				case 1: g.drawRect(10 + i * 10, 10 + i * 10, 
						50 + i * 10, 50 + i * 10);
					break;
				case 2: g.drawOval(10 + i * 10, 10 + i * 10,
						50 + i * 10, 50 + i * 10);
					break;
			} //fim do switch
		} //fim do for
	} //fim do método paintComponent
} //fim da classe Formas
									
	
	
