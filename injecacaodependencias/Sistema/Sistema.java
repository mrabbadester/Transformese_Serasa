package Sistema;

import Notificao.Notificador;
import modelo.Cliente;
import modelo.Produto;
import servico.AtivacaoClienteService;
import servico.EmissaoNotaFiscalService;


public class Sistema {
	

	public static void main(String[] args) {
		
		Cliente Marlus = new Cliente("Marlus", "antos2lite@gmail.com", "5199129-7291 ");
		
		Cliente Livia = new Cliente("Livia", "livia@gmail.com", "545454-54554 ");
		
		Notificador NotificarPorSMS = null;
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(NotificarPorSMS);
		
		System.out.println(Marlus.isAtivo());
		System.out.println(Livia.isAtivo());
		
		ativacaoCliente.ativar(Marlus);
		ativacaoCliente.ativar(Livia);

		System.out.println(Marlus.isAtivo());
		System.out.println(Livia.isAtivo());
		
		Produto impressora = new Produto("Impressora", 250.00);
		Produto notebook = new Produto("Notebook", 2000.00);
		
		EmissaoNotaFiscalService emitirNotaFiscal = new EmissaoNotaFiscalService();
		
		emitirNotaFiscal.emitir(Livia, notebook );
		emitirNotaFiscal.emitir(Marlus, impressora );
	}
}