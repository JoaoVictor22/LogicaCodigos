import java.net.*;
import java.io.*;

public class Aula14_Exemplo04 {

	public static void main(String[] main) throws MalformedURLException, IOException {
		URL enderecoPagina;
		InputStream conexaoPagina;
		String texto, opcaoFidelidade;
		int caracter, padrao, inicioPreco, fimPreco;
		
		System.out.print("Deseja consultar os pre�os do programa de fidelidade (S ou N)? ");
		opcaoFidelidade = System.console().readLine();
		
		if(opcaoFidelidade.equalsIgnoreCase("S"))
			enderecoPagina = new URL("http://beans-r-us.appspot.com/prices-loyalty.html");
		else
			enderecoPagina = new URL("http://beans-r-us.appspot.com/prices.html");
		
		conexaoPagina = enderecoPagina.openStream();
		
		texto = "";
		caracter = conexaoPagina.read();
		while(caracter != -1) {
			texto = texto + (char)caracter;
			caracter = conexaoPagina.read();
		}
		
		// Pesquisa a posi��o onde a combina��o >$ come�a.
		padrao = texto.indexOf(">$");
		
		// Calcula a posi��o inicial do pre�o (1 posi��o ap�s o in�cio de >$)
		inicioPreco = padrao+1;
		
		// Calcula a posi��o final do pre�o (5 posi��es ap�s o in�cio do pre�o)
		fimPreco = inicioPreco+5;

		// C�digo para mostrar o pre�o alterado, utilizando os novos n�meros de posi��es.
		System.out.println(texto.substring(inicioPreco, fimPreco));
	}

}
