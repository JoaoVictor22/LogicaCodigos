public class Extra1 {
	
	public static void main(String[]args){

		System.out.println("Por favor informe duas datas, sendo que a primeira deve ser maior que a segunda");
		System.out.println("Digite a data 1");

		System.out.println("Dia : ");
		int d1= Integer.parseInt(System.console().readLine());
		System.out.println("Mes : ");
		int m1= Integer.parseInt(System.console().readLine());
	 	System.out.println("Ano : ");
		int a1= Integer.parseInt(System.console().readLine());

		System.out.println("Digite a data 2");

		System.out.println("Dia : ");
		int d2= Integer.parseInt(System.console().readLine());
		System.out.println("Mes : ");
		int m2= Integer.parseInt(System.console().readLine());
	 	System.out.println("Ano : ");
		int a2= Integer.parseInt(System.console().readLine());

		int diferenca = 0;
		int t1 = 0, t2 = 0;


		t1 = d1 + 365*a1;
		t2 = d2 + 365*a2;


		if(m1 == 2) t1 += 31;
		if(m2 == 2) t2 += 31;
		if(m1 == 3) t1 += 59;
		if(m2 == 3) t2 += 59;
		if(m1 == 4) t1 += 90;
		if(m2 == 4) t2 += 90;
		if(m1 == 5) t1 += 120;
		if(m2 == 5) t2 += 120;
		if(m1 == 6) t1 += 151;
		if(m2 == 6) t2 += 151;
		if(m1 == 7) t1 += 181;
		if(m2 == 7) t2 += 181;
		if(m1 == 8) t1 += 212;
		if(m2 == 8) t2 += 212;
		if(m1 == 9) t1 += 243;
		if(m2 == 9) t2 += 243;
		if(m1 == 10) t1 += 273;
		if(m2 == 10) t2 += 273;
		if(m1 == 11) t1 += 304;
		if(m2 == 11) t2 += 304;
		if(m1 == 12) t1 += 334;
		if(m2 == 12) t2 += 334;

		int t = t1 - t2;
		System.out.println("A diferenca em dias entre as datas e: " + t);

		
	}
}