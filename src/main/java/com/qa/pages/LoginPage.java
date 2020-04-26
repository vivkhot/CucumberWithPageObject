package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import com.qa.base.TestBase;



public class LoginPage extends TestBase {
	
	//PageFactory
	

	@FindBy(name ="email")
	WebElement TxtUsername;
	
	@FindBy(name ="password")
	WebElement TxtPassword;
	
	
	@FindBy(xpath ="//div[contains(@class,'submit')]")
	WebElement BtnSubmit;
	
	// WebElement Initiator
	public LoginPage() {
		PageFactory.initElements(webdriver, this);
	}
	
	
	//PageActions
	
	
	public String GetTitle()
	{
		return webdriver.getTitle();
		
		
	}
	
	public void EnterLoginDetails(String username, String password) {
		wait.until(ExpectedConditions.visibilityOf(TxtUsername));
		TxtUsername.sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(TxtPassword));
		TxtPassword.sendKeys(password);

	}
	
	public HomePage PerformLogin() {
			
		BtnSubmit.click();		
		return new HomePage();
	}
	
	
	
}
