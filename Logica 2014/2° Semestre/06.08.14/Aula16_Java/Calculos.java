public class Calculos {

		/*Escreva um m�todo chamado fatorial que receba um valor do tipo int como 
		par�metro e retorne como resposta um valor do tipo long. Defina este m�todo
		em uma classe chamada Calculos.*/
		static long fatorial(int N) {
			long resposta = 1;
			for(; N > 0; N--) {
			resposta = N * resposta; }
			return resposta; }
				
		/* Escreva um m�todo que receba dois valores do tipo int e calcule o MMC deles.
		O m�todo deve retornar uma resposta do tipo int. Coloque este m�todo na classe Calculos. */
		static int MMC(int a, int b){  
           int i,MMC;  
           MMC = 1;  
               if(a == b){  
                  MMC = a;  
               }else{  
                  for (i=2;((a > 1) || (b > 1)); i++) {  
                     while(((a % i) == 0) || ((b % i) == 0)){  
                        if((a % i) == 0){  
                                a = a/i;      
                        }  
                        if((b % i) == 0){  
                                b = b/i;  
                        }  
                        MMC = MMC*i;  
                    }  
                 }  
               }  
               return MMC; }
			   
		// 8. Acrescente na classe Calculos um m�todo que verifique se um n�mero � primo ou n�o.
		// Este m�todo deve receber um valor do tipo int como par�metro e deve devolver uma resposta do tipo boolean.   
		static boolean primo (int num) {
			int cont, divisores = 0;
			boolean primo;
			for (cont = 2; cont < num; cont++) {
			if (num % cont == 0){
			divisores++; } }
			if (divisores == 0) {
			primo = true; }
			else { primo = false; }
			return primo; }  
	}
		
		