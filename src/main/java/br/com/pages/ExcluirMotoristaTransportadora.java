package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class ExcluirMotoristaTransportadora extends BasePage {
	
		public void ClicarExcluirMotoristaTransportadora() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/span/img[@class='Icon Icon--dark']")));
		driver.findElement(By.xpath("//div/span/img[@class='Icon Icon--dark']")).click();
		
		}
}
		
