package page;
import org.junit.Test;

import core.BaseTest;



public class Exec extends BaseTest{
	
	//LoginPage login = new LoginPage();
	MonetizationPage monetizationPage = new MonetizationPage();
	@Test
	public void CreateCampaign() {
		monetizationPage.CreateCampaign();
	}
	
	
	/*@Test
	public void fazerLogin() {
			login.loginCorreto();
	}
	@Test
	public void LoginIncorreto() {
			login.loginIncorreto();
	}*/
	

}
