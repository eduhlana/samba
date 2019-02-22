
package core;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *
 * @author eduardo.lana
 */
public class BasePage {

	protected void clicar(By Element) {
		DriverFactory.GetDriver().findElement(Element).click();
                
	}
        

	protected void Escrever(By Element, String Text) {

		DriverFactory.GetDriver().findElement(Element).sendKeys(Text);
	}
	protected void Existe(By Element) {

		WebDriverWait wait = new WebDriverWait(DriverFactory.GetDriver(), 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated((Element)));
 
	}
	protected void upload (By Element, String obj) {
		
		WebElement upload =  DriverFactory.GetDriver().findElement(Element);
		upload.click();
	
		upload.sendKeys(obj);
		
	}
	protected void validamsg(By Element,String  msg) {
		String mensagem = DriverFactory.GetDriver().findElement(Element).getText();
		assertEquals(mensagem, msg);
	}
	protected String datahoje() {
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return formatador.format( data );
	}
	
     
}
