/*Escreva um programa em Java para simular a fase de eliminatórias da Copa do Brasil.
 Deverão ser considerados 32 times iniciais, que se enfrentarão no esquema de eliminatórias, com jogo de ida e jogo de volta.
 Não serão considerados gols qualificados.
 Será considerado vencedor e avançará para a próxima fase aquele time que obtiver o maior saldo de gols considerando os jogos de ida e de volta. 


 Caso o saldo de gols dos dois times seja igual, o resultado será definido nos pênaltis. Na primeira fase, os 32 times se enfrentam 2 a 2 e 16 times avançam para a segunda fase. Na segunda fase, os 16 times se enfrentam 2 a 2 e 8 times avançam para a próxima fase e assim por diante, até que sobrem apenas 2 times que se enfrentarão na fase final.

1) Deverão ser informados os nomes dos 32 times iniciais
2) Deverão ser montadas as chaves, 1o. time enfrenta o 2o. time, 3o. time enfrenta o 4o. e assim por diante
3) Deverão ser informados os placares dos jogos de ida da fase
4) Deverão ser informados os placares dos jogos de volta da fase
5) Deverão ser informados os placares dos pênaltis, quando necessário
6) Deverão ser exibidos os times que avançam para a próxima fase
7) Os passos de 2 a 6 deverão ser repetidos até a fase final
8) Deverá ser mostrado o time vencedor
*/

public class Trab_logica {
	
	public static void main(String [] args){


	System.out.println("Diga o nome do time 1 : ");
	String t1 = System.console().readLine();

	System.out.println("Diga o nome do time 2 : ");
	String t2 = System.console().readLine();

	System.out.println("Diga o nome do time 3 : ");
	String t3 System.console().readLine();

System.out.println("Diga o nome do time 4 : ");
	String t4 = System.console().readLine();

System.out.println("Diga o nome do time 5 : ");
	String t5 = System.console().readLine();

System.out.println("Diga o nome do time 6 : ");
	String t6 = System.console().readLine();

System.out.println("Diga o nome do time 7 : ");
	String t7 = System.console().readLine();

System.out.println("Diga o nome do time 8 : ");
	String t8 = System.console().readLine();

System.out.println("Diga o nome do time 9 : ");
	String t9 = System.console().readLine();

System.out.println("Diga o nome do time 10 : ");
	String t10 = System.console().readLine();

System.out.println("Diga o nome do time 11 : ");
	String t11 = System.console().readLine();

System.out.println("Diga o nome do time 12 : ");
	String t12 = System.console().readLine();

System.out.println("Diga o nome do time 13 : ");
	String t13 = System.console().readLine();

System.out.println("Diga o nome do time 14 : ");
	String t14 = System.console().readLine();

System.out.println("Diga o nome do time 15 : ");
	String t15 = System.console().readLine();

System.out.println("Diga o nome do time 16 : ");
	String t16 = System.console().readLine();

System.out.println("Diga o nome do time 17 : ");
	String t17 = System.console().readLine();

System.out.println("Diga o nome do time 18 : ");
	String t18 = System.console().readLine();

System.out.println("Diga o nome do time 19 : ");
	String t19 = System.console().readLine();

System.out.println("Diga o nome do time 20 : ");
	String t20 = System.console().readLine();

System.out.println("Diga o nome do time 21 : ");
	String t21 = System.console().readLine();

System.out.println("Diga o nome do time 22 : ");
	String t22 = System.console().readLine();

System.out.println("Diga o nome do time 23 : ");
	String t23 = System.console().readLine();

System.out.println("Diga o nome do time 24 : ");
	String t24 = System.console().readLine();

System.out.println("Diga o nome do time 25 : ");
	String t25 = System.console().readLine();

System.out.println("Diga o nome do time 26 : ");
	String t26 = System.console().readLine();

System.out.println("Diga o nome do time 27 : ");
	String t27 = System.console().readLine();

System.out.println("Diga o nome do time 28 : ");
	String t28 = System.console().readLine();

System.out.println("Diga o nome do time 29 : ");
	String t29 = System.console().readLine();

System.out.println("Diga o nome do time 30 : ");
	String t30 = System.console().readLine();

System.out.println("Diga o nome do time 31 : ");
	String t31 = System.console().readLine();

System.out.println("Diga o nome do time 32 : ");
	String t32 = System.console().readLine();

System.out.println("Primeira Chave :"+t1+" vs "+t2);
System.out.println(t3+" vs "+t4);
System.out.println(t5+" vs "+t6);
System.out.println(t7+" vs "+t8);
System.out.println(t9+" vs "+t10);
System.out.println(t11+" vs "+t12);
System.out.println(t13+" vs "+t14);
System.out.println(t15+" vs "+t16);
System.out.println("Segunda chave : "+t17" vs "+t18);
System.out.println(t19+" vs "+t20);
System.out.println(t21+" vs "+t22);
System.out.println(t23+" vs "+t24);
System.out.println(t25+" vs "+t26);
System.out.println(t27+" vs "+t28);
System.out.println(t29+" vs "+t30);
System.out.println(t31+" vs "+t32);


System.out.print("Jogo de Ida")
System.out.println();

System.out.println("Primeiro jogo : ");
System.out.println("Digite quantos gols "+t1" fez :");
int g1=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t2" fez :");
int g2=Integer.parseInt(System.console().readLine());

System.out.println("Segundo jogo: ");
System.out.println("Digite quantos gols "+t3" fez :");
int g3=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t4" fez :");
int g4=Integer.parseInt(System.console().readLine());

