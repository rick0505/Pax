package br.com.testes;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.PDFMotorista;

public class TestPDFMotorista extends BasePage{
	
	PDFMotorista Step = new PDFMotorista();
	@Test

	public void TestClicarPDFMotorista() throws InterruptedException {
		
		Step.Url(Parametros.UrlPax);
		Step.ClicarMotorista();
		Step.ClicarAcoesMotorista();
		Step.WaitLoading();

		
	}
	
}
