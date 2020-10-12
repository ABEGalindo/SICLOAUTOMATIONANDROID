/**
 * 
 */
package modules;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

/**
 *@author Abraham Galindo
 *@date 12 oct 2020
 *@description Contiene los elementos en el modulo de login
 */
public class ModuleLogin extends BaseModules {

	@FindBy(id="com.siclo.plus:id/tiet_name_email")
	WebElement txtCorreo;
	@FindBy(id="com.siclo.plus:id/tiet_password")
	WebElement txtContrasenia;
	@FindBy(id="com.siclo.plus:id/b_signin")
	WebElement btnEntrar;
	
	AppiumDriver appiumDriver = (AppiumDriver) driver;
	
	public ModuleLogin(RemoteWebDriver driver) {
		super(driver);
	}	
	
	@Test
	public void ingresarCorreo() {
		setCorreo();			
	}	
	
	public void ingresarContrasenia() {
		setContrasenia();			
	}
	
	public void login() {
		clickEntrar();
	}
	
	private void setCorreo() {		
		sendKeys(txtCorreo, "agalindoba@gmail.com");				
	}
	
	private void setContrasenia() {		
		sendKeys(txtContrasenia, "@Braham1");				
	}
	
	private void clickEntrar() {
		click(btnEntrar);
	}
}