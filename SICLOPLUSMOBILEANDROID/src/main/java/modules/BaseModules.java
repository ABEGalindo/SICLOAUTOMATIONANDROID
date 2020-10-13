/**
 * 
 */
package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *@author Abraham Galindo
 *@date 12 oct 2020
 *@description 
 */
public class BaseModules {
RemoteWebDriver driver;
public final int timeout = 30;	
private static WebDriverWait wait;

	public BaseModules(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, timeout);
	}
	
	protected static void waitForElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	protected void click(WebElement element) {
		waitForElement(element);
		try {
			element.click();	
		}catch (Exception e) {
			System.out.println("no fue posible dar click " + e);	
		}
	}
	
	protected void sendKeys(WebElement element, String text) {
		waitForElement(element);
		try {
			element.sendKeys(text);	
		}catch (Exception e) {
			System.out.println("no fue posible introducir los datos " + e);	
		}
	}

}
