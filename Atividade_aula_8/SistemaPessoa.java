package Atividade_aula_8;

public class SistemaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Marlus";
		
		Pessoa pessoa2 = pessoa1;
		
		
		System.out.println("Nome pessoa1: " + pessoa1.nome);
		System.out.println("Nome pessoa2: " + pessoa2.nome);
		
		pessoa2.nome = "Alan";
	
		System.out.println("Nome pessoal1: " + pessoa1.nome);
		System.out.println("Nome pessoal2: " + pessoa2.nome);
		
	}
	
}
