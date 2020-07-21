package br.com.testes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.Jira;
import br.com.core.Parametros;
import br.com.pages.CadastrarPedido;
import br.com.utils.Random;

public class TestCadastrarPedido {

	
	CadastrarPedido Step = new CadastrarPedido();
	static String Resumo = "Incluir Pedido";
	static String Descricao = "Sistema não inclui pedido manual B2C";
	public static String BugArquivoTXT = "C:\\Automacao\\Parametros\\TestCadastrarPedido\\existeBug.txt";

	public static String pedido = Random.randomNumeric(5);
	public static String cadastropedidonotafiscal = Random.randomNumeric(6);
	public static String cadastropedidonome = "Teste Automatizado - " + Random.randomAlfabeto(5);
	public static String celular = "119" + Random.randomNumeric(12);
	public static String email = "automacao.qa" + Random.randomAlphaNumeric(5) + "@paxexpress.com.br";
	public static String cadastropedidodocumento = Random.randomNumeric(10);
	public static String cadastropedidonumero = Random.randomNumeric(3);
	public static String cadastropedidocomplemento = Random.randomAlphaNumeric(3);
	public static String cadastropedidoprodutopeso = Random.randomNumeric(2);

	
				

	@Test

	public void TestCadastarPedidoC2C() throws InterruptedException, IOException {

//		Step.LerArquivoTXT();

//		if (Parametros.existeBug == false) {

//			try {
		
				Step.Url(Parametros.UrlPax);
				Step.ClicarPedido();
				Step.ClicarCadastrarPedido();
				Step.CadastroPedidoVincularLojistas("Carrefour - Brooklin");
				Step.ClicarVincularTransportadora();
				Step.CadastroPedidoNumeroPedido(pedido);
				Step.CadastroPedidoNotaFiscal(cadastropedidonotafiscal);
				Step.CadastroPedidoNome(cadastropedidonome);
				Step.celular(celular);
				Step.CadastroPedidoEmail(email);
				Step.CadastroPedidoDocumento(cadastropedidodocumento);
				Step.ClicarDocumento(Parametros.CPF);
				Step.CadastroPedidoCep("05010-020");
				Step.CadastroPedidoNumero(cadastropedidonumero);
				Step.CadastroPedidoComplemento(cadastropedidocomplemento);
				Step.CadastroPedidoProdutoNome("Automacao_QA");
				Step.CadastroPedidoProdutoPeso(cadastropedidoprodutopeso);
				Step.CadastroPedidoTamanho();
				Step.CadastroPedidoEnviar();

//				Assert.assertEquals(pedido, Step.ValidarNumeroPedido());
				
	}
}
	
				

//			} catch (Throwable e) {
//
//
//				Jira TerrorDoDev = new Jira();
//				TerrorDoDev.Screenshot();
//				TerrorDoDev.UrlJira(Parametros.UrlJira);
//				TerrorDoDev.IncluirTask();
//				TerrorDoDev.Projeto(Parametros.ProjetoPowerView);
//				TerrorDoDev.TipoItem(Parametros.TipoItem);
//				TerrorDoDev.Resumo(Resumo);
//				TerrorDoDev.Descricao(Descricao);
//				TerrorDoDev.Ambiente(Parametros.Ambiente);
//				TerrorDoDev.Upload();
//				TerrorDoDev.Criar();
//				TerrorDoDev.GravarBugArquivoTXT(BugArquivoTXT);
//				
//				System.out.println("Caso de Teste com erro: " + "\n" + Resumo + "\n" + Descricao );
//				
//				Assert.fail("Caso de Teste com erro: " + "\n" + Resumo + "\n" + Descricao);
				
				
//			}	}

//		 else {
//			
//			Jira VerificaStatusBug = new Jira();
//			VerificaStatusBug.UrlJira(Parametros.UrlJira);
//			VerificaStatusBug.PesquisarTask(Resumo);
//			VerificaStatusBug.AcessarBug();
//			VerificaStatusBug.CapturarStatusBug();
//			VerificaStatusBug.UrlJira(Parametros.UrlJira);
//			
//			TestCadastrarPedidoC2C AcaoStatusBug = new TestCadastrarPedidoC2C();
			
						

//		}
//
//	}
//}
