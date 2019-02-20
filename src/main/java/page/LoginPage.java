package page;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;
import junit.framework.Assert;

public class LoginPage extends BasePage{


	public void Setusuario(String user , String usuario) {
		
		Escrever(By.id(user),usuario);
	}
	public void Setsenha(String password , String senha) {
		
		Escrever(By.id(password),senha);
	}
	public void logar(String logar)
	{
		clicar(By.id(logar));
	}
	
	public void VerificaElemento(String element) {
		Existe(By.id(element));
	}
	
	public void loginCorreto() {
		String url = "http://web1.qa.sambatech.com:10000/ui#dashboard";
		

		VerificaElemento("login");
		Setusuario("inputEmail","avaliacao_qa_samba@sambatech.com.br");
		Setsenha("inputPassword","123456789");
		logar("login");
		String urlAtual = DriverFactory.GetDriver().getCurrentUrl();
		assertEquals(url,urlAtual);
		
	}
	public void loginIncorreto() {
		String url = "http://web1.qa.sambatech.com:10000/ui#dashboard";
		VerificaElemento("login");
		Setusuario("inputEmail","a");
		Setsenha("inputPassword","123456789");
		logar("login");
		String urlAtual = DriverFactory.GetDriver().getCurrentUrl();
		assertNotEquals(url,urlAtual);
		
	}


}
