package br.com.pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.testes.TestCadastrarPedido;


public class CadastrarPedido extends BasePage {
	
	
	public void Go1 () throws InterruptedException {
		
		Url(Parametros.UrlPax);
		ClicarPedido();
		ClicarCadastrarPedido();
		CadastroPedidoVincularLojistas("Carrefour - Brooklin");
		ClicarVincularTransportadora();
		CadastroPedidoNumeroPedido(TestCadastrarPedido.pedido);
		CadastroPedidoNome(TestCadastrarPedido.cadastropedidonome);
		celular(TestCadastrarPedido.celular);
		CadastroPedidoEmail(TestCadastrarPedido.email);
		CadastroPedidoDocumento(TestCadastrarPedido.cadastropedidodocumento);
		ClicarDocumento(Parametros.CPF);
		CadastroPedidoCep("05010-020");
		CadastroPedidoNumero(TestCadastrarPedido.cadastropedidonumero);
		CadastroPedidoComplemento(TestCadastrarPedido.cadastropedidocomplemento);
		CadastroPedidoProdutoNome("Automacao_QA");
		CadastroPedidoProdutoPeso(TestCadastrarPedido.cadastropedidoprodutopeso);
		CadastroPedidoTamanho();
		CadastroPedidoEnviar();

		Assert.assertEquals(TestCadastrarPedido.pedido, ValidarNumeroPedido());
		
		
	}
	
	public void Url ( String url ) {
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	
	public void ClicarPedido() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='BaseMenu__li'])[2]")));
		driver.findElement(By.xpath("(//li[@class='BaseMenu__li'])[2]")).click();
		Thread.sleep(3000);
	}
	
	public void ClicarCadastrarPedido() throws InterruptedException{
	    
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//span[@class='BaseButton__Text BaseButton--mustard-Text']")).click();
		Thread.sleep(3000);

	}
	public void CadastroPedidoVincularLojistas(String cadastropedidovincularlojistas) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//div//span[@class='multiselect__placeholder']")));
		driver.findElement(By.xpath("//div/span//img[@class='Icon Icon--black Icon--chevron-down']")).click();
		driver.findElement(By.xpath("//div/input[@class='multiselect__input']")).sendKeys(cadastropedidovincularlojistas);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@class='multiselect__input']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
					
	}
	
	public void ClicarVincularTransportadora() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[1]")));
		driver.findElement(By.xpath("(//div/div/img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//div[@title='Pax']")).click();
		
	}
	
	public void CadastroPedidoNumeroPedido(String cadastropedidonumeropedido) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//input[@class='InputGroup__input'])[1]")));
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[1]")).click();
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[1]")).sendKeys(cadastropedidonumeropedido);
		
	}
	
	public void CadastroPedidoNotaFiscal(String cadastropedidonotafiscal) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[2]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[2]")).click();
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[2]")).sendKeys(cadastropedidonotafiscal);
		
	}
	
	public void CadastroPedidoNome(String cadastropedidonome) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[3]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[3]")).sendKeys(cadastropedidonome);
	}
	
	public void celular(String celular) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[4]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[4]")).sendKeys(celular);
	
	}
	
	public void CadastroPedidoEmail(String cadastropedidoemail) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[5]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[5]")).sendKeys(cadastropedidoemail);
		
	}
	
	public void CadastroPedidoDocumento(String cadastropedidodocumento) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div[@class='BaseSelect__selectedContainer'])[2]")));
		driver.findElement(By.xpath("(//div//div[@class='BaseSelect__selectedContainer'])[2]")).click();
		driver.findElement(By.xpath("//div//div[@title='CPF']")).click();
	}
	
	public void ClicarDocumento(String clicardocumento) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//input[@class=\"InputGroup__input\"])[6]")));
		driver.findElement(By.xpath("(//div//input[@class=\"InputGroup__input\"])[6]")).sendKeys(clicardocumento);
		
		
	}
	
	public void CadastroPedidoCep(String cadastropedidocep) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[19]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[19]")).sendKeys(cadastropedidocep);
	
	}
	
	public void CadastroPedidoNumero(String cadastropedidonumero) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[21]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[21]")).sendKeys(cadastropedidonumero);
	}
	
	public void CadastroPedidoComplemento(String cadastropedidocomplemento) throws InterruptedException{
	
//		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[22]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[22]")).sendKeys(cadastropedidocomplemento);
//		Thread.sleep(3000);
	}
	
	public void CadastroPedidoProdutoNome(String cadastropedidoprodutonome) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[25]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[25]")).sendKeys(cadastropedidoprodutonome);
			
	}
	
	public void CadastroPedidoProdutoPeso(String cadastropedidoprodutopeso) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[26]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[26]")).sendKeys(cadastropedidoprodutopeso);
		
	}
	
	public void CadastroPedidoTamanho() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[6]")));
		driver.findElement(By.xpath("(//div//div//img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[6]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div//div//div[@title='P - (Ex.: 10x20 cm)'])")).click();
//		Thread.sleep(2000);
				
	}
	
	public void CadastroPedidoEnviar() throws InterruptedException{
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//button//span[@class='BaseButton__Text BaseButton--black-Text']")));
		driver.findElement(By.xpath("//div//button//span[@class='BaseButton__Text BaseButton--black-Text']")).click();
		Thread.sleep(2000);
		
	}
	
	public String ValidarNumeroPedido() throws InterruptedException{
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='DataTableTd__Content DataTable--limit'])[2]")));
		Thread.sleep(2000);
		return driver.findElement(By.xpath("(//span[@class='DataTableTd__Content DataTable--limit'])[2]")).getText();
		
	}
		
	public void LerArquivoTXT () throws IOException {
		
		LerArquivoTXT(TestCadastrarPedido.BugArquivoTXT);
				
	}


	public void Go() {
		// TODO Auto-generated method stub
		
	}
		
}
