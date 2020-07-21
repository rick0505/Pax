package br.com.testes;

import org.junit.Test;
import org.junit.Assert;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.CadastrarTransportadora;
import br.com.utils.Random;

	public class TestCadastrarTransportadora extends BasePage{
		
	CadastrarTransportadora Step = new CadastrarTransportadora();
	String clicarnome = "Transportadora Testes Automatizado - " + Random.randomAlfabeto(3);
	String celular = "119" + Random.randomNumeric(12);
	String email ="automacao.qa" + Random.randomNumeric(5)+ "@paxexpress.com.br";
	
	@Test
	
	
	public void TestCadastrarTransportadora() throws InterruptedException{
		
		
//		Step.Parametros.CNPJ();
//		Step.CopiarCnpj();
		Step.url(Parametros.UrlPax);
		Step.ClicarTransportadora();
		Step.ClicarCadastrarNovoTransportadora();
		Step.ClicarNome(clicarnome);
		Step.ClicarCnpj(Parametros.CNPJ);
		Step.Celular(celular);
		Step.Email(email);
		Step.CEP("05010020");
		Step.Numero("88");
		Step.Complemento("Predio");
		Step.SalvarAlteracoes();
		
		Assert.assertEquals(clicarnome, Step.ValidarTransportadora());
		
		
	}
	
}
