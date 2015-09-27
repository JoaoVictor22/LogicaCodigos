import java.net.*;
import java.io.*;

public class Aula14_Exemplo02_ComProxy {

	public static void main(String[] main) throws MalformedURLException, IOException {
		
		// Declara��o de vari�veis
		URL enderecoPagina; // Armazena o endere�o da p�gina na Internet utilizando um objeto da classe URL
		InputStream conexaoPagina; // Armazena um canal de leitura para o conte�do da p�gina utilizando um objeto
								   // da classe InputStream
		String texto;	// Armazena o conte�do completo da p�gina como um objeto String
		int caracter;	// Usada na leitura dos caracteres da p�gina a partir da Internet
		
		// Constr�i o objeto URL para guardar o endere�o da p�gina na Internet
		enderecoPagina = new URL("http://www.beans-r-us.biz/prices.html");
		
		// Abre um canal de leitura. O m�todo openStream da classe URL retorna um objeto da classe InputStream
		// para termos acesso ao canal de leitura criado. Armazenamos esse objeto na vari�vel conexaoPagina.
		// Aqui utilizamos acesso ao proxy, obrigat�rio dentro da rede do IFRS.
		conexaoPagina = enderecoPagina.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.furg.br", 3128))).getInputStream();
		
		// L� o conte�do da p�gina da Internet. O conte�do ser� armazenado na vari�vel "texto".
		texto = "";
		caracter = conexaoPagina.read();
		while(caracter != -1) {
			texto = texto + (char)caracter;
			caracter = conexaoPagina.read();
		}
		
		// Mostra apenas o peda�o do conte�do da p�gina 
		System.out.println(texto.substring(233,238));
	}

}