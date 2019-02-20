package core;

import org.junit.After;
import org.junit.Before;

/**
 * @author eduardo.lana
 */
public class BaseTest {
    
    @Before
     public void Inicializa()
       {
            DriverFactory.GetDriver().navigate().to("http://web1.qa.sambatech.com:10000/");
            DriverFactory.GetDriver().manage().window().maximize();    
            
       }
    
    @After
     public void Finaliza()
        {
            DriverFactory.KillDriver();
        }
    
}
