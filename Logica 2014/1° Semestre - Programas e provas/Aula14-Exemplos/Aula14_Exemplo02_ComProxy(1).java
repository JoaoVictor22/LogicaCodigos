import java.net.*;
import java.io.*;

public class Aula14_Exemplo02_ComProxy {

	public static void main(String[] main) throws MalformedURLException, IOException {
		
		// Declaração de variáveis
		URL enderecoPagina; // Armazena o endereço da página na Internet utilizando um objeto da classe URL
		InputStream conexaoPagina; // Armazena um canal de leitura para o conteúdo da página utilizando um objeto
								   // da classe InputStream
		String texto;	// Armazena o conteúdo completo da página como um objeto String
		int caracter;	// Usada na leitura dos caracteres da página a partir da Internet
		
		// Constrói o objeto URL para guardar o endereço da página na Internet
		enderecoPagina = new URL("http://www.beans-r-us.biz/prices.html");
		
		// Abre um canal de leitura. O método openStream da classe URL retorna um objeto da classe InputStream
		// para termos acesso ao canal de leitura criado. Armazenamos esse objeto na variável conexaoPagina.
		// Aqui utilizamos acesso ao proxy, obrigatório dentro da rede do IFRS.
		conexaoPagina = enderecoPagina.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.furg.br", 3128))).getInputStream();
		
		// Lê o conteúdo da página da Internet. O conteúdo será armazenado na variável "texto".
		texto = "";
		caracter = conexaoPagina.read();
		while(caracter != -1) {
			texto = texto + (char)caracter;
			caracter = conexaoPagina.read();
		}
		
		// Mostra apenas o pedaço do conteúdo da página 
		System.out.println(texto.substring(233,238));
	}

}