package br.com.testes;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.CadastroOperadorMaster;
import br.com.utils.Random;
import org.junit.Assert;



public class TestCadastroOperadorMaster extends BasePage {

	
	CadastroOperadorMaster Step = new CadastroOperadorMaster();
	String nomeoperadormaster = "Operador_Master - " + Random.randomAlfabeto(2);
	String celularoperadormaster = "119" + Random.randomNumeric(12);
	String emailoperadormaster = "operador.qa.master" + Random.randomAlphaNumeric(2) + "@paxexpress.com.br";
	@Test
	
	
	public void TestCadastroOperadorMaster() throws InterruptedException {
	
			
		Step.url(Parametros.UrlPax);
		Step.ClicarEmOperadores();
		Step.ClicarCadastroOperadores();
		Step.ClicarOperadorMaster();
		Step.ClicarNomeOperadorMaster(nomeoperadormaster);
		Step.ClicarCelularOperadorMaster(celularoperadormaster);
		Step.ClicarEmailOperadorMaster(emailoperadormaster);
		Step.ClicarSenhaOperadorMaster("123456");
		Step.ClicarSalvarOperadorMaster();
		
		Assert.assertEquals(nomeoperadormaster, Step.ValidarNomeOperadorMaster());
		
		
		
	
		
	    	
	
	}
}
	
		


