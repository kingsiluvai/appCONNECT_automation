package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions 
{
	WebDriver driver;
public void scroll(WebDriver driver,WebElement element)
{
    System.out.println("Inside the scroll page");
    JavascriptExecutor js = (JavascriptExecutor) driver;

	
    
    js.executeScript("arguments[0].scrollIntoView(true);",element);
}
}
