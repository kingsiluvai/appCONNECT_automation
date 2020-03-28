package appconnect.automation1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.loaderCreationPage;

public class loaderCreation 
{
@Test
public void New_load_create() throws Exception
{
	
	WebDriver driver = null;
	//Snapshots snapshot=new Snapshots();
	loaderCreationPage creation=new loaderCreationPage(driver);
	creation.loader_create();
	
}
}
