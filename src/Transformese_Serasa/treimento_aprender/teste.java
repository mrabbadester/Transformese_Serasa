package treimento_aprender;

import java.util.Scanner;

public class teste {

	  public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.println("Informe Hora do dia");
	        int  hora = entrada.nextInt();

	        System.out.println("Informe pessoa");
	        String pessoa = entrada.next();

	        if (hora >= 1 && hora <= 6){

	             System.out.println("Bom Dia");

	         }else {

	             System.out.println("Boa Noite");
	         }

	        if (pessoa.equals("fisica") || pessoa.equals("juridica")){

	             System.out.println("Voce é uma pesoal: " + pessoa);

	         }else {

	             System.out.println("Pessoal Invalida");
	         }


	         entrada.close();

	    }


	}