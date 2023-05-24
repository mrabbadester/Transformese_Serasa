package Banco;

import Contas.ContaPf;
import Contas.ContaPj;

public class SistemaBanco {
	
	public static void main(String[] args) {
		
		ContaPf contaPF = new ContaPf(0,  "Marlus Abbade", null , 100.00);
		
		contaPF.getNome();
		contaPF.getCpf();
		contaPF.getSaldo();
		
		
		System.out.println("Pessoa física");
		System.out.println("nome do titular: " + contaPF.getNome());
		System.out.println("seu CPF de numero: " + contaPF.getCpf() );
		System.out.println("seu saldo da conta: " + contaPF.getSaldo() );
		
		System.out.println();
		
		ContaPj contaPJ = new ContaPj(0, "Microabbade", null, 1000.00);
		
		contaPJ.getNome();
		contaPJ.getCNPJ();
		contaPJ.getSaldo();
		
		System.out.println("Pessoa jurídica");
		System.out.println("nome do titular: " + contaPJ.getNome());
		System.out.println("seu CNPJ: " + contaPJ.getCNPJ() );
		System.out.println("seu saldo da conta: " + contaPJ.getSaldo() );
		
		
		
		
		
	}

}
