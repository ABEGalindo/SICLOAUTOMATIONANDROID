package helpers;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *@author Abraham Galindo
 *@date 12 oct 2020
 *@description Esta clase contiene metodos de ayuda para la lectura del archivo properties de configuracion.
 */
public class HProperties {
	public static String strAppiumServer;
	public static String strUser;
	public static String strPsw;
	
	public static String readPath() {
		return new File("").getAbsolutePath();
	}
	
	public static void readProperties() {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream(readPath() + "\\Properties\\Config.properties"));	
			
			strAppiumServer = properties.getProperty("appiumServer");			
						
		}catch(IOException e) {
			System.out.println("Error, no se puede leer el archivo properties");
		}
	}
	 

}
