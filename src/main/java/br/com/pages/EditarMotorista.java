package br.com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

	public class EditarMotorista extends BasePage{

		public void Url(String url) {

		driver.get(url);
			
	}
	
	public void ClicarMotorista()  throws InterruptedException{
			
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[3]")));
		driver.findElement(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[3]")).click(); 

	}
	
	public void ClicarAcoesEditarMotorista() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class = 'DataTableActions'])[1]")).click();
		WebElement LocatorXpath = driver.findElement(By.xpath("(//span/img[@title ='Editar'])[1]"));
		Thread.sleep(2000);
		Actions click = new Actions(driver).click(LocatorXpath);
		click.build().perform();
	}
	
	public void EditarNascimento(String editarnascimento) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/input[@class='BaseDatePicker__calendar']")));
		driver.findElement(By.xpath("//div/div/input[@class='BaseDatePicker__calendar']")).sendKeys(Keys.CLEAR);
		driver.findElement(By.xpath("//div/div/input[@class='BaseDatePicker__calendar']")).sendKeys(editarnascimento);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/div/input[@class='BaseDatePicker__calendar']")).sendKeys(Keys.ENTER);
	}
	
	public void PageDown () {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0, 2000 )");
		
	}
	
	public void SalvarMotorista() throws InterruptedException{
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button//span[@class='BaseButton__Text BaseButton--black-Text'])[3]")));
		driver.findElement(By.xpath("(//button//span[@class='BaseButton__Text BaseButton--black-Text'])[3]")).click();
		
	}
	
//	public String ValidarEditarMotoristaNome() {
//		
//		return driver.findElement(By.xpath("(//span[@class='DataTableTd__Content DataTable--limit'])[3]")).getText();
	}
	
	

