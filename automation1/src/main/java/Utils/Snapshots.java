package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Snapshots 
{
	
public void screens(WebDriver driver) throws IOException
{
	
	String default_text="king";
	String name = null;
	for(int i=0;i<1000000;i++)
	{
		name=Integer.toString(i);
	}
	
	
	TakesScreenshot scrShot =((TakesScreenshot)driver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File("E:/Appconnect/automation1/Screens/"+default_text+name+".png");

            //Copy file at destination

           FileUtils.copyFile(SrcFile, DestFile);

}
}
