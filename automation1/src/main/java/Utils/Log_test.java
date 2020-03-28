package Utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Log_test
{
	
	Logger log=Logger.getLogger(name)
	public void log_text(WebDriver driver,String text)
	{
		
		log.debug(text);
	}
}
