
public class JogodaVelha {

	public static void main(String[] args) {
		int i = 0;
		
		String v = "1 | 2 | 3\n----------\n4 | 5 | 6\n----------\n7 | 8 | 9\n";
		int winner = 0;
		do {
		int j1;
		do{
		System.out.println(v);
		
		System.out.println("Jogador 1 informe o lugar");
		j1 = Integer.parseInt(System.console().readLine());
		
		} while(!v.contains(Integer.toString(j1)));
	
		v = v.replace(Integer.toString(j1), "X");

		System.out.println(v);
		System.out.println("----------");
		System.out.println();		
		int j2;
		i++;
		if (v.substring(0,9).equals("X | X | X")) winner = 1;
		if (v.substring(0,9).equals("O | O | O")) winner = 2;

		if (v.substring(21,30).equals("X | X | X")) winner = 1; 
		if (v.substring(21,30).equals("O | O | O")) winner = 2;

		if (v.substring(42, 51).equals("X | X | X")) winner = 1;
		if (v.substring(42, 51).equals("O | O | O")) winner = 2;

		if (v.substring(0,1).equals("X") && v.substring(25,26).equals("X") && v.substring(50, 51).equals("X")) winner = 1;
		if (v.substring(0,1).equals("O") && v.substring(25,26).equals("O") && v.substring(50, 51).equals("O")) winner = 2;

		if (v.substring(8,9).equals("X") && v.substring(25,26).equals("X") && v.substring(42,43).equals("X")) winner = 1;
		if (v.substring(8,9).equals("O") && v.substring(25,26).equals("O") && v.substring(42,43).equals("O")) winner = 2;

		if (v.substring(0,1).equals("X") && v.substring(21,22).equals("X") && v.substring(42,43).equals("X")) winner = 1;
		if (v.substring(0,1).equals("O") && v.substring(21,22).equals("O") && v.substring(42,43).equals("O")) winner = 2;

		if (v.substring(4,5).equals("X") && v.substring(25,26).equals("X") && v.substring(46,47).equals("X")) winner = 1;
		if (v.substring(4,5).equals("O") && v.substring(25,26).equals("O") && v.substring(46,47).equals("O")) winner = 2;

		if (v.substring(8,9).equals("X") && v.substring(29,30).equals("X") && v.substring(50, 51).equals("X")) winner = 1;
		if (v.substring(8,9).equals("O") && v.substring(29,30).equals("O") && v.substring(50, 51).equals("O")) winner = 2;
		if(i<8 && winner == 0) {
		do {
		
		System.out.println("Jogador 2 informe o lugar");
		j2 = Integer.parseInt(System.console().readLine());
		} while(!v.contains(""+j2));
	
		v = v.replace(Integer.toString(j2), "O");
		System.out.println(v);
		System.out.println();
		System.out.println("----------");
		System.out.println();
		}
		
		if (v.substring(0,9).equals("X | X | X")) winner = 1;
		if (v.substring(0,9).equals("O | O | O")) winner = 2;

		if (v.substring(21,30).equals("X | X | X")) winner = 1; 
		if (v.substring(21,30).equals("O | O | O")) winner = 2;

		if (v.substring(42, 51).equals("X | X | X")) winner = 1;
		if (v.substring(42, 51).equals("O | O | O")) winner = 2;

		if (v.substring(0,1).equals("X") && v.substring(25,26).equals("X") && v.substring(50, 51).equals("X")) winner = 1;
		if (v.substring(0,1).equals("O") && v.substring(25,26).equals("O") && v.substring(50, 51).equals("O")) winner = 2;

		if (v.substring(8,9).equals("X") && v.substring(25,26).equals("X") && v.substring(42,43).equals("X")) winner = 1;
		if (v.substring(8,9).equals("O") && v.substring(25,26).equals("O") && v.substring(42,43).equals("O")) winner = 2;

		if (v.substring(0,1).equals("X") && v.substring(21,22).equals("X") && v.substring(42,43).equals("X")) winner = 1;
		if (v.substring(0,1).equals("O") && v.substring(21,22).equals("O") && v.substring(42,43).equals("O")) winner = 2;

		if (v.substring(4,5).equals("X") && v.substring(25,26).equals("X") && v.substring(46,47).equals("X")) winner = 1;
		if (v.substring(4,5).equals("O") && v.substring(25,26).equals("O") && v.substring(46,47).equals("O")) winner = 2;

		if (v.substring(8,9).equals("X") && v.substring(29,30).equals("X") && v.substring(50, 51).equals("X")) winner = 1;
		if (v.substring(8,9).equals("O") && v.substring(29,30).equals("O") && v.substring(50, 51).equals("O")) winner = 2;

		i = i+1;
		} while (winner == 0 && i<9);
		if(winner == 0) System.out.println("Deu velha");
		if(winner == 1) System.out.println("Jogador 1 ganhou");
		if(winner == 2) System.out.println("Jogador 2 ganhou");
		
	}
		
}