package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class EsqueciMinhaSenha extends BasePage{
	
	public void Maximizar () {
		
		driver.manage().window().maximize();
		
	}

	public void ClicarEsqueciMinhaSenha() throws InterruptedException {
		driver.findElement(By.xpath("(//button//span[@class='BaseButton__Text BaseButton--dark-Text'])[1]")).click();
		Thread.sleep(2000);

	}
	
	public void Email ( String email ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class = 'ForgotPasswordView__title']/../form/div/input")));
		driver.findElement(By.xpath("//div/input[@type = 'email']")).click();
		driver.findElement(By.xpath("//div/input[@type = 'email']")).sendKeys(email);
		
	}
	
	public void Enviar () {
		
		driver.findElement(By.xpath("//form/button[@class = 'BaseButton BaseButton--dark BaseButton--icon-right DynamicForm__confirm ']")).click();
		
	}
	
	public void Ok () {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/button[@class = 'BaseButton Dialog__Button BaseButton--dark BaseButton--icon-right BaseButton--filled'])[2]")));
		driver.findElement(By.xpath("(//div/button[@class = 'BaseButton Dialog__Button BaseButton--dark BaseButton--icon-right BaseButton--filled'])[2]")).click();
		
	}
	
	public void EmailWeb ( String emailWeb ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/input[@id='user_email']")));
		driver.findElement(By.xpath("//div/input[@id='user_email']")).sendKeys(emailWeb);
		
		
	}
	
	public void PasswordEmail(String passwordemail) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/input[@id='user_password']")));
		driver.findElement(By.xpath("//div/input[@id='user_password']")).sendKeys(passwordemail);
		
	}
	
	public void Login () {
		
		driver.findElement(By.xpath("//div//input[@class='button button--primary login-action']")).click();
		
	}
	
	public void ClicarEmailEntrada() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//div/ul)[2]/li)[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("((//div/ul)[2]/li)[1]")).click();	
	
	}
	
	public void TrocarSenha() throws InterruptedException{

		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		String xpath = driver.findElement(By.xpath("//td/p/a")).getAttribute("href");
		driver.get(xpath);
		
		driver.switchTo().defaultContent();
					
	}
	
	public void NovaSenha (String novasenha) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//input[@class='InputGroup__input InputGroup__input--has-icon'])[1]")));
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input InputGroup__input--has-icon'])[1]")).click();
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input InputGroup__input--has-icon'])[1]")).sendKeys(novasenha);
		
	}
	
	public void ConfirmarSenha (String confirmarsenha) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//input[@class='InputGroup__input InputGroup__input--has-icon'])[1]")));
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input InputGroup__input--has-icon'])[2]")).click();
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input InputGroup__input--has-icon'])[2]")).sendKeys(confirmarsenha);
	}
	
	public void ClicarEnviar() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button//span[@class='BaseButton__Text BaseButton--dark-Text'])[2]")));
		driver.findElement(By.xpath("(//button//span[@class='BaseButton__Text BaseButton--dark-Text'])[2]")).click();
		
	}
	
	public void ClicarOkRedefinirSenha() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//button[@class='BaseButton Dialog__Button BaseButton--dark BaseButton--icon-right BaseButton--filled'])[2]")));
		driver.findElement(By.xpath("(//div//button[@class='BaseButton Dialog__Button BaseButton--dark BaseButton--icon-right BaseButton--filled'])[2]")).click();
				
	}
	
	public String NomePAX() throws InterruptedException{
		
		return driver.findElement(By.xpath("//footer//p[@class='TheFooter__tagline']")).getText();
	}
	
	public void Url(String url) {

		driver.get(url);

	}

	public void Login ( String login ) {

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(login);
		
	}

	public void Senha ( String senha ) {

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(senha);
	

	}

	public void BotaoEntrar() throws InterruptedException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	}
	
	public String MapaMotorista() throws InterruptedException{
		
		return driver.findElement(By.xpath("//span[@class='BaseMenuLink BaseMenuLink--active BaseMenuLink--header']")).getText();
	}
	
}



