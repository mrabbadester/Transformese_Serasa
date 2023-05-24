package Atividade_aula_2;

import java.util.Scanner;

public class maisvelho {

public static void main(String[] args) {
		
		String nome1, nome2;
		int idade1 = 0, idade2 = 0;
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Primeiro nome: ");
		nome1 = entrada.nextLine();
		System.out.println("Idade: ");
		idade1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Segundo nome: ");
		nome2 = entrada.nextLine();
		System.out.println("Idade: ");
		idade2 = entrada.nextInt();
		
		if (idade1 == idade2) {
			System.out.println("As duas pessoas possuem a mesma idade");
		} else {
			if (idade1 > idade2) {
			System.out.println(nome1 + "mais velho(a), pois tem " + idade1 + " anos.");
		}
		
	}

}
}