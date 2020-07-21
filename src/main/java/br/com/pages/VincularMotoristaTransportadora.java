package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;


public class VincularMotoristaTransportadora extends BasePage {
	
	public void ClicarTransportadora() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='BaseMenu__li'])[5]")));
		driver.findElement(By.xpath("(//li[@class='BaseMenu__li'])[5]")).click();
		Thread.sleep(3000);
	}	

	public void  ClicarEditarTransportadora() throws InterruptedException{
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td//div//img[@class='Icon Icon--dark'])[1]")));
		driver.findElement(By.xpath("(//td//div//img[@class='Icon Icon--dark'])[1]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//td//div//img[@class='Icon Icon--dark'])[1]")).click();
		
	}
	
	public void PesquisarPlacaOuNome(String pesquisarplacaounome) throws InterruptedException{
		
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/span[@class='multiselect__placeholder'])[1]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/span[@class='multiselect__placeholder'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[1]")).sendKeys(pesquisarplacaounome);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[1]")).sendKeys(Keys.ENTER);
		
		
	}
	
	public void ClicarVincularMotorista() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button[@class='BaseButton TransportersForm__BindBtn BaseButton--mustard BaseButton--simple BaseButton--filled']")));
		driver.findElement(By.xpath("//div/div/button[@class='BaseButton TransportersForm__BindBtn BaseButton--mustard BaseButton--simple BaseButton--filled']")).click();	
		
	}
		
	public void PageDown () {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0, 2000 )");
			
	}
	
	public String ValidarMotorista() throws InterruptedException {
		
		Thread.sleep(2000);
		return driver.findElement(By.xpath("(//tr/td[@class='DataTableTd'])[3]")).getText();
		
	}
	
	
	
}
