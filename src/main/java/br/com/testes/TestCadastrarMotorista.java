package br.com.testes;

import org.junit.Test;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.pages.CadastrarMotorista;
import br.com.utils.Random;
import org.junit.Assert;

public class TestCadastrarMotorista extends BasePage {

	String nomemotorista = "Motorista Automatizado - " + Random.randomAlfabeto(3);
	String celularmotorista = "119" + Random.randomNumeric(12);
	String emailmotorista = "automacao.qa" + Random.randomAlphaNumeric(5) + "@paxexpress.com.br";
	String placamotorista = "AUT" + Random.randomNumeric(4);
		
	CadastrarMotorista Step = new CadastrarMotorista();
	private String fabricantemotorista;
	
//	String nascimentomotorista = "10" + Random.randomNumeric(2)+ "2002";
	@Test

	public void ExecutaTestCadastrarMotorista() throws InterruptedException {
		
		Step.url(Parametros.UrlPax);
		Step.ClicarMotorista();
		Step.ClicarCadastrarNovo();
		Step.VincularLojista("Carrefour - Brooklin");
		Step.VincularTransportadora("Pax");
		Step.NomeMotorista(nomemotorista);
		Step.CelularMotorista(celularmotorista);
		Step.EmailMotorista(emailmotorista);
		Step.NascimentoMotorista("31121970");
		Step.NumeroRg(Parametros.RG);
		Step.NumeroCPF(Parametros.CPF);
		Step.NumeroCnpj(Parametros.CNPJ);
		Step.NumeroCnh(Parametros.CNH);
		Step.ValidadeCnh("052024");
		Step.CEPMotorista("05010020");
		Step.NumeroMotorista("1988 A");
		Step.ComplementoMotorista("Prédio");
		Step.PageDown();
		Step.PlacaMotorista(placamotorista);
		Step.FabricanteMotorista("FIAT");
		Step.ModeloCarroMotorista("UNO");
		Step.MotoristaCarroAno("2015");
		Step.MotoristaRegistroANTT("AUTOMACAO - QA");
		Step.MotoristaRenavam(Parametros.Renavam);
		Step.BancoMotorista("bradesco");
		Step.AgenciaMotorista("1004");
		Step.ContaMotorista("030394000");
		Step.TipoContaMotorista();
		Step.UploadArquivo();
		Step.SalvarMotorista();
		Step.WaitLoading();
		
	
		
		Assert.assertEquals(nomemotorista, Step.ValidaNomeMotorista());

	}
}
