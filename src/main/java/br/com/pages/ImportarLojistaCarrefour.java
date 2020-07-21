package br.com.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class ImportarLojistaCarrefour extends BasePage {

	public void  ClicarLojistaCarrefour() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='BaseMenu__li'])[2]")));
		driver.findElement(By.xpath("(//li[@class='BaseMenu__li'])[2]")).click();
		Thread.sleep(2000);
		
	}
	
	public void ClicarBotãoImportar() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='BaseButton__Text BaseButton--white-Text'])[1]")));
		driver.findElement(By.xpath("(//span[@class='BaseButton__Text BaseButton--white-Text'])[1]")).click();
		Thread.sleep(2000);
	}
	
	public void SelecionarLojistaCarrefour(String selecionarlojistacarrefour) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='multiselect__tags'])[1]")));
				
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class = 'BaseSelect__selectedContainer'])[1]")).click();
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[1]")).sendKeys(selecionarlojistacarrefour);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/li/span[@class = 'multiselect__option multiselect__option--highlight']/span")));
		driver.findElement(By.xpath("//ul/li/span[@class = 'multiselect__option multiselect__option--highlight']/span")).click();
		Thread.sleep(3000);
		
	}

}
