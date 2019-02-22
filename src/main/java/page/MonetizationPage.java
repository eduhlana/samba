package page;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;

public class MonetizationPage extends BasePage{
	
	String rootProj = System.getProperty("user.dir");
	
	String btncreateCampaign = "create-campaign";
	String campaignName = "name";
	String btnUpload = "//*[@id=\"new-campaign\"]/article[1]/div[2]/form/div[1]/div[2]/input";
	String erro = "Errors occurred while creating this campaign:";
	String msg = "//*[@id=\"new-campaign\"]/div[1]/div/div/span/strong";
	//reproduzir bug  #7
	public void CreateCampaign()
	{
		Existe(By.id("mn-monetization"));
		clicar(By.id("mn-monetization"));
		Existe(By.id(btncreateCampaign));
		clicar(By.id(btncreateCampaign));
		Existe(By.name(campaignName));
		Escrever(By.name(campaignName), "Teste");
		upload(By.xpath(btnUpload),rootProj+"\\files\\samba.mp4");
		Existe(By.className("pull-left"));
		Escrever(By.name("urlClickThrough"), "teste.com.bra");
		Existe(By.xpath("//*[@id=\"segmentation+55\"]/td/input"));
		clicar(By.xpath("//*[@id=\"segmentation+55\"]/td/input"));
		String hoje = datahoje();
		
		Escrever(By.id("publishDate"), hoje);
		Escrever(By.id("unpublishDate"), hoje);
		Escrever(By.name("target"), "11");
		Escrever(By.name("grossValue"), "10000");
		clicar(By.xpath("//*[@id=\"new-campaign\"]/div[5]/div[1]/button[2]"));
		Existe(By.className("alert alert-error fixed-errors"));
		validamsg(By.xpath(msg),erro);
	}
	

}
