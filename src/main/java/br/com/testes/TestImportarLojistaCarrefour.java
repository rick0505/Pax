package br.com.testes;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.ImportarLojistaCarrefour;

public class TestImportarLojistaCarrefour extends BasePage {
	
	ImportarLojistaCarrefour Step = new ImportarLojistaCarrefour();
	@Test

	public void TestImportarLojistaCarrefour() throws InterruptedException{
		
		Step.url(Parametros.UrlPax);
		Step.ClicarLojistaCarrefour();
		Step.ClicarBotãoImportar();
		Step.SelecionarLojistaCarrefour("Carrefour - Brooklin");

	}
}
