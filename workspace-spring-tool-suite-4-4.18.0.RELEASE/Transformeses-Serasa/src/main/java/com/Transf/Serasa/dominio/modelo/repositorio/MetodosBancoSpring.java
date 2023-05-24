package com.Transf.Serasa.dominio.modelo.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Transf.Serasa.dominio.modelo.Clinica;

@Component
public class MetodosBancoSpring {

	@Autowired
	private RepositorioClinica respositorioClinica;
	
	public List<Clinica> listarString(){
		return respositorioClinica.findAll();
		
	}
	
}
