/**
 * 
 */
package test;

import java.io.IOException;

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
			int step = 0;
			System.out.println("Step:" + step + "... Iniciando la aplicación");
			//driver.get("http://google.com");
		    //Assert.assertEquals("Title should be Google", "Google", driver.getTitle());
			
			
		}catch(Exception e){
			System.out.println("Fallo el script");
		}
		
	}
}

