import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class handlingMultipleWindows {
	
	@Test
	public void windowHandle() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Upender\\browserdrivers\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		
		String parentwindow = driver.getWindowHandle();
		
		System.out.println("The parent window id is " + parentwindow);
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		System.out.println("The child window id is " + allwindows);
		
		allwindows.size();
		
		for(String child:allwindows){
			
			if(!parentwindow.equalsIgnoreCase(child)){
				
				driver.switchTo().window(child);
				//driver.findElement(By.name("q")).sendKeys("selenium driver");
				//Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		String title =driver.getTitle();
		System.out.println(title);
		
		
		
	}
	
	
}

		
		

