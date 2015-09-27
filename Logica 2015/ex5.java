public class ex6 {

public static void main (String[]args){

System.out.println("Digite numero 1 : ");
int n1 = Integer.parseInt(System.console().readLine());

System.out.println("Digite numero 2 : ");
int n2 = Integer.parseInt(System.console().readLine());

int r = 0;
int n = 0;

while (n<n2){

r = r+n1;
n++;
}
System.out.println(r);
}
}
