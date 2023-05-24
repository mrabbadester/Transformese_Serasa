package ComputadorPC;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args){
		
		char opcao = 's';
		
		Scanner entrada = new Scanner(System.in);
		
		Computador1 CPC = new Computador1();
		
		System.out.print("Ligar o computador? [S/N]: ");
		opcao = entrada.next().charAt(0);
		
		if(opcao == 's' || opcao == 'S')
			CPC.setLigado(true);
		
		else if(opcao == 'n' || opcao == 'N')
			CPC.setLigado(false);
		
		
		if(CPC.isLigado())
			System.out.println("\nLigando o computador");
		
		else
			System.out.println("\nDesligando o computador...");
	}
}
