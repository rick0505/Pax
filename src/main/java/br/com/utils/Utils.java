package br.com.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactory;

public class Utils{
	
	private static final WebDriverWait wait;

	static {
	wait = new WebDriverWait(DriverFactory.driver, 10);
	}

	/**
	 * M�todo para verificar a visibilidade de um elemento utilizando o locator
	 * 
	 * @param locator
	 * @return 
	 */
	    
	    public static boolean isVisible(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return false;
	}

	/**
	 * M�todo para verificar a visibilidade de um elemento utilizando o ID
	 * 
	 * @param id
	 */
	public static void isVisible(String id) {
		isVisible(By.id(id));
	}
	
	public static boolean isNotVisible(By locator) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		return false;
	}


	/**
	 * M�todo para verificar a presen�a de um elemento utilizando o locator
	 * 
	 * @param locator
	 */
	public static void isLocated(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * M�todo para verificar a presen�a de um elemento utilizando o ID
	 * 
	 * @param id
	 */
	public static void isLocated(String id) {
		isLocated(By.id(id));
	}

	/**
	 * M�todo para verificar se um elemento � clic�vel utilizando o locator
	 * 
	 * @param locator
	 * @return 
	 */
	public static boolean isClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return false;
	}

	/**
	 * M�todo para verificar se um elemento � clic�vel utilizando o ID
	 * 
	 * @param id
	 */
	public static void isClickable(String id) {
		isClickable(By.id(id));
	}

	/**
	 * M�todo para capturar screenshot
	 * 
	 * @param fileName
	 *            - Nome do arquivo
	 * @throws InterruptedException 
	 */
	/*
	 * public static void takeScreenshot(String fileName) throws
	 * InterruptedException { File scrFile = ((TakesScreenshot)
	 * DriverFactory.driver) .getScreenshotAs(OutputType.FILE); Date data = new
	 * Date(); try { FileUtils.copyFile(scrFile, new File(
	 * "C:\\Users\\phelipe.santos\\eclipse-workspace\\IBPF-Santander\\Evidencias\\"
	 * + fileName + data.getTime() + ".jpeg"), true); } catch (IOException e) {
	 * e.printStackTrace(); } }
	 */

	/**
	 * Pause for X milliseconds.
	 * 
	 * @param iTimeInMillis
	 */
	@Deprecated
	public static void wait(final int iTimeInMillis) {
		try {
			Thread.sleep(iTimeInMillis);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
