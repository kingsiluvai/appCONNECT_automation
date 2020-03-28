package appconnect.automation1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import ObjectRepository.loaderCreationPage;
import Utils.Log_test;
import Utils.Snapshots;

public class LoginappCONNECT
{
	
	WebDriver driver = null;
	Snapshots snapshot=new Snapshots();
	Log_test log=new Log_test();
	BrowserSetting bs=new BrowserSetting();
@Test
public void login() throws Exception
{
	driver=bs.BrowserSettings();
	log.log_text(driver, "browser started ");
	LoginPage lgn = new LoginPage(driver);
	lgn.Login_value();
	snapshot.screens(driver);
	Thread.sleep(2000);
	loaderCreationPage creation=new loaderCreationPage(driver);
	creation.loader_create();
}
}
