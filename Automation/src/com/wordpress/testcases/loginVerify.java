package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.crossBrowserTest;
import PageObjectModel_Wordpress.loginPageNew;

@Test
public class loginVerify {

	
	public void checklogin() throws Exception{
		
	
	//crossBrowserTest cat = new crossBrowserTest();
	WebDriver driver = crossBrowserTest.verify_Page_Title("FireFox");
	
	loginPageNew loginpage= PageFactory.initElements(driver, loginPageNew.class);
	
	//loginPageNew logonpage = new loginPageNew();
	
	loginpage.loginToWordpressApp("upender1990" , "Upenderreddy1990");
	
	
	
	
	
	}
	
}