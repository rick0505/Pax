package br.com.testes;

import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.AutenticacaoJira;

public class TestAutenticacaoJira {

	
	AutenticacaoJira Step = new AutenticacaoJira();
	
	@Test
	
	public void ExecutaLoginJira () {
		
		Step.Maximizar();
		Step.UrlJira(Parametros.UrlJira);
		Step.Usuario(Parametros.UsuarioJira);
		Step.Senha(Parametros.SenhaJira);
		Step.Entrar();
		
	}
	
}
