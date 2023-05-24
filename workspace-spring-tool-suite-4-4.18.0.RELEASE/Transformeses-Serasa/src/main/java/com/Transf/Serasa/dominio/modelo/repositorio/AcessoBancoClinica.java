package com.Transf.Serasa.dominio.modelo.repositorio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Transf.Serasa.dominio.modelo.Clinica;
import jakarta.transaction.Transactional;

@Component
public class AcessoBancoClinica {
	
	@Autowired
	private RepositorioClinica repositorioClicina;
	
	private List<Clinica> listar(){
		return repositorioClicina.findAll();  
	}
	
	@Transactional
	public void salvar(Clinica clinica) {
		repositorioClicina.save(clinica);
	}

}
