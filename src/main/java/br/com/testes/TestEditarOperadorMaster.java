package br.com.testes;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.EditarOperadorMaster;

public class TestEditarOperadorMaster extends BasePage {

	
	EditarOperadorMaster Step = new EditarOperadorMaster();
	@Test
	
	
	public void TestEditarOperadorMaster() throws InterruptedException {
		
		Step.Url(Parametros.UrlPax);
		Step.ClicarEmOperadores();
		Step.ClicarEditarOperadores();
		Step.EditarNomeOperador("Operador_Master - QA");
		


	}
}
