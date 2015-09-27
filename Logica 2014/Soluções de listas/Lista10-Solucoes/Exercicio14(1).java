 // Utilizando os métodos da classe Data já definidos, escreva um programa em Java que permita somar um determinado número de dias, meses ou anos a uma data. 
 // Primeiramente, o programa deve solicitar ao usuário que informe uma data (como um valor String, no formato especificado no exercício 9 da lista 7). 
 // Caso a data seja inválida, o programa deve mostrar uma mensagem (utilize o método feito no exercício 10 para verificar se a data é válida ou inválida).
 // Caso a data seja válida, o programa deve pedir ao usuário que informe uma quantidade a ser somada a data. 
 // O programa deve ler um String, que deverá ter um número inteiro seguido da palavra dias, meses ou anos. 
 // Por exemplo, se o usuário digitar “5 dias” devem ser somados 5 dias na data(cuidado, pois o número de dias a ser somado pode levar a uma data para o próximo mês 
 // – seu programa deve saber lidar com isso). Caso o usuário digite “6 meses” devem ser somados 6 meses na data (cuidado, pois o número de meses pode levar a uma data
 // para o próximo ano – seu programa deve saber lidar com isso). Caso o usuário digite “3 anos”, devem ser somados 3 anos na data. A data resultante deve ser mostrada 
 // na tela, utilizando o caractere “/” como separador. 
 
 public class Exercicio14 {
	public static int n_req (String req) {
		int pos, n;
		String N;
		pos = req.indexOf(" ");
		N = req.substring(0, pos); 
		n = Integer.parseInt(N);
		return n; }
		
	public static String tipo (String req) {
		String tipo;
		int pos, comp;
		comp = req.length();
		pos = req.indexOf(" ");
		tipo = req.substring(pos+1, comp);
		return tipo; }
	
	public static int maxDias(int mes) {
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			return 31;
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;
		else
			return 29;
	}

	public static void main (String[] args) {
		String date, req, tipo, n, diaD, mesD, anoD;
		boolean val;
		
		System.out.println("Please type a date in the following format: DD/MM/YYYY.");
		date = System.console().readLine();
		val = Data.validade(date);
		
		if(!(val)) {
		do { System.out.println("The date informed is incorrect, please type another date.\n Remeber to follow the format.\n\n.");
		date = System.console().readLine();
		val = Data.validade(date); } while (! val); }
		
		System.out.println("What is the amount of time that you want to add to your date?");
		req = System.console().readLine();
		
		n = Exercicio14.n_req(date);
		tipo = Exercicio14.tipo(date);
		
		diaD = Data.dia(date);
	    mesD = Data.mes(date);
		anoD = Data.ano(date);
		
		if(tipo.equalsIgnoreCase("dias")) {
			diaD += incremento;
			while(diaD > maxDias(mesD)) {
				diaD -= maxDias(mesD);
				mesD++;
				if(mesD > 12) {
					ano++;
					mesD = 1;
				}
			}
			
		// Verifica se deve somar meses.
		} else if(tipo.equalsIgnoreCase("meses")) {
			mesD += incremento % 12;
			anoD += incremento / 12;
			if(mesD > 12) {
				mesD -= 12;
				anoD++;
			}
		
		// Verifica se deve somar anos.
		} else  if(tipo.equalsIgnoreCase("anos")) {
			anoD += incremento;
		
		// Caso o tipo de quantidade não seja nem dias, nem meses, nem anos, mostra mensagem de erro.
		} else {
			System.out.println("Quantidade invalida!");
			System.exit(0);
		}
		
		// Mostra a data somada.
		System.out.printf("Data = %02d/%02d/%04d\n", diaD, mesD, anoD);
	}
						
					   
		