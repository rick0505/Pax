package br.com.testes;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.ExcluirPedidoC2C;

public class TestExcluirPedidoC2C extends BasePage{
	
	ExcluirPedidoC2C Step = new ExcluirPedidoC2C();
	@Test

	public void TestClicarExcluirPedidoC2C() throws InterruptedException {
		
		Step.Url(Parametros.UrlPax);
		Step.ClicarPedidoC2C();
		Step.ClicarLojistaPedido("C&C - Aricanduva (LF)");
		Step.ClicarAcoesPinExcluir();
		Step.MensagemExcluirPedidoSim();
		
	}
	
}
