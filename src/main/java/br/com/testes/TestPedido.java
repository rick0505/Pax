package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.Pedido;
import org.openqa.selenium.WebDriver;


public class TestPedido extends BasePage {
	
	Pedido Step = new Pedido();
			
	@Test

public void pedido() throws InterruptedException{ 	
		
		Step.url(Parametros.UrlPax);
		Step.ClicarPedido();
		Step.ClicarLojistaPedido("Carrefour - Brooklin");
		Step.ClicarTransportadoraPedido("Pax");
		Step.ClicarStatusPedido("ENTREGUE");
		Step.PesquisarPedido();
		Step.FiltrarPedido("15882");
		
//		Assert.assertEquals("15882", Step.ValidaPedido());
		
		Step.ClicarAcoesVisualizar();
		
		Assert.assertEquals("PEDIDO", Step.ValidarVisualizarNumeroPedido());
		
		Step.ClicarVoltarPedido();
		Step.PesquisarPedido();
		Step.FiltrarPedido("15882");
		Step.ClicarAcoesPin();
//		Assert.assertEquals("Status", Step.ValidarRatreioPedido());
		Step.trocarAba1();
	
		
		
	}
}
