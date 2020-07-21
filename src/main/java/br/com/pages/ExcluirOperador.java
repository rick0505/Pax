package br.com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

	public class ExcluirOperador extends BasePage{

		public void Url(String url) {

		driver.get(url);
			
	}
		
		public void ClicarEmOperadoresExcluir() throws InterruptedException{
			
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li//span[@class='BaseMenuLink BaseMenuLink--header'])[4]")));
			driver.findElement(By.xpath("(//li//span[@class='BaseMenuLink BaseMenuLink--header'])[4]")).click();
	}
		
	public void ClicarExcluirOperador()throws InterruptedException {
					
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='DataTableActions'])[1]")));
			driver.findElement(By.xpath("(//td[@class='DataTableActions'])[1]")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='DataTableActions'])[1]")));
			driver.findElement(By.xpath("(//td[@class='DataTableActions'])[1]")).click();
			Thread.sleep(2000);
			WebElement LocatorXpath = driver.findElement(By.xpath("(//section//span[@class='DataTableActions__event trash'])[1]"));
			Actions click = new Actions(driver).click(LocatorXpath);
			click.build().perform();
			Thread.sleep(3000);
	}
	
	public void ClicarSimExcluirOperador() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='BaseButton__Text BaseButton--white-Text'])[2]")));
		driver.findElement(By.xpath("(//span[@class='BaseButton__Text BaseButton--white-Text'])[2]")).click();
		Thread.sleep(2000);
		
	}
	
	public String ValidaExcluirOperador() {
		
		return driver.findElement(By.xpath("(//td[@class='DataTableTd'])[2]")).getText();
	}

}