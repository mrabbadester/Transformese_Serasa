package com.Transf.Serasa.dominio.modelo.jpa;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.Transf.Serasa.DemoApplication;
import com.Transf.Serasa.dominio.modelo.Clinica;
import com.Transf.Serasa.dominio.modelo.repositorio.MetodosBancoSpring;

public class OperacoesBancoJPA {   
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(DemoApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroClinica cadastroClinica = ApplicationContext.getBean(CadastroClinica.class);
		
		MetodosBancoSpring metodosSpring = ApplicationContext.getBean(CadastroClinica.class);
		
		
		List<Clinica>clinicas = cadastroClinica.lista();
		
		for (Clinica clinica : clinicas) {
		 System.out.println(clinica.getNome());
		}
		
		List<Clinica> clinicaSpring = metodosSpring.listarString();
		
		for (Clinica clinicaS : clinicaSpring) {
			 System.out.println(clinicaS.getNome());
			}
	}
}
