package orientacaoobjetos.flamengo;

public class Gabigol {

	public static void main(String[] args) {
		ViniciusJr viniciusJr = new ViniciusJr();
		
		System.out.println(viniciusJr.nome);
		
		// Este é privado
		//System.out.println(viniciusJr.formaDeJogar);
		System.out.println(viniciusJr.planoDeDefesa);
		System.out.println(viniciusJr.baterFalta);
		
		viniciusJr.alteraFormaDeJogar("agora joga na defesa");
		
		
		
	}
	
	
	
	
	
}
