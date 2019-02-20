package page;
import org.junit.Test;

import core.BaseTest;



public class Exec extends BaseTest{
	
	LoginPage login = new LoginPage();
	
	@Test
	public void fazerLogin() {
			login.loginCorreto();
	}
	@Test
	public void LoginIncorreto() {
			login.loginIncorreto();
	}

}
