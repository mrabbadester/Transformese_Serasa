package Equalsehashcode;

public class Exemplo2 {

	public static void main(String[] args) {
		
		String nome1 = "Tati";
//		String nome2 = "Ariel";
		String nome2 = "Tati";
		String nome3 = "Ariel";
		String nome4 = "Ariel";
		
		// Comparando com o Equals
		System.out.println(nome1.equals(nome2));
		
		System.out.println(nome1.hashCode());
		System.out.println(nome2.hashCode());
		System.out.println(nome3.hashCode());
		System.out.println(nome4.hashCode());
		
		
	}
	
}