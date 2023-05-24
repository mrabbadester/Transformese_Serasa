package equalsehashcode1;

public class Exemplo1 {

public static void main(String[] args) {
		
		String nome1 = "Marlus";
		String nome2 = "Marlus";
		String nome3 = "Alan";
		String nome4 = "Marcos suda";
		
		System.out.println(nome1.equals(nome2));
		
		System.out.println(nome1.hashCode());
		System.out.println(nome2.hashCode());
		System.out.println(nome3.hashCode());
		System.out.println(nome4.hashCode());
			
  }
}