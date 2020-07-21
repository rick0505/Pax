package br.com.testes;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.VisualizarPedidoC2C;

public class TestVisualizarPedidoC2C extends BasePage{
	
	
	VisualizarPedidoC2C Step = new VisualizarPedidoC2C();
		
	@Test	
	
	public void VisualizarPedidoC2C() throws InterruptedException{
		
		Step.Url(Parametros.UrlPax);
		Step.ClicarPedidoC2C();
		Step.ClicarLojistaPedido("C&C - Aricanduva (LF)");
		Step.ClicarAcoesVisualizarC2C();
		Step.ClicarVoltarPedido();
		
//		Assert.assertEquals("Carrefour - Brooklin", Step.ValidarNumeroPedido());
		
//		Assert.assertEquals(validarnumeropedido2, Step.ValidarNumeroPedido2());
		
	}

}
