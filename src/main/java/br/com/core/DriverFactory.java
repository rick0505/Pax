package br.com.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	public static WebDriver driver;

	public DriverFactory() {
		initialize();
	}

	public void initialize() {
		if (driver == null)
			createNewDriverInstance();
	}

	private void createNewDriverInstance() {

		System.setProperty("webdriver.chrome.driver", "C:\\Automacao\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized","--disable-gpu","--ignore-certificate-errors", "--silent" );
		driver = new ChromeDriver(option);
		//"--headless",

	}

	public WebDriver getDriver() {
		return driver;
	}

	public static WebDriver setDriver(WebDriver driver) {
		return DriverFactory.driver = driver;
	}

	public static void destroyDriver() {
		driver.quit();
		driver = null;
	}

}
