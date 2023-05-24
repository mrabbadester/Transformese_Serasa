package treimento_aprender;

import java.util.Scanner;

public class hora_pf_pj {

	public static void main(String[] args) {
	    Scanner horaetipo=new Scanner(System.in); 
	    int horario;
	    System.out.println("Informe o horario agora (0-23):");
	    horario = horaetipo.nextInt();
	    horaetipo.nextLine();

	    String tipodepessoa;
	    System.out.println("Voce é de pessoa fisica(PF)ou pessoa juridica(PJ)?");
	    tipodepessoa = horaetipo.nextLine().trim().toUpperCase();

	    String cumprimento="";
	    if (horario >= 0 && horario < 12 ) {
	        cumprimento="bom dia";
	    }
	    else if (horario >= 13 && horario < 18 ) {
	        cumprimento="boa tarde";
	    }
	    else if (horario >= 19 && horario < 23 ) {
	        cumprimento="boa noite";
	    }
	    else {
	        System.out.println("Hora errada, digite novamente!");
	    }

	    String PFPJ="";
	    if (tipodepessoa.equals("PF")) {
	        PFPJ = "pessoa fisica(PF)";
	    }
	    else if (tipodepessoa.equals("PJ")) {
	        PFPJ = "pessoa juridica(PJ)";
	    }
	    else {
	        System.out.println("Tipo de pessoa invalido, digite novamente!");
	    }

	    System.out.println("Seja bem vindo " + cumprimento + ", é " + PFPJ);
	    horaetipo.close();
	}
	}
	