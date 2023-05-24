package Atividade_aula_7;

import java.util.Scanner;

public class impar_par {
	 public static void main(String[] args) {
	        
		 try (Scanner entrada = new Scanner(System.in)) {
			int soma = 0;
	        int num = 0;

	        for (int i = 1; i <= 4; i++) {
	            System.out.printf("Digite o %dº número o valor de PAR: ", i);
	            int num1 = entrada.nextInt();

	            if (num1 % 2 != 0) {
	                System.out.println("Você não digitou o PAR. vamos tente novamente?");
	                i--; 
	            } else {
	                soma += num1;
	                num++;
	            }
	        }

	        System.out.println("\nSoma dos números pares digitados o valor: " + soma);
		}
	    }
	}

