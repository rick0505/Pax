package br.com.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jira extends DriverFactory {
	

// ------------------------------------------------------ <<< Cadastrar Bug Jira >>> --------------------------------------------------------//	
	
	public void TerrorDoDev () throws InterruptedException, IOException {
		
		Screenshot();
		UrlJira("");
		IncluirTask();
		Projeto("");
		TipoItem("");
		Resumo("");
		Descricao("");
		Ambiente("");
		Upload();
		Criar();
		GravarBugArquivoTXT("");
				
	}
	
//--------------------------- <<< Verifica se o Bug já está disponível com status: ( Qualidade ) para que possa ser retestado. >>> ----------------------------//
	
	public void VerificaStatusBug () throws IOException, InterruptedException {
		
		UrlJira("");
		PesquisarTask("");
		AcessarBug();
		CapturarStatusBug();
		UrlJira("");
				
	}
	
// ------------------------------------------ <<< Aprovar o Bug no Jira caso o mesmo tenha sido aprovado após reteste >>> -------------------------------------//	

	public void Aprovado () throws InterruptedException, IOException {
		
		UrlJira(Parametros.UrlJira);
		PesquisarTask("");
		AcessarBug();
		FinalizarBug();
		ComentarioAprovado();
		FinalizarBugArquivoTXT("");
		Close();
		UrlJira(Parametros.UrlJira);
		
	}
	
		
// ----------------------------------------------------------------- <<< Reprovar Bug Jira >>> -----------------------------------------------------------------//

	public void Reprovado () throws InterruptedException {
		
		UrlJira("");
		PesquisarTask("");
		AcessarBug();
		ReprovarBug();
		ComentarioReprovado();
		Close();
		UrlJira("");
		
	}
		

// -----------------------------------------------------------------------------//------------------------------------------------------------------------------//
	
	public void UrlJira ( String UrlJira ) {
		
		driver.get(UrlJira);
		
	}
	
	public void Maximizar () {
		
		driver.manage().window().maximize();
		
	}
	
	public void Usuario ( String usuario ) {
		
		driver.findElement(By.id("username")).sendKeys(usuario);
		
	}
				
	public void Senha ( String senha ) {
		
		driver.findElement(By.id("login-submit")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.findElement(By.id("password")).sendKeys(senha);
		
	}
			
	public void Entrar () {
		
		driver.findElement(By.id("login-submit")).click();
		
	}

	public void IncluirTask () {
		
		WebDriverWait wait2 = new WebDriverWait(driver,10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("createGlobalItem")));
		driver.findElement(By.id("createGlobalItem")).click();;
		
	}
	
	public void Projeto ( String projeto ) {
		
		WebDriverWait wait3 = new WebDriverWait(driver,10);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'create-issue-submit']")));
		driver.findElement(By.xpath("(//div/span[@class = 'icon aui-ss-icon noloading drop-menu'])[1]")).click();
		driver.findElement(By.xpath("//input[@id = 'project-field']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id = 'project-field']")).sendKeys(projeto);
		driver.findElement(By.xpath("//input[@id = 'project-field']")).sendKeys(Keys.ENTER);
		
	}
	
	public void TipoItem ( String tipoItem ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div/span[@class = 'icon aui-ss-icon noloading drop-menu'])[2]")));
		driver.findElement(By.xpath("(//div/span[@class = 'icon aui-ss-icon noloading drop-menu'])[2]")).click();
		driver.findElement(By.xpath("//div/input[@id = 'issuetype-field']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//div/input[@id = 'issuetype-field']")).sendKeys(tipoItem);
		driver.findElement(By.xpath("//div/input[@id = 'issuetype-field']")).sendKeys(Keys.ENTER);
		
	}

	public void Resumo (String resumo ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'summary']")));
		driver.findElement(By.xpath("//input[@id = 'summary']")).sendKeys(resumo);
		
	}

	public void Upload () throws InterruptedException {
		
		WebElement UploadArquivo = driver.findElement(By.xpath("//div/span/input[@type = 'file']"));
		UploadArquivo.sendKeys(Parametros.DiretorioUploaEvidencia);
		Thread.sleep(4000);
		
	}
					
	public void Descricao (String descricao ) {
		
		driver.findElement(By.xpath("//textarea[@id=\"description\"]")).sendKeys(descricao);
		
	}
	
	public void Ambiente (String ambiente ) {
		
		driver.findElement(By.xpath("//textarea[@id = 'environment']")).sendKeys(ambiente);
		
	}
	
	public void Sprint (String sprint ) throws InterruptedException {
		
		WebElement Xpath2 = driver.findElement(By.xpath("//div/input[@id = 'customfield_10018-field']"));
		Actions Sprint = new Actions(driver).click(Xpath2);
		Sprint.build().perform();
		driver.findElement(By.xpath("//div/input[@id = 'customfield_10018-field']")).click();
		driver.findElement(By.xpath("//div/input[@id = 'customfield_10018-field']")).sendKeys(sprint);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@id = 'customfield_10018-field']")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
	}
			
	public void Criar () throws InterruptedException {
		
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'create-issue-submit']")));
		driver.findElement(By.xpath("//input[@id = 'create-issue-submit']")).click();
		Thread.sleep(5000);
		
	}
	
	public void AtualizarNavegador () throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
			
	public void GravarBugArquivoTXT ( String gravarBugArquivoTXT ) throws IOException {

		File Diretorio = new File(gravarBugArquivoTXT);
		FileWriter existeBug = new FileWriter(Diretorio, false);
									
		existeBug.write("true");
		existeBug.close();

	}
	
	public void Screenshot () throws IOException, InterruptedException {
		
		Thread.sleep(2000);
		WebDriver augmentedDriver = new Augmenter().augment(driver);
	    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File( Parametros.DiretorioScreenshot + File.separator + "EVIDENCIA.jpg"));
		
	}
	
	public String CapturarStatusBug () throws IOException {
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-test-id='issue.views.issue-base.foundation.status.status-field-wrapper']//button[@type = 'button']/span/span)[1]")));
		String Xpath = driver.findElement(By.xpath("(//div[@data-test-id='issue.views.issue-base.foundation.status.status-field-wrapper']//button[@type = 'button']/span/span)[1]")).getText();
		Parametros.statusBug = Xpath;
		return Parametros.statusBug;
		
	}

	public void PesquisarTask ( String PesquisarTask ) throws InterruptedException {
		
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/form/input[@id = 'search-field-input']")));
		driver.findElement(By.xpath("//li/form/input[@id = 'search-field-input']")).sendKeys(PesquisarTask);
		Thread.sleep(2000);
				
	}
	
	public void AcessarBug () throws InterruptedException {
		
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class = 'ghx-summary']")));
		driver.findElement(By.xpath("//section[@class = 'ghx-summary']")).click();
				
	}
	
	public void ReprovarBug () throws InterruptedException {
				
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class= 'elro8wh3 css-1jbxe2s']")));
		driver.findElement(By.xpath("//button[@class= 'elro8wh3 css-1jbxe2s']")).click();
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/span/span[text() = 'Devolvido']")));
		driver.findElement(By.xpath("//div/span/span[text() = 'Devolvido']")).click();
		
	}
		
	public void ComentarioReprovado () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/input[@placeholder = 'Adicionar comentário...']")).click();
		driver.findElement(By.xpath("//div[@contenteditable='true']/p")).sendKeys("<<< Retestado >>>" + "\n" + "Caso de teste Reprovado." + "\n" + "Em caso de dúvidas favor contatar a equipe de QA.");
		driver.findElement(By.xpath("//div/div/button[@class = 'css-1yx6h60']")).click();
		Thread.sleep(2000);
		
	}

	public void FinalizarBug () {
		
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class= 'elro8wh3 css-1jbxe2s']")));
		driver.findElement(By.xpath("//button[@class= 'elro8wh3 css-1jbxe2s']")).click();
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/span/span[text() = 'Aguardando Deploy']")));
		driver.findElement(By.xpath("//div/span/span[text() = 'Aguardando Deploy']")).click();
		
	}
		
	public void FinalizarBugArquivoTXT ( String finalizarBugArquivoTXT ) throws IOException {

		File Diretorio = new File(finalizarBugArquivoTXT);
		FileWriter existeBug = new FileWriter(Diretorio, false);
									
		existeBug.write("false");
		existeBug.close();

	}
	
	public void ComentarioAprovado () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/input[@placeholder = 'Adicionar comentário...']")).click();
		driver.findElement(By.xpath("//div[@contenteditable='true']/p")).sendKeys("<<< Retestado >>>" + "\n" + "Caso de teste Aprovado.");
		driver.findElement(By.xpath("//div/div/button[@class = 'css-1yx6h60']")).click();
		Thread.sleep(2000);
		
	}
	
	public void Close () throws InterruptedException {
		
		driver.findElement(By.xpath("//span[@aria-label='Fechar']")).click();
		Thread.sleep(1000);
		
	}
	
	
}
