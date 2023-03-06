package Atividade_aula_5;

import java.util.Scanner;

public class mensagemenvioPFPJ {
	
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        String nome, cpf, cnpj;
        
        System.out.println("Informe o seu nome: "); 
		nome = entrada.nextLine();
        
		System.out.println("Informe o seu Pessoa Física o CPF:  ");
		cpf = entrada.nextLine();
		
		System.out.println("Informe o seu Pessoa Jurídica o CNPJ:  ");
		cnpj = entrada.nextLine();
           
        int hora;

        System.out.println("Na horas?");
        hora = entrada.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
                System.out.println("Boa tarde");

            } else {
                System.out.println("Boa noite");
            }

        entrada.close();
    }
}