package Jogador;

public class ViniciusJr {

	public String nome = "Vinicius Junior";
	
	static String formaDeJogar = "Atacar pela esquerda ";
	
	String planoDeDefesa = "Defeder pelo meio";
	
	protected String baterFalta = "Por cima da barreira";
	
	public void  alteraFormadeJogar(String novaForma) {
		System.out.println("Forma antiga de jogar: " + formaDeJogar);
		formaDeJogar = novaForma;
		System.out.println("A nova forma de jogar: " + formaDeJogar);
	}

	

	
}

