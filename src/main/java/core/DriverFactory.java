package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 *
 * @author eduardo.lana
 */
public class DriverFactory {
     private static WebDriver driver;

        public static WebDriver GetDriver()
        {
        	String browser = "fifox";
        	String cwd = System.getProperty("user.dir");
        	String Chrome = "\\drivers\\chromedriver.exe";
        	String firefox = "\\drivers\\geckodriver.exe";

            if (driver == null)
            {
                
                if (browser.equals("firefox")){
                        FirefoxOptions  options = new FirefoxOptions();
                        String pathselenium = cwd+ firefox;
                        System.setProperty("webdriver.gecko.driver", pathselenium);
                        //options.addArguments("--headless");
                        driver = new FirefoxDriver(options);
                }else{
                	String pathselenium = cwd+Chrome;
                    ChromeOptions options = new ChromeOptions();
                    System.setProperty("webdriver.chrome.driver", pathselenium);
                    driver = new ChromeDriver(options);                 
                }
                        
            }
            return driver;
        }

        public static void KillDriver()
        {
            if (driver != null)
            {
                driver.quit();
                driver = null;
            }
        }
}
    

