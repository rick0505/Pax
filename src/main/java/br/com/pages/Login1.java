package br.com.pages;

import org.openqa.selenium.By;

import br.com.core.DriverFactory;

public class Login1 extends DriverFactory {

	
	public void Maximizar () {
		
		driver.manage().window().maximize();
		
	}


	public void Url(String url) {

		driver.get(url);

	}

	public void Login ( String login ) {

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(login);
		
	}

	public void Senha ( String senha ) {

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(senha);
	

	}

	public void BotaoEntrar() throws InterruptedException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	}
	

	
	
	public String ValidaLogin () {
		
		return driver.findElement(By.xpath("//div/button/span[@id = 'be-menu-profile-name']")).getText();
		
		
	}
	
	public String ValidaUsuario1() {
		
		return driver.findElement(By.xpath("//span[@id='be-menu-profile-name']")).getText();
		
	}


}
