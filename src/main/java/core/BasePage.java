
package core;
import org.openqa.selenium.By;
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

		WebDriverWait wait = new WebDriverWait(DriverFactory.GetDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated((Element)));
 
	}
     
}
