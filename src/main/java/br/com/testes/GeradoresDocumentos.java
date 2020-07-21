package br.com.testes;

import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.GeradoresDoc;
import br.com.utils.Random;

public class GeradoresDocumentos {

	GeradoresDoc Step = new GeradoresDoc();
	
	@Test
	
	public void ExecutaFourDevs () throws InterruptedException {
		
		
		Step.Url("https://www.treinaweb.com.br/ferramentas-para-desenvolvedores/gerador/cnh#ui-basic");
		Step.CapturarCPF();
		Step.CapturarRG();
		Step.CapturarCNPJ();
		Step.CapturarCNH();
		Step.CapturarRENAVAM();
		
		
//		
//		Random Randomico = new Random();
//		Parametros.Randomico = Randomico.randomNumeric(5);
		
		
		
		
	}
	
	
}
