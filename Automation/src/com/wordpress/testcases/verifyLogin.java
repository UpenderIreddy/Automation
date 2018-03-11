/**
 * 
 */
package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModel_Wordpress.Loginpage;

/**
 * @author lenovo
 *
 */
public class verifyLogin {
	
@Test
public void loginWordpress(){
		
	System.setProperty("webdriver.gecko.driver", "C:\\Upender\\browserdrivers\\geckodriver\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://login.wordpress.org/wp-login.php");
	
	Loginpage lgn = new Loginpage(driver);
	
	lgn.typeUsername();
	lgn.typePassword();
	lgn.clickLoginButton();
	
	
	
	
	
	
}

}
