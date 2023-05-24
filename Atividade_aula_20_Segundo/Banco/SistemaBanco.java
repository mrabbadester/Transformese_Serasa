package Banco;

import java.util.Scanner;

import Contas.ContaPf;
import Contas.ContaPj;

public class SistemaBanco {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ContaPf contaPF = new ContaPf();
	
		System.out.println("Pessoa fisica");
		System.out.println("Informa os todos a busca e o nome do titular, CPF e o valores: ");
		contaPF.nome = entrada.nextLine();
		System.out.println("Seu cpf: 123.123.123-00" + contaPF.getCpf());
		
		contaPF.maiorSaldo(100.00);
		
		System.out.println();
		System.out.println("**************************************");
		
		ContaPj contaPJ = new ContaPj();
		
		System.out.println("Pessoa Jurídica");
		System.out.println("seu empresa informa o nome do titular: ");
		contaPJ.nome = entrada.nextLine();
		System.out.println("Seu CNPJ: 123.123.123/000-34 " + contaPJ.getCNPJ());
		
		
		contaPJ.maiorSaldo1(1000.000);
		
		entrada.close();
	}

	 
}
