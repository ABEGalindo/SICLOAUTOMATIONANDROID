package test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import helpers.HProperties;
import org.junit.Before;
import org.junit.Assert;
import org.junit.After;
import org.junit.Test;
import java.net.URL;

/**
 *@author Abraham Galindo
 *@date 12 oct 2020
 *@description Esta clase contiene metodos iniciales para la ejecucion de los scripts
 */
public class BaseTest {
public static RemoteWebDriver driver;
	
	@Before
    public void setUp() throws MalformedURLException {
       String device = System.getenv("device");
       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setCapability("platformName","Android");
       capabilities.setCapability("deviceName","pixel_2");
       capabilities.setCapability("platformVersion", "11.0");
       capabilities.setCapability("app", HProperties.readPath() + "\\Resources\\sicloPlus-staging-1.6.2-83.apk");

       String algo = HProperties.strAppiumServer;
       algo = algo;
       driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
    }
	
	 @After
	    public void tearDown() {
	        if (driver != null) {
	         //   driver.quit();
	        }
	    }

	

}
