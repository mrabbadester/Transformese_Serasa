package Atividade_aula_3;

import java.util.Scanner;

public class aula1 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Por favor, digite um número: ");
			int numero = entrada.nextInt();
			
			soma += numero;			
		}
		
		System.out.println("A soma dos números resulta no valor de: " + soma);
		
		entrada.close();
	}

}
