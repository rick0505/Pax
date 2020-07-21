package br.com.core;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BasePage extends DriverFactory{

/********* TextField e TextArea ************/
	
	
	public void url(String url) {
		DriverFactory.driver.get(url);
	}
	
	public void escrever(By by, String texto){
		DriverFactory.driver.findElement(by).clear();
		DriverFactory.driver.findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
	
	public String obterValorCampo(String id_campo) {
		return DriverFactory.driver.findElement(By.id(id_campo)).getAttribute("value");
	}
	
	/********* Radio e Check ************/
	
	public void clicarRadio(By by) {
		DriverFactory.driver.findElement(by).click();
	}
	
	public void clicarRadio(String id) {
		clicarRadio(By.id(id));
	}
	
	public boolean isRadioMarcado(String id){
		return DriverFactory.driver.findElement(By.id(id)).isSelected();
	}
	
	public void clicarCheck(String id) {
		DriverFactory.driver.findElement(By.id(id)).click();
	}
	
	public boolean isCheckMarcado(String id){
		return DriverFactory.driver.findElement(By.id(id)).isSelected();
	}
	
	/********* Combo ************/
	
	public void selecionarCombo(By by, String valor) {
		
		WebElement element = DriverFactory.driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	
	public void deselecionarCombo(String id, String valor) {
		
		WebElement element = DriverFactory.driver.findElement(By.id(id));
		Select combo = new Select(element);
		combo.deselectByVisibleText(valor);
	}

	public String obterValorCombo(String id) {
		
		WebElement element = DriverFactory.driver.findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	
	public List<String> obterValoresCombo(String id) {
		WebElement element = DriverFactory.driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for(WebElement opcao: allSelectedOptions) {
			valores.add(opcao.getText());
		}
		
		return valores;
	}
	
	public int obterQuantidadeOpcoesCombo(String id){
		WebElement element = DriverFactory.driver.findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}
	
	public boolean verificarOpcaoCombo(String id, String opcao){
		WebElement element = DriverFactory.driver.findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for(WebElement option: options) {
			if(option.getText().equals(opcao)){
				return true;
			}
		}
		
		return false;
	}
	
	public void selecionarComboPrime(String radical, String valor) {
		clicarRadio(By.xpath("//*[@id='"+radical+"_input']/../..//span"));
		clicarRadio(By.xpath("//*[@id='"+radical+"_items']//li[.='"+valor+"']"));
	}
	
	/********* Botao ************/
	
	public void clicarBotao(By by) {
		DriverFactory.driver.findElement(by).click();
	}
	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}
	
	public void clicarBotaoPorTexto(String texto){
		clicarBotao(By.xpath("//button[.='"+texto+"']"));
	}
	
	public String obterValueElemento(String id) {
		return DriverFactory.driver.findElement(By.id(id)).getAttribute("value");
	}
	
	/********* Link ************/
	
	public void clicarLink(String link) {
		DriverFactory.driver.findElement(By.linkText(link)).click();
	}
	
	/********* Textos ************/
	
	public String obterTexto(By by) {
		return DriverFactory.driver.findElement(by).getText();
	}
	
	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
	
	/********* Alerts ************/
	
	public String alertaObterTexto(){
		Alert alert = DriverFactory.driver.switchTo().alert();
		return alert.getText();
	}
	
	public String alertaObterTextoEAceita(){
		Alert alert = DriverFactory.driver.switchTo().alert();
		String valor = alert.getText();
		alert.accept();
		return valor;
		
	}
	
	public String alertaObterTextoENega(){
		Alert alert = DriverFactory.driver.switchTo().alert();
		String valor = alert.getText();
		alert.dismiss();
		return valor;
		
	}
	
	public void alertaEscrever(String valor) {
		Alert alert = DriverFactory.driver.switchTo().alert();
		alert.sendKeys(valor);
		alert.accept();
	}
	
	/********* Frames e Janelas ************/
	
	public void entrarFrame(String id) {
		DriverFactory.driver.switchTo().frame(id);
	}
	
	public void sairFrame(){
		DriverFactory.driver.switchTo().defaultContent();
	}
	
	public void trocarJanela(String id) {
		DriverFactory.driver.switchTo().window(id);
	}
	
	/************** JS *********************/
	
	public Object executarJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.driver;
		return js.executeScript(cmd, param);
	}
	
	/************** Tabela *********************/
	
	public WebElement obterCelula(String colunaBusca, String valor, String colunaBotao, String idTabela){
		//procurar coluna do registro
		WebElement tabela = DriverFactory.driver.findElement(By.xpath("//*[@id='"+idTabela+"']"));
		int idColuna = obterIndiceColuna(colunaBusca, tabela);
		
		//encontrar a linha do registro
		int idLinha = obterIndiceLinha(valor, tabela, idColuna);
		
		//procurar coluna do botao
		int idColunaBotao = obterIndiceColuna(colunaBotao, tabela);
		
		//clicar no botao da celula encontrada
		WebElement celula = tabela.findElement(By.xpath(".//tr["+idLinha+"]/td["+idColunaBotao+"]"));
		return celula;
	}
	
	public void clicarBotaoTabela(String colunaBusca, String valor, String colunaBotao, String idTabela){
		WebElement celula = obterCelula(colunaBusca, valor, colunaBotao, idTabela);
		celula.findElement(By.xpath(".//input")).click();
		
	}

	protected int obterIndiceLinha(String valor, WebElement tabela, int idColuna) {
		List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td["+idColuna+"]"));
		int idLinha = -1;
		for(int i = 0; i < linhas.size(); i++) {
			if(linhas.get(i).getText().equals(valor)) {
				idLinha = i+1;
				break;
			}
		}
		return idLinha;
	}

	protected int obterIndiceColuna(String coluna, WebElement tabela) {
		List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
		int idColuna = -1;
		for(int i = 0; i < colunas.size(); i++) {
			if(colunas.get(i).getText().equals(coluna)) {
				idColuna = i+1;
				break;
			}
		}
		return idColuna;
	}
	
	public void upload(By by, String path) {
		DriverFactory.driver.findElement(by).sendKeys(path);
	}
	
	public boolean hasElement(By selector) {
		try {
			this.getElements(selector);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean hasElements(By selector) {
		return !this.getElements(selector).isEmpty();
	}
	

	
	/*
	 * public void login(String email, String pass) { LoginPage lp = new
	 * LoginPage(); lp.sair(true); lp.nomeUsuario(email); lp.senha(pass);
	 * lp.entrar(); }
	 */
	

	public List<WebElement> getElements(By selector) {
		return DriverFactory.driver.findElements(selector);
	}
	
	public WebElement getElement(By selector) {
		return DriverFactory.driver.findElement(selector);
	}
	
	public boolean elementHasElement(WebElement element, By selector) {
		try {
			element.findElement(selector);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public WebElement getInputByLabel(String label) {
		List<WebElement> fields = this.getElements(By.cssSelector(".md-field"));
		WebElement input = null;
		for(WebElement field : fields) {
			By selector = By.xpath(String.format("//label[contains(text(), '%s')]", label));
			if(this.elementHasElement(field, selector )) {
				input = field.findElement(By.cssSelector("* input"));
			}
		}
		return input;
	}
	
	public Actions getActions() {
		return new Actions(DriverFactory.driver);
	}
	
	/*
	 * public WebElement paginateGetElement(String term) throws InterruptedException
	 * { return new PaginateSearch().search(term); }
	 */

	public void lista(String nome,By referencia,By by ) throws InterruptedException {
		driver.findElement(By.id("select2-project_id-container")).click();
		driver.findElement(referencia).clear();
		driver.findElement(referencia).sendKeys(nome);
		Thread.sleep(300);
		List <WebElement> listItems = driver.findElements(by);
		listItems.get(0).click();
	}
	
	public void LerArquivoTXT ( String Crie_e_informe_aqui_o_Diretorio_do_Arquivo_TXT_que_armazenara_a_informacao_do_BUG ) throws IOException {
		
		FileInputStream arquivo = new FileInputStream(Crie_e_informe_aqui_o_Diretorio_do_Arquivo_TXT_que_armazenara_a_informacao_do_BUG);
		InputStreamReader input = new InputStreamReader(arquivo);
		BufferedReader lerTxt = new BufferedReader(input);
				
		String CapturaValorTxt;
		
		CapturaValorTxt = lerTxt.readLine();	
		
//		System.out.println("A variável: ( CapturaValorTxt ) armazenou o valor do tipo String capturado do carquivo txt: " + "<<< " + CapturaValorTxt + " >>>" );	
				
		boolean Bug;
		
		Bug = Boolean.parseBoolean(CapturaValorTxt);
		Parametros.existeBug = Bug;

//		System.out.println("A variável: ( Bug ) recebe o 'valor String' capturado do txt e " +
//		"converte para o tipo de dado: 'Booleano': " + "<<< " + Parametros.existeBug + " >>> " + 
//		"e transfere o valor para a variável publica e statica: ( existeBug ), estendida da Classe: ( Parametros ).");
	
	}
	
	
}
