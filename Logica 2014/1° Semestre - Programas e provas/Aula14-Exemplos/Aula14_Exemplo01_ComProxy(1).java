import java.net.*;
import java.io.*;

public class Aula14_Exemplo01_ComProxy {

	public static void main(String[] main) throws MalformedURLException, IOException {
		URL enderecoPagina;
		InputStream conexaoPagina;
		String texto;
		int caracter;
		
		enderecoPagina = new URL("http://www.beans-r-us.biz/prices.html");
		conexaoPagina = enderecoPagina.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.furg.br", 3128))).getInputStream();
		
		texto = "";
		caracter = conexaoPagina.read();
		while(caracter != -1) {
			texto = texto + (char)caracter;
			caracter = conexaoPagina.read();
		}
		
		System.out.println(texto);
	}

}