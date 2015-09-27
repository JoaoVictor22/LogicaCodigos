public class Calculos {
	static long fatorial(int numero) {
		long result;
		int cont;
		result = 1;
		for(cont = 1; cont <= numero; cont++) {
			result *= cont;
		}
		return result;
	}
	
	static int mmc(int num1, int num2) {
		int mmc = Math.max(num1, num2);
		while(mmc % num1 != 0 || mmc % num2 != 0) {
			mmc++;
		}
		return mmc;
	}
	
	static boolean ehPrimo(int numero) {
		int i;
		for(i = 2; i < numero; i++) {
			if(numero % i == 0)
				return false;
		}
		return true;
	}
}