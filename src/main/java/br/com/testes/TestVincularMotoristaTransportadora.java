package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.BasePage;
import br.com.pages.VincularMotoristaTransportadora;

public class TestVincularMotoristaTransportadora extends BasePage {

	VincularMotoristaTransportadora Step = new VincularMotoristaTransportadora();
		
	@Test
	
	public void TestVincularMotoristaTransportadora() throws InterruptedException{
		
		Step.ClicarTransportadora();		
		Step.ClicarEditarTransportadora();
		Step.PesquisarPlacaOuNome("Qa");
		Step.ClicarVincularMotorista();
		Step.PageDown();
		
		Assert.assertEquals("Qa Testes", Step.ValidarMotorista());
		
	}
	
}