System.out.println("Terceiro jogo: ");
System.out.println("Digite quantos gols "+t5" fez :");
int g5=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t6" fez :");
int g6=Integer.parseInt(System.console().readLine());

System.out.println("Quarto jogo: ");
System.out.println("Digite quantos gols "+t7" fez :");
int g7=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t8" fez :");
int g8=Integer.parseInt(System.console().readLine());

System.out.println("Quinto jogo: ");
System.out.println("Digite quantos gols "+t9" fez :");
int g9=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t10" fez :");
int g10=Integer.parseInt(System.console().readLine());

System.out.println("Sexto jogo: ");
System.out.println("Digite quantos gols "+t11" fez :");
int g11=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t12" fez :");
int g12=Integer.parseInt(System.console().readLine());

System.out.println("Setimo jogo: ");
System.out.println("Digite quantos gols "+t13" fez :");
int g13=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t14" fez :");
int g14=Integer.parseInt(System.console().readLine());

System.out.println("Oitavo jogo: ");
System.out.println("Digite quantos gols "+t15" fez :");
int g15=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t16" fez :");
int g16=Integer.parseInt(System.console().readLine());

System.out.println("Nono jogo: ");
System.out.println("Digite quantos gols "+t17" fez :");
int g17=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t18" fez :");
int g18=Integer.parseInt(System.console().readLine());

System.out.println("Decimo jogo: ");
System.out.println("Digite quantos gols "+t19" fez :");
int g19=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t20" fez :");
int g20=Integer.parseInt(System.console().readLine());

System.out.println("Decimo Primeiro jogo: ");
System.out.println("Digite quantos gols "+t21" fez :");
int g21=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t22" fez :");
int g22=Integer.parseInt(System.console().readLine());

System.out.println("Decimo Segundo jogo: ");
System.out.println("Digite quantos gols "+t23" fez :");
int g23=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t24" fez :");
int g24=Integer.parseInt(System.console().readLine());

System.out.println("Decimo Terceiro jogo: ");
System.out.println("Digite quantos gols "+t25" fez :");
int g25=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t26" fez :");
int g26=Integer.parseInt(System.console().readLine());

System.out.println("Decimo Quarto jogo : ");
System.out.println("Digite quantos gols "+t27" fez :");
int g27=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t28" fez :");												
int g28=Integer.parseInt(System.console().readLine());

System.out.println("Decimo Quinto jogo: ");
System.out.println("Digite quantos gols "+t29" fez :");
int g29=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t30" fez :");
int g30=Integer.parseInt(System.console().readLine());

System.out.println("Decimo sexto jogo : ");
System.out.println("Digite quantos gols "+t31" fez :");
int g31=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t32" fez :");
int g32=Integer.parseInt(System.console().readLine());

System.out.println("-----------------------------------------------------------------------------------------------");

System.out.print("Jogo de Volta")
System.out.println();

