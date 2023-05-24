package Notificao;

import modelo.Cliente;

public class NotificarPorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do telefone %s: %s \n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}
}
