package Matriz;


public class ExemploMatriz1 {
	
	public static void main(String[] args) {
		
		int[][] tabela = new int[3][4];
		
		for (int[] dado: tabela) {
			System.err.println("teste");
		}
		int[] carros = new int[6];
		int[] uniVendidas = new int[6];
		String[] placaCarro = new String[6];
		
		for (int carro: carros) {
			System.err.println(carro);
		}
	}

}
