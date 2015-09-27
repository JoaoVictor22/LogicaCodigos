public class maior_salario {
	public static void main(String[]args){
	
	double salario1, salario2, salario3, maior;
	String nome1, nome2, nome3;
	
	nome1= System.console().readLine();
	nome2= System.console().readLine();
	nome3= System.console().readLine();
	salario1 = Double.parseDouble(System.console().readLine());
	salario2 = Double.parseDouble(System.console().readLine());
	salario3 = Double.parseDouble(System.console().readLine());
	
	maior = salario1;
	
	if(salario2>maior) maior = salario2;
	if(salario3>maior) maior = salario3;
	
	if (salario1==maior) System.out.println(nome1);
	if (salario2==maior) System.out.println(nome2);
	if (salario3==maior) System.out.println(nome3);
	
	}
}	