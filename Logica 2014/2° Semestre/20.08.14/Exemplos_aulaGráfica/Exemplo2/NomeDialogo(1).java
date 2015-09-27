import javax.swing.JOptionPane;
public class NomeDialogo {	
	public static void main(String[] args) {
		//pede ao usuário para inserir seu nome
		String nome = JOptionPane.showInputDialog("Qual é seu nome?");
		//cria a mensagem
		String mensagem = String.format("Bem vindo, %s, a programação Java", nome);
		//exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, mensagem);
	} //fim de main
} //termina NomeDialogo
		
	
