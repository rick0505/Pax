package br.com.pages;

import org.openqa.selenium.By;
import br.com.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MapaMotorista extends BasePage{
	
	public void MapaMotorista() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='BaseMenuLink BaseMenuLink--active BaseMenuLink--header'])[1]"))).click();

	}
	

}
