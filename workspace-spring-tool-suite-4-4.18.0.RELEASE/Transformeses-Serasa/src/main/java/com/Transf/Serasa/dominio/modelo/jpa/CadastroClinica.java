package com.Transf.Serasa.dominio.modelo.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Transf.Serasa.dominio.modelo.Clinica;
import com.Transf.Serasa.dominio.modelo.repositorio.RepositorioClinica;

import jakarta.persistence.EntityManager;

@Component
public class CadastroClinica {
	
	@Autowired
	private EntityManager gerenciador;
	
	private RepositorioClinica repositorioClicina;
	
	public List<Clinica> lista(){
		return gerenciador.createQuery("from Clinica", Clinica.class).getResultList();
	}
	
}
