import java.net.*;
import java.io.*;

public class Aula14_Exemplo03_ComProxy {

	public static void main(String[] main) throws MalformedURLException, IOException {
		URL enderecoPagina;
		InputStream conexaoPagina;
		String texto, opcaoFidelidade;
		int caracter, padrao, inicioPreco, fimPreco;
		
		System.out.print("Deseja consultar os preços do programa de fidelidade (S ou N)? ");
		opcaoFidelidade = System.console().readLine();
		
		// O método equalsIgnoreCase permite comparar uma string com outra sem diferenças de maiúsculas e
		// minúsculas. Isso significa que "s".equalsIgnoreCase("S") é true. Mais um método da classe String
		// para ser anotado na coleção, junto com o método equals e o método substring.
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
