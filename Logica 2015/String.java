public class String {

public static void main (String[]args) {

//Capitalizar

String s = System.console().readLine(); //jose da silva pereira da costa
int p = s.indexOf(" ");
while(p != -1) {
	s = s.substring(0,p+1)+(char)(s.charAt(p+1)-32)+s.substring(p+2);
	p = s.indexOf(" ",p+1);
}

/*
s = (char)(s.charaAt(0)-32)+s.substring(1);
s = (char)(s.substring(0,0)+(char)(s.charAt(0)-32)+s.substring(9);
s = (char)(s.substring(0,14)+(char)(s.charAt(14)-32)+s.substring(15);
s = (char)(s.substring(0,22)+(char)(s.charAt(22)-32)+s.substring(23);

int pos = s.indexOf(" "); //4
pos = s.indexOf(" ",pos+1); //7
pos = s.s.IndexOf(" ",pos+1); //13
*/ 
 
 }
 }