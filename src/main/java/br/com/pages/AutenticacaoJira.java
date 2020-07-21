package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactory;

public class AutenticacaoJira extends DriverFactory{
	
	public void UrlJira ( String UrlJira ) {
		
		driver.get(UrlJira);
		
	}
	
	public void Maximizar () {
		
		driver.manage().window().maximize();
		
	}
	
	public void Usuario ( String usuario ) {
		
		driver.findElement(By.id("username")).sendKeys(usuario);
		
	}
				
	public void Senha ( String senha ) {
		
		driver.findElement(By.id("login-submit")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.findElement(By.id("password")).sendKeys(senha);
		
	}
			
	public void Entrar () {
		
		driver.findElement(By.id("login-submit")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button[@id = 'createGlobalItem']")));
		
	}

}
