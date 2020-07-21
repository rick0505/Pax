package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class ExcluirMotorista extends BasePage {

	
	public void ClicarMotorista()  throws InterruptedException{
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[3]")));
		driver.findElement(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[3]")).click();
		
	}
	
	public void ClicarExcluirMotorista() throws InterruptedException{
		
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tr//td[@class='DataTableActions'])[1]")));
		driver.findElement(By.xpath("(//tr//td[@class='DataTableActions'])[1]")).click();
		Thread.sleep(2000);
		WebElement LocatorXpath = driver.findElement(By.xpath("(//section//span[@class='DataTableActions__event trash'])[1]"));
		Actions click = new Actions(driver).click(LocatorXpath);
		click.build().perform();
		driver.findElement(By.xpath("(//section//span[@class='DataTableActions__event trash'])[1]")).click();
		Thread.sleep(3000);	
		
	}
	
	public void ClicarSimExcluirMotorista() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//section//button[@class='BaseButton Dialog__Button BaseButton--dark BaseButton--icon-right BaseButton--filled'])[2]")));
		driver.findElement(By.xpath("(//section//button[@class='BaseButton Dialog__Button BaseButton--dark BaseButton--icon-right BaseButton--filled'])[2]")).click();

	}
	
//	public String ValidarExcluirMotorista () {
//		
//		return driver.findElement(By.xpath("(//tr[@class='DataTable__tr'])[2]")).getText();
//		
//	}
		
}	


