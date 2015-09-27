
 public class Exercicio14 {
	public static int n_req (String req) {
		int pos, n;
		String N;
		pos = req.indexOf(" ");
		N = req.substring(0, pos); 
		n = Integer.parseInt(N);
		return n; }
		
	public static int maxDias(int mes) {
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			return 31;
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;
		else
			return 29;
	}

	public static void main (String[] args) {
		String date, req, tipo="";
		int n, diaD, mesD, anoD, incremento;
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
		
		incremento = Exercicio14.n_req(req);
		if (req.contains("dias")) { tipo = "dias"; }
			else if (req.contains("meses")) { tipo = "meses"; } 
					else if (req.contains("anos")) { tipo = "anos"; } 
		
		diaD = Data.dia(date);
	    mesD = Data.mes(date);
		anoD = Data.ano(date);
		
		if(tipo.equalsIgnoreCase("dias")) {
			diaD += incremento;
			while(diaD > maxDias(mesD)) {
				diaD -= maxDias(mesD);
				mesD++;
				if(mesD > 12) {
					anoD++;
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
						
					   
 }
 