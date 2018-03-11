package PageObjectModel_Wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPageNew {
	
	WebDriver driver;
	
	//Using @FindBy
	
	@FindBy(id="user_login") WebElement Username;
	
	@FindBy(id ="user_pass") WebElement Password;
	
	@FindBy(id="wp-submit") WebElement clickLoginButton;
	
	
	//Using How
	
	//@FindBy(how = How.ID,using="user_login") WebElement Username1;
	
//	@FindBy(how = How.XPATH,using = "//input[@id='user_pass'") WebElement Password1;
	
	//@FindBy(how=How.ID,using = "wp-submit") WebElement clickLoginButton1;
	



public void loginpageNew( WebDriver driver){
	
	this.driver = driver;
	
	
}


public  void loginToWordpressApp(String Uid, String Pwd){
	
	Username.sendKeys(Uid);
	Password.sendKeys(Pwd);
	clickLoginButton.click();
	
}


}