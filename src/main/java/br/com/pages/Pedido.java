package br.com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;


public class Pedido extends BasePage{
	
	public void Url(String url) {

		driver.get(url);
	
	}
	
	public void ClicarPedido() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='BaseMenu__li'])[2]"))).click();
	
	
	}	

	public void ClicarLojistaPedido( String clicarLojistaPedido ) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='multiselect__tags'])[1]")));
				
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class = 'BaseMultiselect__Arrow BaseMultiselect__Arrow--close'])[1]")).click();
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[1]")).sendKeys(clicarLojistaPedido);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/li/span[@class = 'multiselect__option multiselect__option--highlight']/span")));
		driver.findElement(By.xpath("//ul/li/span[@class = 'multiselect__option multiselect__option--highlight']/span")).click();
		Thread.sleep(3000);
		
						
	}
	
	public void ClicarTransportadoraPedido(String clicartransportadorapedido) throws InterruptedException{
		
		driver.findElement(By.xpath("(//div//span//img[@class='Icon Icon--black Icon--chevron-down'])[2]")).click();
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[2]")).sendKeys(clicartransportadorapedido);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul//span[@class='multiselect__option multiselect__option--highlight'])[1]")));
		driver.findElement(By.xpath("(//ul//span[@class='multiselect__option multiselect__option--highlight'])[1]")).click();
		Thread.sleep(2000);
	
	}

	public void ClicarStatusPedido(String clicarstatuspedido) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//span//img[@class='Icon Icon--black Icon--chevron-down'])[3]")));
		driver.findElement(By.xpath("(//div//span//img[@class='Icon Icon--black Icon--chevron-down'])[3]")).click();
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div//span[@class='multiselect__option multiselect__option--highlight']")));
		driver.findElement(By.xpath("//div/div//span[@class='multiselect__option multiselect__option--highlight']")).click();
		Thread.sleep(3000);
//		WebDriverWait wait3 = new WebDriverWait(driver, 20);
//		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ENTREGUE']")));

		
		
	}
	
	public void PesquisarPedido() throws InterruptedException{
	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div[@class='multiselect__tags'])[4]")));
		driver.findElement(By.xpath("(//div/div[@class='multiselect__tags'])[4]")).click();
		Thread.sleep(2000);
	
	}
	
	public void FiltrarPedido(String filtrarpedido) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/input[@class = 'multiselect__input'])[4]")));
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[4]")).click();
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[4]")).sendKeys(filtrarpedido);
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[4]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	public String ValidaPedido() throws InterruptedException{
		
		return driver.findElement(By.xpath("//td//span[text()='2906844650001']")).getText();
		
	
	}
	
	public void ClicarAcoesVisualizar() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class = 'DataTableActions'])[1]")));		
		driver.findElement(By.xpath("(//td[@class = 'DataTableActions'])[1]")).click();
		WebElement LocatorXpath = driver.findElement(By.xpath("//span//img[@class = 'Icon Icon--mustard Icon--show']"));
		Actions click = new Actions(driver).click(LocatorXpath);
		click.build().perform();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//span//img[@class = 'Icon Icon--mustard Icon--show']")).click();
	
		
	}
	
	public String ValidarVisualizarNumeroPedido()throws InterruptedException{
		
		return driver.findElement(By.xpath("//h1[text()='Pedido']")).getText();
	}
	
	public void ClicarVoltarPedido() throws InterruptedException{
		
		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button/span[@class='BaseButton__Text BaseButton--white-Text']")));
		driver.findElement(By.xpath("//button/span[@class='BaseButton__Text BaseButton--white-Text']")).click();
		Thread.sleep(4000);	
	}
	
	public void ClicarAcoesPin() throws InterruptedException{
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class = 'DataTableActions']")));
		driver.findElement(By.xpath("//td[@class = 'DataTableActions']")).click();
		WebElement LocatorXpath = driver.findElement(By.xpath("//img[@class='Icon Icon--mustard Icon--pin']"));
		Actions click = new Actions(driver).click(LocatorXpath);
		click.build().perform();
		Thread.sleep(2000);		

		
	}

	public String  ValidarRatreioPedido()throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/figure/img")));
		return driver.findElement(By.xpath("(//th[@style='position: initial; top: 0px;'])[3]")).getText();
	
	}
	
	public String  ValidarRatreioPedido2 ()throws InterruptedException{
		
		return driver.findElement(By.xpath("(//th[@style='position: initial; top: 0px;'])[3]")).getText();
	
	}
	
	public void trocarAba1() throws InterruptedException{
		
		ArrayList<String> abas = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(abas.get(0));
		
	}
	




}

