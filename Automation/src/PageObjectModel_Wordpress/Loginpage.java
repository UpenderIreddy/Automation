package PageObjectModel_Wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Step1: Find the all the locators present in the webpage
//Step2: add a constructor to initialize the webdriver that user does pass
//Step3: Methods to perform actions for the particular web page


public class Loginpage {
	
 WebDriver driver;
 
  By username = By.id("user_login");
 
  By password = By.xpath(".//*[@id='user_pass']");
  
  By loginbutton = By.xpath(".//*[@id='wp-submit']");
  
  
  public Loginpage(WebDriver driver){
	  
	  this.driver= driver;
	
  }
  
  public void typeUsername(){
	  
	  driver.findElement(username).sendKeys("upender1990");
	  
  }
 
  public void typePassword(){
	  
	  driver.findElement(password).sendKeys("Upenderreddy1990");
  }
  
  public void clickLoginButton(){
	  
	  driver.findElement(loginbutton).click();
  }
 
 /*public void loginToWordpress(String Username, String Password){
	  
	  driver.findElement(username).sendKeys(Username);
	  
	  driver.findElement(password).sendKeys(Password);
	  
	  driver.findElement(loginbutton).click();
 }*/
  
 
 
 
 
}

