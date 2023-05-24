package dominio.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tab_clinicas")
public class Clinica {
	
	
	@Id  
	private Long id;
	
	@Column(name = "nome_clinica")
	private String nome;
	
	@Column(name = "taxa_consulta")
	private double taxaConsulta;
	
	

}
