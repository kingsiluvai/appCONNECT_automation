package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;

	@FindBy(id="userName")
	WebElement userName;
	@FindBy(id="password")
	WebElement Password;
/*	//a[@class='cs-pa cs-show cs-circle cs-login-btn cs-tc']
*/	
	@FindBy(xpath="//a[@class='cs-pa cs-show cs-circle cs-login-btn cs-tc']")
	WebElement Login_btn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Login_value()
	{
		userName.sendKeys("kingston.r@chainsys.com");
		Password.sendKeys("Welcome#1");
		Login_btn.click();
		driver.switchTo().alert().accept();
	}
}
