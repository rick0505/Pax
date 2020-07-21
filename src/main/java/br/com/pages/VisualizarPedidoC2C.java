package br.com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class VisualizarPedidoC2C extends BasePage{
	
	public void Url(String url) {

		driver.get(url);
	}
	
	public void ClicarPedidoC2C() throws InterruptedException{
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='BaseMenu__li'])[2]"))).click();
		Thread.sleep(2000);
		
	}	
	
	public void ClicarLojistaPedido( String clicarLojistaPedido ) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='multiselect__tags'])[1]")));
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[1]")).click();
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[1]")).sendKeys(clicarLojistaPedido);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class = 'multiselect__option multiselect__option--highlight'])[1]")));
		driver.findElement(By.xpath("(//span[@class = 'multiselect__option multiselect__option--highlight'])[1]")).click();
		WaitLoading();
		driver.findElement(By.xpath("//span[@class = 'BaseMultiselect__Arrow BaseMultiselect__Arrow--open']")).click();;
		
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
				
	public void ClicarAcoesVisualizarC2C() throws InterruptedException{
			
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='DataTableActions'])[1]")));		
		WebElement element = driver.findElement(By.xpath("(//td[@class='DataTableActions'])[1]"));
		Actions click = new Actions(driver);
		click.moveToElement(element);
		click.build().perform();
		WebDriverWait wait1 = new WebDriverWait (driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class = 'DataTableActions__event show'])[1]")));		
		driver.findElement(By.xpath("(//span[@class = 'DataTableActions__event show'])[1]")).click();
		}
			

	public void PesquisarPedido() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div[@class='multiselect__tags'])[4]")));
		driver.findElement(By.xpath("(//div/div[@class='multiselect__tags'])[4]")).click();
		Thread.sleep(2000);
	
	}
	
	public void FiltrarPedido(String filtrarpedido) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/input[@class = 'multiselect__input'])[4]")));
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[4]")).click();
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[4]")).sendKeys(filtrarpedido);
		driver.findElement(By.xpath("(//div/input[@class = 'multiselect__input'])[4]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	
	}
	public void ClicarVoltarPedido() throws InterruptedException{
		
		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section/button[@class='BaseButton TheSubHeader__button BaseButton--white BaseButton--icon-left TheSubHeader__button--back']")));
		driver.findElement(By.xpath("//section/button[@class='BaseButton TheSubHeader__button BaseButton--white BaseButton--icon-left TheSubHeader__button--back']")).click();
		Thread.sleep(3000);	
	}
	
//	public String ValidarNumeroPedido() throws InterruptedException{
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='DataTableTd__Content DataTable--limit'])[2]")));
//		Thread.sleep(2000);
//		return driver.findElement(By.xpath("(//span[@class='DataTableTd__Content DataTable--limit'])[2]")).getText();
		
//	}
	
	public String ValidarNumeroPedido() throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tr//td[@class='DataTableTd'])[6]")));
		return driver.findElement(By.xpath("(//tr//td[@class='DataTableTd'])[6]")).getText();
	}
	
//	public String ValidarNumeroPedido2() throws InterruptedException{
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tr//td[@class='DataTableTd'])[2]")));
//		return driver.findElement(By.xpath("(//tr//td[@class='DataTableTd'])[2]")).getText();
//		Thread.sleep(2000);
		
		
	
}	