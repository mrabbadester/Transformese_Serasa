package Atividade_aula_7;

import java.util.Scanner;

public class igualousuperior {
	
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int soma = 0;
        int numero = 0;

        
        
        while (soma + numero < 100) {
        	System.out.print("Digite um número o valor: ");
        	int numero1 = entrada.nextInt();
        	soma = soma + numero1;
        }
        if (soma == numero) {
        	System.out.printf("Digite um número é diferente o valor: ", soma - numero);
        }
        System.out.printf("Soma dos números é igual o valor: %d%n", soma ); 
    	
    	entrada.close();
    }
	
	  
}

