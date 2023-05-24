package servico;

import Notificao.NotificarPorSMS;
import modelo.Cliente;
import modelo.Produto; 

public class EmissaoNotaFiscalService {

	public void emitir (Cliente cliente, Produto produto) {
		
		NotificarPorSMS notificador = new NotificarPorSMS();
		
		notificador.notificar(cliente, "Sr.(a) " + cliente.getNome() + "Nota fiscal do produto" +produto.getNome() + "foi emitida!");
		
	}

}
