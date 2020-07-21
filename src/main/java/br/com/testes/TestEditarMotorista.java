package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.EditarMotorista;

public class TestEditarMotorista extends BasePage{
	
	EditarMotorista Step = new EditarMotorista();
	@Test

	public void TestClicarEditarMotorista() throws InterruptedException {
		
		Step.Url(Parametros.UrlPax);
		Step.ClicarMotorista();
		Step.ClicarAcoesEditarMotorista();
		Step.EditarNascimento("01011971");
		Step.PageDown();
		Step.SalvarMotorista();
		

//		Assert.assertEquals("validarnomemotorista", Step.ValidarEditarMotoristaNome());
	}
}