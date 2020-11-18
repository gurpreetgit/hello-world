package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myUtils.Setup;
import pageObjects.LoginPageObjects;

public class LogOutTest extends Setup{
	
	@When("^User clicks on sign-out link$")
	public void user_clicks_on_sign_out_link() throws Throwable {
	    LoginPageObjects obj = new LoginPageObjects(driver);
	    obj.signOutLink.click();
	    
	}

	@Then("^User should be logged out$")
	public void user_should_be_logged_out() throws Throwable {
		if(driver.findElement(By.xpath("//img[@src='images/home1.jpg']")).isDisplayed()){
			Assert.assertTrue("Logged Out Successful",true); 
			System.out.println("Logged Out Successful"); 
		}else{
			Assert.assertFalse("Log out Unsuccessful",true);
			System.out.println("Log out Unsuccessful"); 
			}
		
	}

}
