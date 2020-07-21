package br.com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class CadastrarMotorista extends BasePage {
	
	public void ClicarMotorista()  throws InterruptedException{
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[3]")));
		driver.findElement(By.xpath("(//ul/li/span[@class='BaseMenuLink BaseMenuLink--header'])[3]")).click();
		
	}
	
	public void ClicarCadastrarNovo() throws InterruptedException {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section/button/span[@class='BaseButton__Text BaseButton--mustard-Text']")));
		driver.findElement(By.xpath("//section/button/span[@class='BaseButton__Text BaseButton--mustard-Text']")).click();
		
	}

	public void VincularLojista(String vincularlojista) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/span[@class='multiselect__placeholder'])[1]")));
		driver.findElement(By.xpath("(//div/div/span[@class='multiselect__placeholder'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[1]")).sendKeys(vincularlojista);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[1]")).sendKeys(Keys.ENTER);
		
	}
	
	public void VincularTransportadora(String vinculartransportadora) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div[@class='multiselect__tags'])[2]")));
		driver.findElement(By.xpath("(//div//div[@class='multiselect__tags'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[2]")).sendKeys(vinculartransportadora);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[2]")).sendKeys(Keys.ENTER);
	
	}
	
	public void NomeMotorista(String nomemotorista){
		
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/input[@class='InputGroup__input'])[1]")));
		driver.findElement(By.xpath("(//div/input[@class='InputGroup__input'])[1]")).sendKeys(nomemotorista);
		
	}
	
	public void CelularMotorista(String celularmotorista){
		
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='InputGroup__input'])[2]")));
		driver.findElement(By.xpath("(//input[@class='InputGroup__input'])[2]")).sendKeys(celularmotorista);
		
	}
	
	public void EmailMotorista(String emailmotorista) {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/input[@class='InputGroup__input'])[3]")));
		driver.findElement(By.xpath("(//div/input[@class='InputGroup__input'])[3]")).sendKeys(emailmotorista);
		
	}
	
	public void NascimentoMotorista(String nascimentomotorista) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/input[@class='BaseDatePicker__calendar'])[1]")));
		driver.findElement(By.xpath("(//div/input[@class='BaseDatePicker__calendar'])[1]")).sendKeys(nascimentomotorista);
	}
	
	public void NumeroRg(String numerorg) {
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/input[@class='InputGroup__input'])[4]")));
		driver.findElement(By.xpath("(//div/input[@class='InputGroup__input'])[4]")).sendKeys(numerorg);
		
	}
	
	public void NumeroCPF(String numerocpf) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[5]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[5]")).click();		
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[5]")).sendKeys(numerocpf);;			
	}
	
	public void NumeroCnpj(String numerocnh) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[6]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[6]")).click();		
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[6]")).sendKeys(numerocnh);
		
	}
	
	public void NumeroCnh(String numerocnh) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[7]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[7]")).click();		
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[7]")).sendKeys(numerocnh);
	}
	
	public void ValidadeCnh(String validadecnh) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='BaseDatePicker__calendar'])[2]")));
		driver.findElement(By.xpath("(//div//div/input[@class='BaseDatePicker__calendar'])[2]")).sendKeys(validadecnh);
		
	}
	
	public void CEPMotorista(String cepmotorista) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/input[@class='InputGroup__input'])[1]")));
		driver.findElement(By.xpath("(//div/div/input[@class='InputGroup__input'])[1]")).sendKeys(cepmotorista);
		
	}
	
	public void NumeroMotorista(String numeromotorista) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/input[@class='InputGroup__input'])[3]")));
		driver.findElement(By.xpath("(//div/div/input[@class='InputGroup__input'])[3]")).sendKeys(numeromotorista);
	}
	
	public void ComplementoMotorista(String complementomotorista) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/input[@class='InputGroup__input'])[4]")));
		driver.findElement(By.xpath("(//div/div/input[@class='InputGroup__input'])[4]")).sendKeys(complementomotorista);
	}
	
	public void PlacaMotorista(String placamotorista) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[14]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[14]")).sendKeys(placamotorista);
		
	}
	
	public void FabricanteMotorista (String fabricantemotorista) throws InterruptedException{
	
		WebDriverWait wait = new WebDriverWait (driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/span[@class='multiselect__placeholder']")));
	    driver.findElement(By.xpath("//div/div/span[@class='multiselect__placeholder']")).click();
	    driver.findElement(By.xpath("(//div//input[@class='multiselect__input'])[3]")).sendKeys(fabricantemotorista);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div//input[@class='multiselect__input'])[3]")).sendKeys(Keys.ENTER);
	
	}
	
	public void ModeloCarroMotorista(String modelocarromotorista) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/span[@class='multiselect__placeholder'])[1]")));
		driver.findElement(By.xpath("(//div/div/span[@class='multiselect__placeholder'])[1]")).click();
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[4]")).click();
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[4]")).sendKeys(modelocarromotorista);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[4]")).sendKeys(Keys.ENTER);
		
		
	}
	
	public void PageDown () throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0, 500 )");
		
	}	
	
	public void MotoristaCarroAno(String motoristacarroano) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/input[@class='BaseDatePicker__calendar'])[3]")));
		driver.findElement(By.xpath("(//div/div/input[@class='BaseDatePicker__calendar'])[3]")).click();
		driver.findElement(By.xpath("(//div/div/input[@class='BaseDatePicker__calendar'])[3]")).sendKeys(motoristacarroano);
	
	}
	
	public void MotoristaRegistroANTT(String motoristaregistroantt) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[14]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[14]")).click();
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[14]")).sendKeys(motoristaregistroantt);
				
	}
	
	public void MotoristaRenavam(String motoristarenavam) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[15]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[16]")).click();
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[16]")).sendKeys(motoristarenavam);
	}
	
	public void BancoMotorista(String bancomotorista) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span/img[@class='Icon Icon--black Icon--chevron-down'])[5]")));
		driver.findElement(By.xpath("(//span/img[@class='Icon Icon--black Icon--chevron-down'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[5]")).click();
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[5]")).sendKeys(bancomotorista);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/input[@class='multiselect__input'])[5]")).sendKeys(Keys.ENTER);
	}
	
	public void AgenciaMotorista(String agenciamotorista) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[17]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[17]")).click();
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[17]")).sendKeys(agenciamotorista);
		
	}
	
	public void ContaMotorista(String contamotorista) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div/input[@class='InputGroup__input'])[18]")));
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[18]")).click();
		driver.findElement(By.xpath("(//div//div/input[@class='InputGroup__input'])[18]")).sendKeys(contamotorista);
	}
	
	
	public void TipoContaMotorista() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/div/img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[2]")));
		driver.findElement(By.xpath("(//div/div/img[@class='Icon BaseSelect__icon Icon--black Icon--chevron-down'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div/div[@class='BaseSelect__Item'])[29]")).click();

	}
		  
	public void UploadArquivo() throws InterruptedException{
		
		WebElement uploadWebElement =  driver.findElement(By.xpath("//div/input[@name='rg']"));
		uploadWebElement.sendKeys("C:\\\\Users\\\\jorge.souza\\\\Downloads\\\\Layla.jpg"); 
	}
	
	public void SalvarMotorista() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button/span[@class='BaseButton__Text BaseButton--black-Text']")));
		driver.findElement(By.xpath("//button/span[@class='BaseButton__Text BaseButton--black-Text']")).click();
		Thread.sleep(4000);
		
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
	
	public String ValidaNomeMotorista () throws InterruptedException {
		
		return driver.findElement(By.xpath("(//td[@class='DataTableTd'])[3]")).getText();
		
		
}
		
		
		
}
