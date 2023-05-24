package dominio.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_especialidades")
public class Especialidades {
	
	@Id
	private Long id;
	
	@Column
	private String nome;

}
