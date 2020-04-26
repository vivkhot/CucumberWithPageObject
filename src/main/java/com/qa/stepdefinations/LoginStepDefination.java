package com.qa.stepdefinations;



import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefination extends TestBase {
	
	LoginPage objLogin;
	HomePage objHome;
	
	public  LoginStepDefination() {
		super();		
	}
	
	
	
	@Given("^User is on CRM landing page$")
	public void user_is_on_CRM_landing_page() throws Throwable {	 
		TestBase.initialize();
		objLogin = new LoginPage();
		Assert.assertEquals("Cogmento CRM", objLogin.GetTitle());
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		
		objLogin.EnterLoginDetails("vivekkhot1308@gmail.com", "P@ssword123");
			   
	}

	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	   
		objHome = objLogin.PerformLogin();		
		
	}

	@Then("^user login to the CRM application$")
	public void user_login_to_the_CRM_application() throws Throwable {
	   
		webdriver.quit();
	}

}
