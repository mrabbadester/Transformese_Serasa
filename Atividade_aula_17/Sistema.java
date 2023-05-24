package Atividade_aula_17;

public class Sistema {
	
	public static void main(String[] args) {
		Piloto piloto1 = new Piloto();
		
		System.out.println(piloto1.nome);
		
		piloto1.nome = "Marlus";
		piloto1.sobreNome = "Abbade";
		
		Piloto piloto2 = new Piloto();
		piloto2.nome = "Alan";
		piloto2.sobreNome = "Abbade";
		
		Aviao aviao1 = new Aviao();
		aviao1.fabricante = "Embraer";
		aviao1.modelo = "111-AAA";
		aviao1.passageiros = 50;
		aviao1.qtdeMotores = 2;
		aviao1.piloto = piloto1;
		
		Aviao aviao2 = new Aviao();
		aviao2.fabricante = "Embraer";
		aviao2.modelo = "111-AAA";
		aviao2.passageiros = 85;
		aviao2.qtdeMotores = 4;
		aviao2.piloto = piloto2;
		
		Aviao aviao3= new Aviao();
		System.out.println("O Fabricante do aviao 3: " + aviao3.fabricante);
		System.out.println("O quantidade de motores: " + aviao1.qtdeMotores);
		
		System.out.println("\n");
		
		System.out.println("Dados aviao 1 ");
		System.out.println("O modelo do aviao: " + aviao1.modelo);
		System.out.println("O nome do piloto: " + aviao1.piloto.nome);
		
		System.out.println("\n");
		
		System.out.println("Dados aviao 2");
		System.out.println(aviao2.modelo);
		
	}

}
