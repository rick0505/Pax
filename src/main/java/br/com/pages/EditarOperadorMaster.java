package br.com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class EditarOperadorMaster extends BasePage {
	
	public void Url(String url) {

		driver.get(url);
		
	}
	
	public void ClicarEmOperadores() throws InterruptedException{
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li//span[@class='BaseMenuLink BaseMenuLink--header'])[4]")));
		driver.findElement(By.xpath("(//li//span[@class='BaseMenuLink BaseMenuLink--header'])[4]")).click();
		
	}
	
	public void ClicarEditarOperadores() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='DataTableActions'])[1]")));
		driver.findElement(By.xpath("(//td[@class='DataTableActions'])[1]")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='DataTableActions'])[1]")));
		driver.findElement(By.xpath("(//td[@class='DataTableActions'])[1]")).click();
		Thread.sleep(2000);
		WebElement LocatorXpath = driver.findElement(By.xpath("(//span[@class='DataTableActions__event edit'])[1]"));
		Actions click = new Actions(driver).click(LocatorXpath);
		click.build().perform();
		Thread.sleep(3000);
	}
	
	public void EditarNomeOperador(String editarnomeoperador) throws InterruptedException{

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'InputGroup InputGroup__AutoFill--white InputGroup__Theme--dark DynamicForm__name ']")));
        driver.findElement(By.xpath("(//input[@class = 'InputGroup__input'])[1]")).click();
        Thread.sleep(2000);

        try {

            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_END);
            robot.keyRelease(KeyEvent.VK_END);

            Thread.sleep(1000);
            int count = 25;

            while (count != 0 ) {

                robot.keyPress(KeyEvent.VK_BACK_SPACE);
                robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                --count;
                Thread.sleep(5);

            }

        } catch (AWTException e) {

            e.printStackTrace();
        }

        driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[1]")).sendKeys(editarnomeoperador);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[1]")).sendKeys(Keys.ENTER);
    }
}


