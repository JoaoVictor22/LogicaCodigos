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



		for (int i = 0; !(d1 == d2 && m1 == m2 && a1 == a2); i++) {
			d2++;
			diferenca++;
			if (m2 == 1 || m2 == 3 || m2 == 5 || m2 == 7 || m2 == 8 || m2 == 10 || m2 == 12)  {
				if (d2 > 31) {
					m2++;
					d2 = d2 % 31;
				}
			}
			if (m2 == 4 || m2 == 6 || m2 == 9 || m2 == 11)  {
				if (d2 > 30) {
					m2++;
					d2 = d2 % 30;
				}
			}
			if (m2 == 2) {
				if (d2 > 28) {
					m2++;
					d2 = d2 % 28;
					
				} 
			}

			if (m2 > 12) {  
				a2 += m2 / 12;
				m2 = m2 % 12;
			}
			
		}

		System.out.println("A diferenca em dias entre as datas e: " + diferenca);

		




		/*public int differenceInDays (Date a) {
		
		Date n = new Date();
		int i = 0;
		
		if (this.isBefore(a)) { 
			n = this;
			for (; n.isTheSame(a) == false; i++) n = n.sumDays(1);
		} 

		else {
			n = a;
			for (;!(n.isTheSame(a)); i++) n = n.sumDays(1);
		}

		return i;
	}
*/




	}
}