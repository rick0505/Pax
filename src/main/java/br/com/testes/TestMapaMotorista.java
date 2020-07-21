package br.com.testes;

import org.junit.Test;

import br.com.pages.MapaMotorista;


public class TestMapaMotorista {
	
	MapaMotorista Step = new MapaMotorista();

	@Test
	
	public void ClicarMapaMotorista() throws InterruptedException{
		
		Step.MapaMotorista();
	
	}
}
