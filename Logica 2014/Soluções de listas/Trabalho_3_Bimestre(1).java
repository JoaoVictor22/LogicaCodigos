public class Trabalho_3_Bimestre {
	public static void main (String[] args) {
		double A, B;
		int op = 0;
		
			// Leitura e "valida��o" dos valores. O procedimento se repete at� que o usu�rio informe um valor entre 1 e 6.
			
			do {
			System.out.printf("\n\n------------------------------- Calculadora ----------------------------------\n\n");
			System.out.printf("Escolha a operacao a ser realizada:\n\n1 - Adicao (+) \n2 - Subtracao (-) \n3 - Multiplicacao (*) \n4 - Divisao (/) \n5 - Resto da divisao (%%) \n6 - Sair\n\n--> ");
			op = Integer.parseInt(System.console().readLine());
				switch (op) {
				case 1 : System.out.println("\nOperacao escolhida: (+)"); break;
				case 2 : System.out.println("\nOperacao escolhida: (-)"); break;
				case 3 : System.out.println("\nOperacao escolhida: (*)"); break;
				case 4 : System.out.println("\nOperacao escolhida: (/)"); break;
				case 5 : System.out.println("\nOperacao escolhida: (%)"); break; } 
			} while (!(op > 0 && op < 7));
			
				//  Os procedimentos abaixo s�o realizados apenas se o valor de op for diferente de 6, ou seja, se o usu�rio n�o informar a op��o sair.
				
				if (op != 6) {
				
					System.out.printf("\nDigite o primeiro operando: ");
					A = Double.parseDouble(System.console().readLine());
					System.out.printf("\nDigite o segundo operando: ");
					B = Double.parseDouble(System.console().readLine());
					
						switch (op)  {
						
							// Realiza��o dos c�lculos conforme requerido pelo usu�rio no menu e exibi��o das respostas.
							
							case 1 : { System.out.printf("\nA adicao de %.2f e %.2f e igual a %.2f.\n\n", A, B, Calculadora.adicao(A, B));
									   System.out.printf("----------------------------------------------------------------------------"); break; }
							case 2 : { System.out.printf("\nA subtracao de %.2f por %.2f e igual a %.2f.\n\n",A, B, Calculadora.subtracao(A, B));
									   System.out.printf("----------------------------------------------------------------------------"); break;}
							case 4 : { System.out.printf("\nA divisao de %.2f por %.2f e igual a %.2f.\n\n", A, B, Calculadora.divisao(A, B));
									   System.out.printf("----------------------------------------------------------------------------"); break; }
							case 3 : { System.out.printf("\nA multiplicacao de %.2f por %.2f e igual a %.2f.\n\n", A, B, Calculadora.multiplicacao(A, B));
									   System.out.printf("----------------------------------------------------------------------------"); break; }
							case 5 : { System.out.printf("\nO resto da divisao de %.2f por %.2f e igual a %.2f.\n\n", A, B, Calculadora.restodivisao(A, B)); 
									   System.out.printf("----------------------------------------------------------------------------"); break; } 
									   
									   }
			}
		}
	}