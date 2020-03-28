package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Actions 
{
	WebDriver driver;
public void scroll(WebDriver driver)
{

    JavascriptExecutor js = (JavascriptExecutor) driver;

	
    js.executeScript("window.scrollBy(0,1000)");
}
}
