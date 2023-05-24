package Treinamento;

import java.util.Scanner;

public class mate {

	public static void main(String[] args){
	    
	 	Scanner entrada = new Scanner(System.in);
	 	
	 	System.out.println("Informe o seu nome");		
		
	 	String nome = entrada.nextLine();
	 
	 	Scanner input = new Scanner(System.in);		    
	 	
	    System.out.print("Informe um valor número: ");
	    int num = input.nextInt();
	 
	    if(num % 2 == 0){
	      System.out.print("Você busca informar um numero par" );
	    }
	    else{
	      System.out.print("Você busca informar um numero impar");
	    }
	     
	    System.exit(0);
	  }
	}
