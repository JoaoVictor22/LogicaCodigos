public class Extra2 {
	
	public static void main (String[] args) {

		// SABENDO QUE 1/1/2015 FOI UMA QUINTA FEIRA,
		// MOSTRAR O DIA DE SEMANA CORRESPONDENTE A UMA DATA (INT DIA , MES) EM 2015

		/*
		1 - quinta
		2 - sexta
		3 - sábado
		4 - domingo
		5 - segunda
		6 - terça
		7 - quarta
		8 - quinta
		9 - sexta
		10 - sábado
		11 - domingo
		12 - segunda
		13 - 
		r = r - r%7;
		*/
		System.out.println("Por favor informe uma data em 2015.");
		System.out.println("Dia: ");
		int d = Integer.parseInt(System.console().readLine());
		System.out.println("Mes: ");
		int m = Integer.parseInt(System.console().readLine());
		int t = d;

		if(m == 2) t += 31;
		if(m == 3) t += 59;
		if(m == 4) t += 90;
		if(m == 5) t += 120;
		if(m == 6) t += 151;
		if(m == 7) t += 181;
		if(m == 8) t += 212;
		if(m == 9) t += 243;
		if(m == 10) t += 273;
		if(m == 11) t += 304;
		if(m == 12) t += 334;
		
		t = t%7;

		System.out.println("Este dia e um(a): ");

		if (t == 1) System.out.println("-> Quinta-feira");
		if (t == 2) System.out.println("-> Sexta-feira");
		if (t == 3) System.out.println("-> Sabado");
		if (t == 4) System.out.println("-> Domingo");
		if (t == 5) System.out.println("-> Segunda-feira");
		if (t == 6) System.out.println("-> Terca-feira");
		if (t == 0) System.out.println("-> Quarta-feira");
		
		

	}

}