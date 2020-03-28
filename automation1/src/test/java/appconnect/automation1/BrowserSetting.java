package appconnect.automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Utils.Log_test;


public class BrowserSetting
{
public WebDriver BrowserSettings()
{
	Log_test log=new Log_test();
		String BASE_URL="https://trial.chainsys.com/appplatform/core/UserLoginLaunchMapping.echn";
	DriverSettings wds = new DriverSettings();
		WebDriver driver = wds.driverSettings();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		log.log_text(driver, "Url Initiated");
		driver.get(BASE_URL);
		log.log_text(driver, "Url Passed");
		
		return driver;
	}

}


