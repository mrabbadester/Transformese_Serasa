package servico;

import Notificao.Notificador;
import Notificao.NotificarPorEmail;
import Notificao.NotificarPorSMS;
import modelo.Cliente;

public class AtivacaoClienteService {
	
		private Notificador notificador;
		
		public AtivacaoClienteService(Notificador notificador) {
			this.notificador = notificador;
		}
			
		public void ativar(Cliente cliente) {
			cliente.ativar();
			
			NotificarPorEmail notificador = new NotificarPorEmail();
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!  ");
		}
		
		public void ativar1(Cliente cliente) {
			cliente.ativar();
			
			NotificarPorSMS notificador = new NotificarPorSMS();
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo! ");
		}
		
}
