package br.com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.testes.TestCadastrarPedidoC2C;


public class CadastrarPedidoC2C extends BasePage {
	

	public void Url ( String url ) {
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
		
	public void ClicarPedidoC2C() throws InterruptedException{
		
		Thread.sleep(1000);		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='BaseMenu__li'])[2]")));
		driver.findElement(By.xpath("(//li[@class='BaseMenu__li'])[2]")).click();
		Thread.sleep(2000);
	}
	
	public void ClicarCadastrarPedidoC2C() throws InterruptedException{
	    
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='BaseButton__Text BaseButton--mustard-Text']")));
		driver.findElement(By.xpath("//span[@class='BaseButton__Text BaseButton--mustard-Text']")).click();
		
	}
	
	public void CadastroPedidoVincularLojistasC2C(String cadastropedidovincularlojistas) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//div//span[@class='multiselect__placeholder']")));
		driver.findElement(By.xpath("//div/span//img[@class='Icon Icon--black Icon--chevron-down']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@class='multiselect__input']")).sendKeys(cadastropedidovincularlojistas);
		WebDriverWait wait2 = new WebDriverWait (driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'multiselect__content-wrapper']")));	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class = 'multiselect__content-wrapper']")).click();
					
	}
	
	public void ClicarVincularTransportadoraC2C() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[1]")));
		driver.findElement(By.xpath("(//div/div/img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//div[@title='Pax']")).click();
		
	}
	
	public void ClicarChecarPedidoC2C() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//div//input[@class='BaseCheckBox__checkbox']")));
		driver.findElement(By.xpath("//div//div//input[@class='BaseCheckBox__checkbox']")).click();
		
	}
	
	public void CadastroPedidoNumeroPedidoC2C(String cadastropedidonumeropedido) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//input[@class='InputGroup__input'])[1]")));
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[1]")).click();
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[1]")).sendKeys(cadastropedidonumeropedido);
		
	}
	
	public void CadastroPedidoNotaFiscalC2C(String cadastropedidonotafiscalc2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[2]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[2]")).click();
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[2]")).sendKeys(cadastropedidonotafiscalc2c);
		
	}
	
	public void CadastroPedidoNomeC2C(String cadastropedidonome) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[3]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[3]")).sendKeys(cadastropedidonome);
	}
	
	public void celularC2C(String celularc2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[4]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[4]")).sendKeys(celularc2c);
	
	}
	
	public void CadastroPedidoEmailC2C(String cadastropedidoemailc2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[5]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[5]")).sendKeys(cadastropedidoemailc2c);
		
	}
	
	public void CadastroPedidoDocumentoC2C(String cadastropedidodocumento) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/div[@class='BaseSelect__selected'])[2]")));
		driver.findElement(By.xpath("(//div/div/div[@class='BaseSelect__selected'])[2]")).click();
		driver.findElement(By.xpath("//div//div[@title='CPF']")).click();
	}
	
	public void ClicarDocumentoC2C(String clicardocumentoc2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//input[@class='InputGroup__input'])[6]")));
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[6]")).sendKeys(clicardocumentoc2c);
				
	}
	
	public void CadastroPedidoCepC2C(String cadastropedidocepc2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[19]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[19]")).sendKeys(cadastropedidocepc2c);
	
	}
	
	public void CadastroPedidoNumeroC2C(String cadastropedidonumeroc2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[21]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[21]")).click();
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[21]")).sendKeys(cadastropedidonumeroc2c);
	}
	
	public void CadastroPedidoComplementoC2C(String cadastropedidocomplementoc2c) throws InterruptedException{
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[22]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[22]")).sendKeys(cadastropedidocomplementoc2c);
		
	}
	
	public void CadastroPedidoProdutoNomeC2C(String cadastropedidoprodutonomec2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[25]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[25]")).sendKeys(cadastropedidoprodutonomec2c);
			
	}
	
	public void CadastroPedidoProdutoQuantidadeC2C (String cadastropedidoprodutoqunatidadec2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[26]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[26]")).sendKeys(cadastropedidoprodutoqunatidadec2c);
	
		
	}
	
	public void CadastroPedidoPesoC2C(String cadastropedidoc2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[27]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[27]")).sendKeys(cadastropedidoc2c);
				
	}
	
	public void CadastroPedidoTamanhoC2C() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[6]")));
		driver.findElement(By.xpath("(//div//div//img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[6]")).click();
		driver.findElement(By.xpath("(//div//div//div[@title='P - (Ex.: 10x20 cm)'])")).click();
				
	}
	
	public void CadastroPedidoPrecoUnitarioC2C (String cadastropedidoprecounitarioc2c) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[28]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[28]")).sendKeys(cadastropedidoprecounitarioc2c);

	}
	
	public void CadastroPedidoAdicionarVolumeC2C() throws InterruptedException{;
	
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div//a[@class='BaseButton OrdersForm__productButton BaseButton--mustard BaseButton--icon-right']")));
		driver.findElement(By.xpath("//div/div//a[@class='BaseButton OrdersForm__productButton BaseButton--mustard BaseButton--icon-right']")).click();
		
	}
	
	public void CadastroPedidoEnviarC2C() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//button//span[@class='BaseButton__Text BaseButton--black-Text']")));
		driver.findElement(By.xpath("//div//button//span[@class='BaseButton__Text BaseButton--black-Text']")).click();
		Thread.sleep(2000);		
	}
	
	public String ValidarNumeroPedidoC2C() throws InterruptedException{
	
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tr//td[@class='DataTableTd'])[8]")));
		return driver.findElement(By.xpath("(//tr//td[@class='DataTableTd'])[8]")).getText();
		
	}
		
	public void LerArquivoTXT () throws IOException {
		
		LerArquivoTXT(TestCadastrarPedidoC2C.BugArquivoTXT);
				
	}
		
}
