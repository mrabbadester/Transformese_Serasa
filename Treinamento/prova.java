package Treinamento;

import java.util.Scanner;

public class prova {
public static void main(String[] args) {
		
		double media, nota1, nota2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;

		System.out.println("A média é: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			
			if (media <= 5) {
				System.out.println("segunda o prova denovo...");
			} else {
				System.out.println("Reprovado");
			}
		
		}
	
	}

}
