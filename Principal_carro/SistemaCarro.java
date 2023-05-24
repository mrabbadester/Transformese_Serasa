package Principal_carro;

public class SistemaCarro {
	
	
	public static void main(String[] args) {		
		
		Carro carro1 = new Carro();

		carro1.placa = new Placa();
		
		System.out.println("A placa do carro é: ");
		System.out.println(carro1.placa.dadosPlaca);
	}

}