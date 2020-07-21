package br.com.testes;

import java.awt.AWTException;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.RastrearPedido;
import br.com.utils.Random;

public class TestRastrearPedidoC2C extends BasePage{
	
	RastrearPedido Step = new RastrearPedido();
	String pedido = Random.randomNumeric(5);
	String CPFCliente = Random.randomNumeric(10);
	
	@Test
	public void ExecutaTestRastrearPedidoC2C() throws InterruptedException, AWTException{
		
		Step.Url(Parametros.UrlPax);
		Step.ClicarPedido();
		Step.ClicarLojistaPedido("C&C - Aricanduva (LF)");
		Step.ClicarAcoesPin();
		Step.trocarAba1();
		
//		Assert.assertEquals("PEDIDO", Step.ValidarRatreioPedido2());
		
	}

}
