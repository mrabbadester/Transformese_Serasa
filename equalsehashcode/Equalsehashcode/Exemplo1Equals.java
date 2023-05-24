package Equalsehashcode;

public class Exemplo1Equals {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Gabriel ";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Gabriel ";
		
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa("Ariel ");
		
		//utilizando o equals
		// Ele retorna verdadeiro ou falso
		
		
		
		//é false pois o enderenço de memoria é diferente
		System.out.println(pessoa1 == pessoa2);
		
		System.out.println(pessoa1.equals(pessoa2));
		
		pessoa1.dizBomDia();
		// recebo uma String
		pessoa1.dizBoaTarde("Ariel ");
		// recebo uma String e um numero inteiro
		pessoa1.dizBoaNoite("Tati ", 20 );
		// recebo um objeto 
		pessoa1.equals(pessoa2);
		
		int idade = 8;
		int idade2 = 8;
		
		System.out.println();
		
	}

}
