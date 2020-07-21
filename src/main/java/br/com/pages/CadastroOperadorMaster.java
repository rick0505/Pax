package br.com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;



public class CadastroOperadorMaster extends BasePage {
	

	public void Url ( String url ) {
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void ClicarEmOperadores() throws InterruptedException{
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li//span[@class='BaseMenuLink BaseMenuLink--header'])[4]")));
		driver.findElement(By.xpath("(//li//span[@class='BaseMenuLink BaseMenuLink--header'])[4]")).click();
		Thread.sleep(2000);
	}
	
	public void ClicarCadastroOperadores() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='BaseButton TheSubHeader__button BaseButton--mustard BaseButton--icon-right TheSubHeader__button--addnew']")));
		driver.findElement(By.xpath("//button[@class='BaseButton TheSubHeader__button BaseButton--mustard BaseButton--icon-right TheSubHeader__button--addnew']")).click();
		Thread.sleep(2000);
		
	}
	
	public void ClicarOperadorMaster() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down']")));
		driver.findElement(By.xpath("//img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='BaseSelect__Item']")));
		driver.findElement(By.xpath("//div[@class='BaseSelect__Item']")).click();
		
		
	}
	
	public void ClicarNomeOperadorMaster(String nomeoperadormaster) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='InputGroup__input'])[1]")));
		driver.findElement(By.xpath("(//input[@class='InputGroup__input'])[1]")).sendKeys(nomeoperadormaster);
	}
	
	public void ClicarCelularOperadorMaster(String celularoperadormaster) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='InputGroup__input'])[2]")));
		driver.findElement(By.xpath("(//input[@class='InputGroup__input'])[2]")).sendKeys(celularoperadormaster);
	}
	
	public void ClicarEmailOperadorMaster(String emailroperadormaster) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='InputGroup__input'])[3]")));
		driver.findElement(By.xpath("(//input[@class='InputGroup__input'])[3]")).sendKeys(emailroperadormaster);
		
	}
	
	public void ClicarSenhaOperadorMaster(String clicarsenhaoperadormaster) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='InputGroup__input'])[4]")));
		driver.findElement(By.xpath("(//input[@class='InputGroup__input'])[4]")).sendKeys(clicarsenhaoperadormaster);
	}
	
	public void ClicarSalvarOperadorMaster() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='BaseButton BaseButton--mustard BaseButton--icon-right BaseButton--filled DynamicForm__confirm '])")));
		driver.findElement(By.xpath("(//button[@class='BaseButton BaseButton--mustard BaseButton--icon-right BaseButton--filled DynamicForm__confirm '])")).click();
		WaitLoading();
		Thread.sleep(2000);

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
	
	public String ValidarNomeOperadorMaster () {
		
		return driver.findElement(By.xpath("(//td[@class='DataTableTd'])[2]")).getText();
	}	
}
