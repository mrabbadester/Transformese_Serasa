package Atividade_aula_exemplo_dia19deabrilde2023;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Informe um numero, por favor");
			int numeroRecebido = entrada.nextInt();
			
			System.out.println("Informe outro um numero, por favor");
			int numeroRecebido2 = entrada.nextInt();
			
			System.out.println("Numero digitando é " + numeroRecebido);
			
		} catch (InputMismatchException erraDeEntrada) {
			System.out.println("O tipo de dado informado é invalido.");
		} catch (Exception erraDeEntrada) {
			System.out.println("O banco de dados, nao esta respondendo.");
		}finally {
			//fechar entrada
			entrada.close();
			System.out.println("O finally, foi executado.");
		}
		
		System.out.println("Uma mensagem depois");
		
		
	}

}
