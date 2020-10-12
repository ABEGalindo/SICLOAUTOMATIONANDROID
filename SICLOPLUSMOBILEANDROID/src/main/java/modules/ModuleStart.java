/**
 * 
 */
package modules;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

/**
 *@author Abraham Galindo
 *@date 12 oct 2020
 *@description Contiene los elementos del primer modulo cuando incia la aplicacion
 */
public class ModuleStart extends BaseModules {

	@FindBy(id="com.siclo.plus:id/b_sign_in")
	WebElement btnEntrar;
	
	AppiumDriver appiumDriver = (AppiumDriver) driver;
	
	public ModuleStart(RemoteWebDriver driver) {
		super(driver);
	}	
	
	@Test
	public void enterLogin() {
		clickBtnEntrar();			
	}		
	
	private void clickBtnEntrar() {		
		click(btnEntrar);					
}
	
}
