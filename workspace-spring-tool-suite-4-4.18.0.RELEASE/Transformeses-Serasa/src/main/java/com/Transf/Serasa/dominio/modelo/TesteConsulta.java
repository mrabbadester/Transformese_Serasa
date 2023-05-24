package com.Transf.Serasa.dominio.modelo;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.Transf.Serasa.dominio.modelo.jpa.ConsultaClinica;

public class TesteConsulta {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(TesteConsulta.class
		.web(WebApplicationType.NONE);
		.run(args);
		
		ConsultaClinica consultaClinica = new ApplicationContext.getBean(ConsultaClinica.class);
		
		List<Clinica>clinicas = consultaClinica.listar();
		
		for (Clinica clinica : clinicas) {
			System.out.println(clinica.getNome());
			
		}

	}
}s