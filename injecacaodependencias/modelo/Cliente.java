package modelo;

public class Cliente {
	
	private String nome;
	private String Email;
	private String telefone;
	private boolean ativo = false;

	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		Email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return Email;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void ativar(){
		this.ativo = true;
	}
	
	
}
