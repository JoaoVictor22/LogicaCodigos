public class ex2 {

public static void main(String[]args) {

 System.out.println("Digite uma sequencia de numeros : "); 
 int n=Integer.parseInt(System.console().readLine());
 
int menor = 99999;
int maior = 0;
double media=0;
double c=0;

 while(n!=0) {
	if(n<menor) menor = n;
	if(n > maior) maior = n;
	
	media=media/n;
	c++;
	n=Integer.parseInt(System.console().readLine());
}
if(media>0){
media = media/c;
System.out.println("o maior valor eh"+maior);
System.out.println("o menor valor eh"+menor);
System.out.println("a media eh " +media);
}

	}
}




