package br.com.testes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.Jira;
import br.com.core.Parametros;
import br.com.pages.CadastrarPedidoC2C;
import br.com.utils.Random;

public class TestCadastrarPedidoC2C {

	
	CadastrarPedidoC2C Step = new CadastrarPedidoC2C();
	static String Resumo = "Incluir Pedido";
	static String Descricao = "Sistema não inclui pedido manual B2C";
	public static String BugArquivoTXT = "C:\\Automacao\\Parametros\\TestCadastrarPedido\\existeBug.txt";

	public static String pedido = Random.randomNumeric(5);
	public static String numeronotafiscalc2c = Random.randomNumeric(6);
	public static String cadastropedidonome = "Teste Automatizado - " + Random.randomAlfabeto(5);
	public static String celular = "119" + Random.randomNumeric(12);
	public static String email = "automacao.qa" + Random.randomAlphaNumeric(5) + "@paxexpress.com.br";
	public static String cadastropedidodocumento = Random.randomNumeric(10);
	public static String cadastropedidonumero = Random.randomNumeric(2);
	public static String cadastropedidocomplemento = Random.randomAlphaNumeric(3);
	public static String cadastropedidoprodutopesoc2c = Random.randomNumeric(1);
	public static String cadastropedidoprecounitarioC2C = Random.randomNumeric(5);
	public static String cadastropedidoprodutoquantidadec2c	 = Random.randomNumeric(1);

	@Test

	public void TestCadastarPedidoC2C() throws InterruptedException, IOException {


				Step.Url(Parametros.UrlPax);
				Step.ClicarPedidoC2C();
				Step.ClicarCadastrarPedidoC2C();
				Step.CadastroPedidoVincularLojistasC2C("C&C - Aricanduva");
				Step.ClicarVincularTransportadoraC2C();
				Step.ClicarChecarPedidoC2C();
				Step.CadastroPedidoNumeroPedidoC2C(TestCadastrarPedidoC2C.pedido);
				Step.CadastroPedidoNotaFiscalC2C(numeronotafiscalc2c);
				Step.CadastroPedidoNomeC2C(TestCadastrarPedidoC2C.cadastropedidonome);
				Step.celularC2C(TestCadastrarPedidoC2C.celular);
				Step.CadastroPedidoEmailC2C("jorge.souza@doc88.com.br");      
				Step.CadastroPedidoDocumentoC2C(TestCadastrarPedidoC2C.cadastropedidodocumento);
				Step.ClicarDocumentoC2C("436.213.631-22");
				Step.CadastroPedidoCepC2C("05010-020");
				Step.CadastroPedidoNumeroC2C(TestCadastrarPedidoC2C.cadastropedidonumero);
				Step.CadastroPedidoComplementoC2C(TestCadastrarPedidoC2C.cadastropedidocomplemento);
				Step.CadastroPedidoProdutoNomeC2C("Automacao_QA");
				Step.CadastroPedidoProdutoQuantidadeC2C(cadastropedidoprodutoquantidadec2c);
				Step.CadastroPedidoPesoC2C(cadastropedidoprodutopesoc2c);
				Step.CadastroPedidoTamanhoC2C();
				Step.CadastroPedidoPrecoUnitarioC2C(cadastropedidoprecounitarioC2C);
//				Step.CadastroPedidoAdicionarVolumeC2C();
//				Step.CadastroPedidoProdutoNomeC2C("Automacao_QA");
//				Step.CadastroPedidoProdutoQuantidadeC2C(cadastropedidoprodutoquantidadec2c);
//				Step.CadastroPedidoPesoC2C(cadastropedidoprodutopesoc2c);
//				Step.CadastroPedidoTamanhoC2C();
//				Step.CadastroPedidoPrecoUnitarioC2C(cadastropedidoprecounitarioC2C);
				Step.CadastroPedidoEnviarC2C();

//				Assert.assertEquals(cadastropedidonome,Step.ValidarNumeroPedidoC2C());
				

	}



}