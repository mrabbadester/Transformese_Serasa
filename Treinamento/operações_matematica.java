package Treinamento;

import java.util.Scanner;

public class operações_matematica {

public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o seu nome");		
		String nome = entrada.nextLine();
		
		System.out.println("Informe um número");
		int numero1 = entrada.nextInt();
		
		System.out.println("Informe outro número");
		int numero2 = entrada.nextInt();
		
		System.out.println(
				"O nome informado é " + nome + " e a idade é ");
		
		System.out.println("O primeiro número é " + numero1);
		System.out.println("O segundo número é " + numero2);
		
		System.out.println("A soma dos números é idade " + (numero1 + numero2));
		
		entrada.close();
		
		
		
	}
	
}