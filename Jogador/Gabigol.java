package Jogador;

public class Gabigol {
	
	public static void main(String[] args) {
		
		ViniciusJr viniciusJr = new ViniciusJr();
		
		System.out.println(viniciusJr.nome);
		
		//este é privado
		System.out.println(ViniciusJr.formaDeJogar);
		System.out.println(viniciusJr.planoDeDefesa);
		System.out.println(viniciusJr.baterFalta);
		
		viniciusJr.alteraFormadeJogar("Marcos pediu pra trocar de camista");
		
	}

}