System.out.println("Primeiro jogo : ");
System.out.println("Digite quantos gols "+t1" fez :");
int g33=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t2" fez :");
int g34=Integer.parseInt(System.console().readLine());
if ((g1+g33) > (g2 + g34)){
	t1=t1;
	System.out.print(t1+"Ganhou")
}else{
	System.out.print(t2+"Ganhou")
}
if ((g1+g33) == (g2 + g34)){
	System.out.println("Penaltis");
	System.out.println();

	System.out.println("Quantos gols "+t1+"fez : ");
	int p1=Integer.parseInt(System.console().readLine());

	System.out.println("Quantos gols "+t2+"fez : ");
	int p2=Integer.parseInt(System.console().readLine());
	if(p1>p2){
		System.out.println(t1+" Ganhou");
	}else{
		System.out.println(t2+" Ganhou")
	}
}

System.out.println();

System.out.println("Segundo jogo: ");
System.out.println("Digite quantos gols "+t3" fez :");
int g35=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t4" fez :");
int g36=Integer.parseInt(System.console().readLine());

if ((g3+g35) > (g4 + g36)){
	t1=t1;
	System.out.print(t3+"Ganhou")
}else{
	System.out.print(t4+"Ganhou")
}
if ((g3+g35) == (g4 + g36)){
	System.out.println("Penaltis");
	System.out.println();

	System.out.println("Quantos gols "+t3+"fez : ");
	int p3=Integer.parseInt(System.console().readLine());

	System.out.println("Quantos gols "+t4"fez : ");
	int p4=Integer.parseInt(System.console().readLine());
	if(p3>p4){
		System.out.println(t3+" Ganhou");
	}else{
		System.out.println(t4+" Ganhou")
	}
}
System.out.println();

System.out.println("Terceiro jogo: ");
System.out.println("Digite quantos gols "+t5" fez :");
int g37=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t6" fez :");
int g38=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Quarto jogo: ");
System.out.println("Digite quantos gols "+t7" fez :");
int g39=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t8" fez :");
int g40=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Quinto jogo: ");
System.out.println("Digite quantos gols "+t9" fez :");
int g41=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t10" fez :");
int g42=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Sexto jogo: ");
System.out.println("Digite quantos gols "+t11" fez :");
int g43=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t12" fez :");
int g44=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Setimo jogo: ");
System.out.println("Digite quantos gols "+t13" fez :");
int g45=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t14" fez :");
int g46=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Oitavo jogo: ");
System.out.println("Digite quantos gols "+t15" fez :");
int g47=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t16" fez :");
int g48=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Nono jogo: ");
System.out.println("Digite quantos gols "+t17" fez :");
int g49=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t18" fez :");
int g50=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Decimo jogo: ");
System.out.println("Digite quantos gols "+t19" fez :");
int g51=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t20" fez :");
int g52=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Decimo Primeiro jogo: ");
System.out.println("Digite quantos gols "+t21" fez :");
int g53=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t22" fez :");
int g54=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Decimo Segundo jogo: ");
System.out.println("Digite quantos gols "+t23" fez :");
int g55=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t24" fez :");
int g56=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Decimo Terceiro jogo: ");
System.out.println("Digite quantos gols "+t25" fez :");
int g57=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t26" fez :");
int g58=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Decimo Quarto jogo : ");
System.out.println("Digite quantos gols "+t27" fez :");
int g59=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t28" fez :");
int g60=Integer.parseInt(System.console().readLine());


System.out.println();

System.out.println("Decimo Quinto jogo: ");
System.out.println("Digite quantos gols "+t29" fez :");
int g61=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t30" fez :");
int g62=Integer.parseInt(System.console().readLine());

System.out.println();

System.out.println("Decimo sexto jogo : ");
System.out.println("Digite quantos gols "+t31" fez :");
int g63=Integer.parseInt(System.console().readLine());
System.out.println("Digite quantos gols "+t32" fez :");
int g64=Integer.parseInt(System.console().readLine());


if ((g1+g33) > (g2 + g34)){
	t1=t1;
	System.out.print(t1+"Ganhou")
}else{
	System.out.print(t2+"Ganhou")
}
if ((g1+g33) == (g2 + g34)){
	System.out.println("Penaltis");
	System.out.println();

	System.out.println("Quantos gols "+t1+"fez : ");
	int p1=Integer.parseInt(System.console().readLine());

	System.out.println("Quantos gols "+t2+"fez : ");
	int p2=Integer.parseInt(System.console().readLine());
	if(p1>p2){
		System.out.println(t1+" Ganhou");
	}else{
		System.out.println(t2+" Ganhou")
	}
}





