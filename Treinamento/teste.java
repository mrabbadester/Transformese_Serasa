package Treinamento;

import java.util.Scanner;

public class teste {

	 public static void main(String[] args) {
	        
		 Scanner entrada = new Scanner(System.in);

	        int soma = 0;
	        int contador = 0;

	        for (int i = 1; i <= 4; i++) {
	            System.out.printf("Digite o %dº número PAR: ", i);
	            int num = entrada.nextInt();

	            if (num % 2 != 0) {
	                System.out.println("Você não digitou o PAR. Tente novamente.");
	                i--; 
	            } else {
	                soma += num;
	                contador++;
	            }
	        }

	        System.out.println("\nSoma dos números pares digitados: " + soma);
	    }
	}
