package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.ExcluirOperador;


public class TestExcluirOperador extends BasePage  {
			
		ExcluirOperador Step = new ExcluirOperador();
		@Test
		
		
		public void TestExcluirOperador() throws InterruptedException {
			
			Step.Url(Parametros.UrlPax);
			Step.ClicarEmOperadoresExcluir();
			Step.ClicarExcluirOperador();
			Step.ClicarSimExcluirOperador();

			 Assert.assertNotEquals("Operador_Master - QA", Step.ValidaExcluirOperador());	
		}
	
}
	
