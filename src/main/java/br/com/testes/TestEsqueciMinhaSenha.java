package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.EsqueciMinhaSenha;

	public class TestEsqueciMinhaSenha {
		
		EsqueciMinhaSenha Step = new EsqueciMinhaSenha();

		@Test
		
	public void ExecutaTestEsqueciMinhaSenha() throws InterruptedException{
			
			
		Step.url(Parametros.UrlPax);
		Step.Maximizar();
		Step.ClicarEsqueciMinhaSenha();
		Step.Email("qadoc88@gmail.com");
		Step.Enviar();
		Step.Ok();
		Step.url("https://mailtrap.io/signin");
		Step.EmailWeb("qadoc88@gmail.com");
		Step.PasswordEmail("123123@Qa");
		Step.Login();
		Step.url("https://mailtrap.io/inboxes/748658/messages");
		Step.ClicarEmailEntrada();
		Step.TrocarSenha();
		Step.NovaSenha("123456");
		Step.ConfirmarSenha("123456");
		Step.ClicarEnviar();
		Step.ClicarOkRedefinirSenha();
		
		Assert.assertEquals("PAX Tecnologia - A Logística do Futuro!", Step.NomePAX());
		
		Step.Url(Parametros.UrlPax);
		Step.Login(Parametros.UsuarioPax2);
		Step.Senha(Parametros.SenhaPax2);
		Step.BotaoEntrar();
		
		Assert.assertEquals("Mapa de Motoristas", Step.MapaMotorista());
		
	
	}
		
}
