package br.com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class RastrearPedido extends BasePage {
	
	public void Url(String url) {

		driver.get(url);
	}
	
	public void ClicarPedido() throws InterruptedException{
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='BaseMenuLink BaseMenuLink--header'])[1]")));
		driver.findElement(By.xpath("(//span[@class='BaseMenuLink BaseMenuLink--header'])[1]")).click();
		Thread.sleep(2000);
		
	}	
	
	public void ClicarLojistaPedido( String clicarLojistaPedido ) throws InterruptedException{
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='multiselect__tags'])[1]")));
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[1]")).click();
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[1]")).sendKeys(clicarLojistaPedido);
		WaitLoading();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class = 'multiselect__option multiselect__option--highlight'])[1]")));
		driver.findElement(By.xpath("(//span[@class = 'multiselect__option multiselect__option--highlight'])[1]")).click();
		WaitLoading();
		driver.findElement(By.xpath("//span[@class = 'BaseMultiselect__Arrow BaseMultiselect__Arrow--open']")).click();
		
	}
	
	public void WaitLoading() {

        try {

            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'sk-folding-cube']")));
            String loading = driver.findElement(By.xpath("//div[@class = 'sk-folding-cube']")).getAttribute("class");
            int count = 1;

            while (loading != "sk-folding-cube") {

                Thread.sleep(1000);
                count++;
                System.out.println("Loading: " + count + " segundos.");
                loading = driver.findElement(By.xpath("//div[@class = 'sk-folding-cube']")).getAttribute("class");

                if (count == 30) {

                    Assert.fail("O loading durou mais do que 30 segundos.");

                }
            }

        } catch (Exception e) {

        }
		
	}
	
	public void ClicarAcoesPin() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tr//td[@class = 'DataTableActions'])[1]")));
		driver.findElement(By.xpath("(//tr//td[@class = 'DataTableActions'])[1]")).click();
		Thread.sleep(5000);
		WebElement LocatorXpath = driver.findElement(By.xpath("(//span[@class='DataTableActions__event pin'])[1]"));
		Actions click = new Actions(driver).click(LocatorXpath);
		click.build().perform();
		Thread.sleep(5000);

		
		
	}

	public void trocarAba1() throws InterruptedException{
		
		ArrayList<String> abas = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(abas.get(0));
		

	}

	public String ValidarRatreioPedido() throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//th[@style='position: initial; top: 0px;'])[3]")));
		return driver.findElement(By.xpath("(//th[@style='position: initial; top: 0px;'])[3]")).getText();

	}

//	public String ValidarRatreioPedido2() throws InterruptedException {
//
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='Tracking__order']")));
//		return driver.findElement(By.xpath("//span[@class='Tracking__order']")).getText();

	}
	
