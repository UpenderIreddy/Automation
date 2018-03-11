

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mouseOverAction {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	@Test
	public void MouseOver(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Upender\\browserdrivers\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		
		//Mouse over code starts from here
		
	WebElement ele =	driver.findElement(By.xpath("//a[@title='Search Jobs']"));
	
	//To perform Mouse over actions, we need to create an object for Actions class
		
		Actions act = new Actions(driver);
		
		//moveToElement is used for Mouseoveractions
		
		act.moveToElement(ele).perform();
	
//displays all the anchor tag links
    List<WebElement> links=	driver.findElements(By.xpath("//div[@class='subMenu c2']//a"));
    
    //finding the size , here size() is coming from collection
     int total_count = links.size(); 
     
     for(int i=0;i<total_count;i++){
    	 
    WebElement element=	 links.get(i);
    
    String text =element.getAttribute("innerHTML");
    
    System.out.println("Links is " + text );
    
    
    
    if(text.equalsIgnoreCase("")){
    	
    	element.click();
    	
    	//Assert.assertTrue(element.isSelected());
    	
    	System.out.println(driver.getTitle());
    }
    
    
    
    
     }


		
		
		
		
		
		
		
	}

}
