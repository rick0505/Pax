package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class RastrearPedidoC2C extends BasePage {
	
	public void ClicarPedido() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='BaseMenuLink BaseMenuLink--header'])[1]"))).click();
		Thread.sleep(3000);
	
		}	
	
	public void ClicarAcoesPin() throws InterruptedException{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//td[@class = 'DataTableActions'])[1]")).click();
		WebElement LocatorXpath = driver.findElement(By.xpath("(//span//img[@class = 'Icon Icon--mustard'])[3]"));
		Thread.sleep(2000);
		Actions click = new Actions(driver).click(LocatorXpath);
		click.build().perform();		

	}
	public void CPFClienteC2C (String cpfclientec2c) throws InterruptedException{
		
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/input[@class='InputGroup__input']")));
		driver.findElement(By.xpath("//form/div/input[@class='InputGroup__input']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form/div/input[@class='InputGroup__input']")).sendKeys(cpfclientec2c);
		
	}

	public String ValidarRatreioPedido() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/figure/img")));
		return driver.findElement(By.xpath("(//th[@style='position: initial; top: 0px;'])[3]")).getText();

	}
	
	

	public String ValidarRatreioPedido2() throws InterruptedException {

		return driver.findElement(By.xpath("(//th[@style='position: initial; top: 0px;'])[3]")).getText();

	}
}