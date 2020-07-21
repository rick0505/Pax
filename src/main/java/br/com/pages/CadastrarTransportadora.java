package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.Parametros;

public class CadastrarTransportadora extends BasePage{

	public void ClicarTransportadora() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[4]")));
		driver.findElement(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[4]")).click();
					
	}

	public void ClicarCadastrarNovoTransportadora() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section/button/span[@class='BaseButton__Text BaseButton--mustard-Text']")));
		driver.findElement(By.xpath("//section/button/span[@class='BaseButton__Text BaseButton--mustard-Text']")).click();		
	}
	
	public void ClicarNome(String clicarnome) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//form/div/input[@class='InputGroup__input'])[1]")));
		driver.findElement(By.xpath("(//form/div/input[@class='InputGroup__input'])[1]")).sendKeys(clicarnome);
				
	}
	
	public void FourDevsGerarCNPJ() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div//input[@class='btn-cta']")));
		driver.findElement(By.xpath("//div/div//input[@class='btn-cta']")).click();
		
	}
	
	public void ClicarCnpj(String clicarcnpj) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//form/div/input[@class='InputGroup__input'])[2]")));
		driver.findElement(By.xpath("(//form/div/input[@class='InputGroup__input'])[2]")).sendKeys(clicarcnpj);
		
	}
	
	public String CopiarCnpj() throws InterruptedException{
		
		Thread.sleep(1000);
		Parametros.CNPJ = driver.findElement(By.xpath("//div/div/div[@class='output-txt output-txt-active']")).getText();
		return Parametros.CNPJ;
		
	}
	
	public void Celular (String celular) throws InterruptedException{
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//div/input[@data-test='phone']")));
		driver.findElement(By.xpath("//div//div/input[@data-test='phone']")).sendKeys(celular);
			
	}
	
	public void Email(String email) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//div//input[@data-test='email']")));
		driver.findElement(By.xpath("//div//div//input[@data-test='email']")).sendKeys(email);
		
	}
	
	public void CEP(String cep) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/input[@class='InputGroup__input'])[1]")));
		driver.findElement(By.xpath("(//div/div/input[@class='InputGroup__input'])[1]")).sendKeys(cep);
		
	}
	
	public void Numero(String numero) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/input[@class='InputGroup__input'])[3]")));
		driver.findElement(By.xpath("(//div/div/input[@class='InputGroup__input'])[3]")).sendKeys(numero);
	
	}
	
	public void Complemento(String complemento) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/input[@class='InputGroup__input'])[4]")));
		driver.findElement(By.xpath("(//div/div/input[@class='InputGroup__input'])[4]")).sendKeys(complemento);
		
	}
	
	public void SalvarAlteracoes() throws InterruptedException{
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button//span[@class='BaseButton__Text BaseButton--black-Text']")));
		driver.findElement(By.xpath("//button//span[@class='BaseButton__Text BaseButton--black-Text']")).click();
		Thread.sleep(3000);
	}
	
	
	public String ValidarTransportadora () {
		
		return driver.findElement(By.xpath("(//tr/td//span[@class='DataTableTd__Content DataTable--limit'])[2]")).getText();
		
		
	}
}