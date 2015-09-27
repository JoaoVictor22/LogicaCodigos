import java.net.*;
import java.io.*;

public class Aula14_Exemplo03_ComProxy {

	public static void main(String[] main) throws MalformedURLException, IOException {
		URL enderecoPagina;
		InputStream conexaoPagina;
		String texto, opcaoFidelidade;
		int caracter, padrao, inicioPreco, fimPreco;
		
		System.out.print("Deseja consultar os pre�os do programa de fidelidade (S ou N)? ");
		opcaoFidelidade = System.console().readLine();
		
		// O m�todo equalsIgnoreCase permite comparar uma string com outra sem diferen�as de mai�sculas e
		// min�sculas. Isso significa que "s".equalsIgnoreCase("S") � true. Mais um m�todo da classe String
		// para ser anotado na cole��o, junto com o m�todo equals e o m�todo substring.
		if(opcaoFidelidade.equalsIgnoreCase("S"))
			enderecoPagina = new URL("http://beans-r-us.appspot.com/prices-loyalty.html");
		else
			enderecoPagina = new URL("http://beans-r-us.appspot.com/prices.html");
		
		conexaoPagina = enderecoPagina.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.furg.br", 3128))).getInputStream();
		
		texto = "";
		caracter = conexaoPagina.read();
		while(caracter != -1) {
			texto = texto + (char)caracter;
			caracter = conexaoPagina.read();
		}
		
		System.out.println(texto.substring(233, 238));
	}

}
