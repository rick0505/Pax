package br.com.testes;


import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.VisualizarPedido;

public class TestVisualizarPedido extends BasePage{
	
	
	VisualizarPedido Step = new VisualizarPedido();
		
	@Test	
	
	public void VisualizarPedido() throws InterruptedException{
		
		Step.Url(Parametros.UrlPax);
		Step.ClicarPedido();
		Step.ClicarLojistaPedido("Carrefour - Brooklin");
		Step.ClicarAcoesVisualizar();
		Step.ClicarVoltarPedido();
		
//		Assert.assertEquals("Carrefour - Brooklin", Step.ValidarNumeroPedido());
		
//		Assert.assertEquals(validarnumeropedido2, Step.ValidarNumeroPedido2());
		
	}


}


