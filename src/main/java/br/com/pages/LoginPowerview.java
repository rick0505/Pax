package br.com.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import br.com.core.BasePage;

public class LoginPowerview extends BasePage {

	public void Maximiza() {
		driver.manage().window().maximize();

	}

	public void Url() {

		driver.get("https://powerview-hmg.doc88.com.br/auth/login");

	}

	public void Usuario() {

		driver.findElement(By.xpath("//input[@name = 'login']")).sendKeys("gabriel.souza@doc88.com.br");

	}

	public void Senha() {

		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("G@briel@123456");

	}

	public void Entrar() {

//		driver.findElement(By.xpath("//button[@id = 'be-login']")).click();
		driver.findElement(By.xpath("//button[@id = 'be-logi']")).click();
	}

	public String ValidaLogin() {

		return driver.findElement(By.xpath("//span[text() = 'Gabriel Oliveira Conrado de Souza']")).getText();

	}
	
	public void LerArquivoTXY() throws IOException {
		
		LerArquivoTXT("C:\\Automacao\\Parametros\\TestLoginPowerview\\existeBug.txt");
		
	}
}
