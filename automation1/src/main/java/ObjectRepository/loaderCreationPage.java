package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Actions;

public class loaderCreationPage 
{
	Actions action=new Actions();
	WebDriver driver;
	@FindBy(xpath="//div[@id='cs_switchmenu']")
	WebElement switch_Menu;
	@FindBy(xpath="//span[text()='Loader']")
	WebElement Loader_menu_select;
	@FindBy(xpath="//i[@class='icon-cs-new']")
	WebElement New_loader_click;
	@FindBy(xpath=".//div[@title = 'CORE_V15_DEV']//preceding::i[2]")
	WebElement Loader_conn_select;
	public loaderCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loader_create() throws Exception
	{
		switch_Menu.click();
		Thread.sleep(3000);
		Loader_menu_select.click();
		Thread.sleep(3000);
		New_loader_click.click();
		Thread.sleep(3000);
		action.scroll(driver, Loader_conn_select);
		Loader_conn_select.click();
		Thread.sleep(3000);
	}
	
}
