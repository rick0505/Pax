package br.com.testes;

import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.Login1;

public class TestLogin1 {

	Login1 Step = new Login1();

	@Test

	public void ExecutarTestLogin() throws InterruptedException {

		Step.Maximizar();
		Step.Url(Parametros.UrlPax);
		Step.Login(Parametros.UsuarioPax1);
		Step.Senha(Parametros.SenhaPax1);
		Step.BotaoEntrar();		
	
	}
	
}