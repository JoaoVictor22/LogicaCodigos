import java.net.*;
import java.io.*;

public class Aula14_Exemplo02 {

	public static void main(String[] main) throws MalformedURLException, IOException {
		
		// Declaracao de variaveis
		URL enderecoPagina; // Armazena o endereco da pagina na Internet utilizando um objeto da classe URL
		InputStream conexaoPagina; // Armazena um canal de leitura para o conteudo da pagina utilizando um objeto
								   // da classe InputStream
		String texto;	// Armazena o conteudo completo da pagina como um objeto String
		int caracter;	// Usada na leitura dos caracteres da pagina a partir da Internet
		
		// Constroi o objeto URL para guardar o endereco da pagina na Internet
		enderecoPagina = new URL("http://beans-r-us.appspot.com/prices.html");
		
		// Abre um canal de leitura. O metodo openStream da classe URL retorna um objeto da classe InputStream
		// para termos acesso ao canal de leitura criado. Armazenamos esse objeto na variavel conexaoPagina.
		conexaoPagina = enderecoPagina.openStream();
		
		// Le o conteudo da pagina da Internet. O conteudo sera armazenado na variavel texto.
		texto = "";
		caracter = conexaoPagina.read();
		while(caracter != -1) {
			texto = texto + (char)caracter;
			caracter = conexaoPagina.read();
		}
		
		// Mostra apenas o pedaco do conteudo da pagina 
		System.out.println(texto.substring(233,238));
	}

}
