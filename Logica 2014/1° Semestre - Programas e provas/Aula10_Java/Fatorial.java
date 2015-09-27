public class Fatorial {
public static void main(String[] args) {
int cont, fat, num;
System.out.print(“Digite um número: ”);
num = Integer.parseInt(System.console().readLine());
fat = 1;
for(cont = num; cont >= 2; cont = cont-1) {
fat = fat * cont;
}
System.out.printf(“Fatorial = %d\n”, fat);
}
}