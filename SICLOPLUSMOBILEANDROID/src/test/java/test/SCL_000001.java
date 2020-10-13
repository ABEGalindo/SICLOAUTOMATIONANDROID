/**
 * 
 */
package test;

import java.io.IOException;
import modules.*;
import org.junit.Test;

/**
 *@author Abraham Galindo
 *@date 12 oct 2020
 *@description Esta clase contiene metodos que hacen llamado a los modulos para completar los pasos de los TC
 */
public class SCL_000001  extends BaseTest {
	@Test
	public void login() throws IOException {
		try {
			ModuleStart home = new ModuleStart(driver);
			ModuleLogin login = new ModuleLogin(driver);
			
			int step = 0;
			System.out.println("Step:" + step + "... Iniciando la aplicación");
			step ++;
			System.out.println("Step:" + step + "... Entrando a login");
			home.enterLogin();
			step ++;
			System.out.println("Step:" + step + "... Haciendo login");
			login.ingresarCorreo();
			login.ingresarContrasenia();
			login.login();
			
		}catch(Exception e){
			System.out.println("Fallo el script");
		}
		
	}
}

