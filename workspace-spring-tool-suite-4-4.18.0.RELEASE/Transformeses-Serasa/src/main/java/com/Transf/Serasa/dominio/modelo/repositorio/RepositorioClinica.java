package com.Transf.Serasa.dominio.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Transf.Serasa.dominio.modelo.Clinica;

@Repository
public interface RepositorioClinica extends JpaRepository<Clinica, Long> { 
	
	
	
	

}
