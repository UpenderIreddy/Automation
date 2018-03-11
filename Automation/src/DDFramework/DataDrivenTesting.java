package DDFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelConfigData;

public class DataDrivenTesting {
	
	WebDriver driver;

	@Test(dataProvider="Wordpressdata")
	public void wordPressLogin(String Username, String Password){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Upender\\browserdrivers\\geckodriver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.wordpress.org/wp-login.php");
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(Username);
		
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("****** Logged into the wordpress application ******");
	
		System.out.println(driver.getTitle());
		
				
	}
	
	@DataProvider(name="Wordpressdata")
	
	public Object[][] passData(){
		
		ExcelConfigData configdata = new ExcelConfigData("C:\\Upender\\workspace\\LearnAutomation\\TestData\\InputData.xlsx");
		
		int rows = configdata.getRowNum(0);
		Object[][] data = new Object[rows][2];
		
		for(int i=0;i<rows;i++){
			
			data[i][0] = configdata.getData(0,i,0);
			data[i][1] = configdata.getData(0,i,1);
			
			
		}
		
		return data;
		
		
		
		
		
		
	}
	
	

}
	