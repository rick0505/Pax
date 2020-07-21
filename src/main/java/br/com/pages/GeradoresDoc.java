package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.Parametros;

public class GeradoresDoc extends BasePage {

		
	public void Url ( String url ) {
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public String CapturarCPF () throws InterruptedException {
		
		driver.findElement(By.xpath("(//ul/li/a[text() = 'CPF'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")));
		Parametros.CPF = driver.findElement(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")).getText();
		return Parametros.CPF;
		
	}
			
	public String CapturarCNPJ () throws InterruptedException {
		
		driver.findElement(By.xpath("(//ul/li/a[text() = 'CNPJ'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")));
		Parametros.CNPJ = driver.findElement(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")).getText();
		return Parametros.CNPJ;
		
	}	
	
	public String CapturarCNH () throws InterruptedException {
		
		driver.findElement(By.xpath("(//ul/li/a[text() = 'CNH'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")));
		Parametros.CNH = driver.findElement(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")).getText();
		return Parametros.CNH;
		
	}
			
	public String CapturarRG () throws InterruptedException {
		
		driver.findElement(By.xpath("(//ul/li/a[text() = 'RG'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")));
		Parametros.RG = driver.findElement(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")).getText();
		return Parametros.RG;
		
	}
	
	public String CapturarRENAVAM () throws InterruptedException {
		
		driver.findElement(By.xpath("(//ul/li/a[text() = 'RENAVAM'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")));
		Parametros.Renavam = driver.findElement(By.xpath("(//div/div/span[@class = 'text-copy text-muted bg-gray mt-3 p-2'])[1]")).getText();
		return Parametros.Renavam;
		
	}
	
	
	
	
	
	
	
	
	
	
}
