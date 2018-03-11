import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingFrames {
	
	
	@Test
	public void SwitchingToFrame() throws InterruptedException{
		
System.setProperty("webdriver.gecko.driver", "C:\\Upender\\browserdrivers\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		int total_frames = driver.findElements(By.tagName("frame")).size();
		
		System.out.println("The total frames in the application are " + total_frames);
		
		
		
		//WebElement my_frame = driver.findElement(By.xpath("//frame[@name='fldLoginUserId']"));
		driver.switchTo().frame(driver.findElement(By.xpath("//input[@name='fldLoginUserId']")));
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("Upender");
		Thread.sleep(10000);
		
		
	
	}
	

}
