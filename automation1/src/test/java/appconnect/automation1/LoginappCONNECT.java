package appconnect.automation1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import Utils.Log_test;
import Utils.Snapshots;

public class LoginappCONNECT
{
	
	
@Test
public void login() throws Exception
{
	WebDriver driver = null;
	Snapshots snapshot=new Snapshots();
	Log_test log=new Log_test();
	
	BrowserSetting bs=new BrowserSetting();
	driver=bs.BrowserSettings();
	log.log_text(driver, "browser started ");
	LoginPage lgn = new LoginPage(driver);
	lgn.Login_value();
	snapshot.screens(driver);

	

}
}
