package Utils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Snapshots 
{
	
public void screens(WebDriver driver) throws IOException
{
	
	String default_text="king";
	//String name = null;
	 Random rand = new Random(); 
	  
     // Generate random integers in range 0 to 999 
     int rand_int1 = rand.nextInt(1000); 
     //int rand_int2 = rand.nextInt(1000);
     
	 System.out.println("Inside the screen page");
	
	TakesScreenshot scrShot =((TakesScreenshot)driver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File("C:\\Users\\irudhyakingston.r\\git\\appCONNECT_automation\\automation1\\Screens\\"+default_text+rand_int1+".png");

            //Copy file at destination

           FileUtils.copyFile(SrcFile, DestFile);

}
}
