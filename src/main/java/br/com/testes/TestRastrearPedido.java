package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.RastrearPedido;
import br.com.utils.Random;

public class TestRastrearPedido extends BasePage{
	
	RastrearPedido Step = new RastrearPedido();
	String pedido = Random.randomNumeric(5);
	@Test
	
	public void ExecutaTestRastrePedido() throws InterruptedException{
		
		Step.Url(Parametros.UrlPax);
		Step.ClicarPedido();
		Step.ClicarLojistaPedido("Carrefour - Brooklin");
		Step.ClicarAcoesPin();
		Step.trocarAba1();

		
//		Assert.assertEquals(pedido, Step.ValidarRatreioPedido2());
		
	}
	
	

}
