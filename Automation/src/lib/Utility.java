package lib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver , String ScreenshotName){
		
	try{
		
		/*TakesScreenshot is an interface, so we cannot create an object to the interface, so we have done typecasting using driver.
	     so here the object we get after type casting is the object of TakesScreenshot object*/
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source =	ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File ("G:/Selenium and Java Notes/Automation Screenshots/"+ ScreenshotName +".png"));
	System.out.println("Screenshot Taken");
	
	}
	
	catch (Exception e){
		
		System.out.println("The error while taking the screenshot is " + e.getMessage());
	}
	
		
	}

}
