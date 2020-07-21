package br.com.pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

	public class PDFMotorista extends BasePage{
	
	public void Url(String url) {

		driver.get(url);
	
	}

	public void ClicarMotorista()  throws InterruptedException{
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[3]")));
		driver.findElement(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[3]")).click();
		Thread.sleep(2000);
	
	}
	
	public void ClicarAcoesMotorista() throws InterruptedException{
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tr//td[@class='DataTableActions'])[1]")));
		driver.findElement(By.xpath("(//tr//td[@class='DataTableActions'])[1]")).click();
		Thread.sleep(4000);
		WebElement LocatorXpath = driver.findElement(By.xpath("(//span[@class = 'DataTableActions__event pdf'])[1]/img[@title = 'PDF']/.."));
		Actions click = new Actions(driver).click(LocatorXpath);
		click.build().perform();
		driver.findElement(By.xpath("(//span[@class = 'DataTableActions__event pdf'])[1]/img[@title = 'PDF']/..")).click();
		WaitLoading();
		Thread.sleep(2000);
		
		
	
		}

	
	public void WaitLoading() {

		        try {

		            WebDriverWait wait = new WebDriverWait(driver, 5);
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'sk-folding-cube']")));
		            String loading = driver.findElement(By.xpath("//div[@class = 'sk-folding-cube']")).getAttribute("class");
		            int count = 1;

		            while (loading != "sk-folding-cube") {

		                Thread.sleep(2000);
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
		}
