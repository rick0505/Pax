package br.com.testes;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.ExcluirPedido;

public class TestExcluirPedido extends BasePage{
	
	ExcluirPedido Step = new ExcluirPedido();
	@Test

	public void TestClicarExcluirPedido() throws InterruptedException {
		
		Step.Url(Parametros.UrlPax);
		Step.ClicarPedido();
		Step.ClicarLojistaPedido("Carrefour - Brooklin");
		Step.ClicarAcoesPinExcluir();
		Step.MensagemExcluirPedidoSim();
		
	}
	
}
