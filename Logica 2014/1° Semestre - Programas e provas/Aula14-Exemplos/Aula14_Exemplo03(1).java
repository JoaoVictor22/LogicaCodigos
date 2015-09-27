import java.net.*;
import java.io.*;

public class Aula14_Exemplo03 {

	public static void main(String[] main) throws MalformedURLException, IOException {
		URL enderecoPagina;
		InputStream conexaoPagina;
		String texto, opcaoFidelidade;
		int caracter, padrao, inicioPreco, fimPreco;
		
		System.out.print("Deseja consultar os precos do programa de fidelidade (S ou N)? ");
		opcaoFidelidade = System.console().readLine();
		
		// O metodo equalsIgnoreCase permite comparar uma string com outra sem diferencas de maiusculas e
		// minusculas. Isso significa que "s".equalsIgnoreCase("S") e true. Mais um metodo da classe String
		// para ser anotado na colecao, junto com o metodo equals e o metodo substring.
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
