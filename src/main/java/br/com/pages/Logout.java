package br.com.pages;

import org.openqa.selenium.By;

import br.com.core.BasePage;

public class Logout extends BasePage {

	
	
	public void Usuario () {
		
		driver.findElement(By.xpath("//div/button/span[@id = 'be-menu-profile-name']")).click();
		
	}
	
	public void Sair () {
		
		driver.findElement(By.xpath("//div/div/span[@class='TheHeader__exit-label']")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
