package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTest {

	
	static WebDriver driver ;
	
	public void crossBrowserTest(WebDriver driver){
		
		this.driver = driver;
	}
	
	@Parameters("browser")
	@Test
	public static WebDriver verify_Page_Title(String browserName) throws InterruptedException{
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Upender\\browserdrivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Upender\\browserdrivers\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver","C:\\Upender\\browserdrivers\\IEdriver\\IEDriverServer.exe");
				
				driver = new InternetExplorerDriver();
				Thread.sleep(10000);
			
		}
		
		
		driver.manage().window().maximize();
		driver.get("https://login.wordpress.org/wp-login.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println(driver.getTitle());
		return driver;
		
		
	}
}
