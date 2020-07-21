package br.com.testes;

import org.junit.Test;

import br.com.pages.Logout;

public class TestLogout {

	Logout Step = new Logout();

	@Test

	public void ExecutarTestLogout() throws InterruptedException {

		Step.Usuario();
		Step.Sair();

	}

}
