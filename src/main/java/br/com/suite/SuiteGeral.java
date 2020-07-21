package br.com.suite;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.testes.GeradoresDocumentos;
import br.com.testes.TestCadastrarPedido;
import br.com.testes.TestCadastrarPedidoC2C;
import br.com.testes.TestExcluirPedido;
import br.com.testes.TestExcluirPedidoC2C;
import br.com.testes.TestLogin1;
import br.com.testes.TestMapaMotorista;
import br.com.testes.TestPedido;
import br.com.testes.TestRastrearPedido;
import br.com.testes.TestRastrearPedidoC2C;
import br.com.testes.TestVisualizarPedido;
import br.com.testes.TestVisualizarPedidoC2C;

@RunWith(Suite.class)
@SuiteClasses({

//	TestAutenticacaoJira.class,	
	GeradoresDocumentos.class,

//	TestEsqueciMinhaSenha.class,
	TestLogin1.class,
	TestMapaMotorista.class,	
	TestPedido.class,
	TestCadastrarPedido.class,	
	TestVisualizarPedido.class,
	TestRastrearPedido.class,
	TestExcluirPedido.class,
	TestCadastrarPedidoC2C.class,
	TestVisualizarPedidoC2C.class,
	TestRastrearPedidoC2C.class,
	TestExcluirPedidoC2C.class,

//	TestMapaMotorista.class,
//	TestCadastrarMotorista.class,
//	TestEditarMotorista.class,
//	TestPDFMotorista.class,
//	TestExcluirMotorista.class,
//	TestCadastrarTransportadora.class,
//	TestVincularMotoristaTransportadora.class,
//	TestExcluirMotoristaTransportadora.class,
//	TestCadastroOperadorMaster.class,
//	TestEditarOperadorMaster.class,
//	TestExcluirOperador.class,
//	TestImportarLojistaCarrefour.class,
	
//	TestLogout.class,

})

public class SuiteGeral {

	@BeforeClass
	public static void inicializa() {

	}

//	@AfterClass
//	public static void finaliza() throws InterruptedException {
//
//		Thread.sleep(10000);
//		DriverFactory.destroyDriver();

}
