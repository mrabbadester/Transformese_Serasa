package Array;

import java.util.Scanner;
import java.util.Arrays;

public class exemplo {

	  public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	            double[] notas = new double[4];
	            
	            //for 

	            for(int i = 0; i < notas.length; i++) {
	            	
	                System.out.println("Informe a nota " + i);
	                notas[i] = entrada.nextDouble();
	                
	                System.out.print(Arrays.toString(notas));
	            }
	            
	            System.out.println(notas.length);
	            notas [0] = 5.2;
	            
	            System.out.println(notas [0]);
	            
	            System.out.println("Informe é nome ");
	            String nome = entrada.next();
	            
	            System.out.println("Informe é idade");
	            int idade = entrada.nextInt();
	            
	        entrada.close();

	    }
}

