package br.com.testes;


import org.junit.Test;

import br.com.core.BasePage;
import br.com.pages.ExcluirMotoristaTransportadora;

public class TestExcluirMotoristaTransportadora extends BasePage {

	ExcluirMotoristaTransportadora Step = new ExcluirMotoristaTransportadora();
		
	@Test

public void TestExcluirMotoristaTransportadora() {

		Step.ClicarExcluirMotoristaTransportadora();
		
	}
}
