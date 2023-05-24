package com.Transf.Serasa.dominio.modelo.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.Transf.Serasa.dominio.modelo.Clinica;
import jakarta.persistence.EntityManager;

@Component
public class ConsultaClinica {
	
	@Autowired
	private EntityManager manager;
	
	public List<Clinica> listar(){
		return manager.createQuery("from tab_clinica1", Clinica.class).getResultList();
	}

	
}
