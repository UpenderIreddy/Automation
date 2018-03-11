import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class handleBootStrapDropdown {
	
	WebDriver driver;
	
	@Test
	public void handleBootstarp(){
		System.setProperty("webdriver.gecko.driver", "C:\\Upender\\browserdrivers\\geckodriver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	//boolean dropdown =	driver.findElement(By.xpath("//ul[@calss='dropdown-menu']")).isEnabled();
	
	//Assert.assertTrue(dropdown);
	
	System.out.println("**** The dropdown is enabled ****");
	
	
	List<WebElement> links= driver.findElements(By.xpath("//div[@class='dropdown open']"));
	
    int totalcount = links.size();
       for(int i=0;i<totalcount;i++){
    	
    	WebElement ele = links.get(i);
    	
    	String text = ele.getAttribute("innerHTML");
    	
    	System.out.println("The text is " + text);
    	
    	if(text.equalsIgnoreCase("javascript")){
    		
    		ele.click();
    		
    		
    	}
    	
    	
    }
    
    
	
	
	
	
	
		
		
		
		
		
		
	}

}
