public class Saudacoes {
	public static void main (String[] args){
		String nome, sexo;
		System.out.print("Informe o seu nome:");
		nome = System.console().readLine();
		System.out.print("Informe o seu sexo(feminino ou masculino):");
		sexo = System.console().readLine();
		if (sexo.equals("feminino")) { System.out.printf("Ilma. Sra. %s\n", nome);
		} else { System.out.printf("Ilmo. Sr. %s\n", nome); }
	}
}