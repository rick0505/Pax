package br.com.testes;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.ExcluirMotorista;


public class TestExcluirMotorista extends BasePage {

	ExcluirMotorista Step = new ExcluirMotorista();

	@Test
	
	public void TestExcluirMotorista() throws InterruptedException {
		
		Step.url(Parametros.UrlPax);
		Step.ClicarMotorista();
		Step.ClicarExcluirMotorista();
		Step.ClicarSimExcluirMotorista();
		
//		 Assert.assertEquals("motorista", Step.ValidarExcluirMotorista());ss
			
	
	
	}
		
		
}


