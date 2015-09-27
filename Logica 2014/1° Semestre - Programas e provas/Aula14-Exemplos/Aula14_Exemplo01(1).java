import java.net.*;
import java.io.*;

public class Aula14_Exemplo01 {

	public static void main(String[] main) throws MalformedURLException, IOException {
		URL enderecoPagina;
		InputStream conexaoPagina;
		String texto;
		int caracter;
		
		enderecoPagina = new URL("http://beans-r-us.appspot.com/prices.html");
		conexaoPagina = enderecoPagina.openStream();
		
		texto = "";
		caracter = conexaoPagina.read();
		while(caracter != -1) {
			texto = texto + (char)caracter;
			caracter = conexaoPagina.read();
		}
		
		System.out.println(texto);
	}

}
