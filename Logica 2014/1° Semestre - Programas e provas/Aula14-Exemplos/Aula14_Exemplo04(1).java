import java.net.*;
import java.io.*;

public class Aula14_Exemplo04 {

	public static void main(String[] main) throws MalformedURLException, IOException {
		URL enderecoPagina;
		InputStream conexaoPagina;
		String texto, opcaoFidelidade;
		int caracter, padrao, inicioPreco, fimPreco;
		
		System.out.print("Deseja consultar os preços do programa de fidelidade (S ou N)? ");
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
		
		// Pesquisa a posição onde a combinação >$ começa.
		padrao = texto.indexOf(">$");
		
		// Calcula a posição inicial do preço (1 posição após o início de >$)
		inicioPreco = padrao+1;
		
		// Calcula a posição final do preço (5 posições após o início do preço)
		fimPreco = inicioPreco+5;

		// Código para mostrar o preço alterado, utilizando os novos números de posições.
		System.out.println(texto.substring(inicioPreco, fimPreco));
	}

}
