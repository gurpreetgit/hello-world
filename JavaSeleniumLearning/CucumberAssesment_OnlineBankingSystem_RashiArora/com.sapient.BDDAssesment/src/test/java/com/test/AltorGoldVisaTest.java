package com.test;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import beanClass.MyBean;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myUtils.Setup;
import pageObjects.GoldVisaApplicationPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;

public class AltorGoldVisaTest extends Setup {
	private String password;
	@Before
	public void driverInitialization() throws IOException{
		initializeDriver("chrome");
		
	}
	
	@Given("^User should be on Login Page$")
	public void user_should_be_on_Login_Page() throws Throwable {
		String currentUrl= driver.getCurrentUrl();
		System.out.println("Current URL : " +currentUrl);
		String expectedUrl= getConfigData("URL");
		System.out.println(expectedUrl);
		System.out.println(currentUrl.toString());
//		if(currentUrl.toString().equals("http://demo.testfire.net/bank/login.aspx")){
			Assert.assertTrue("User id on Login Page",currentUrl.toString().equals(expectedUrl));
//		}else{
//			Assert.fail();
//		}
	}

	@When("^User should enter username and password and click on Login buton$")
	public void user_should_enter_username_and_password_and_click_on_Login_buton(List<MyBean> cred) throws Throwable {
		LoginPageObjects obj1= new LoginPageObjects(driver);
		for(MyBean c: cred){
			password= c.getPassword();
			System.out.println(c.getUsername());
			System.out.println(c.getPassword());
			obj1.userName.sendKeys(c.getUsername());
			obj1.password.sendKeys(c.getPassword());
			obj1.btnLogin.click();
			Thread.sleep(30);
		}
	}

	@Then("^User should be navigated to the main account page and Hello Name of the user is displayed there$")
	public void user_should_be_navigated_to_the_main_account_page_and_Hello_Name_of_the_user_is_displayed_there(List<MyBean> cred) throws Throwable {
		HomePageObjects obj = new HomePageObjects(driver);
		System.out.println("Driver get Title : "+driver.getTitle() );
		if ((driver.getTitle()).contains("Altoro")){   //Mutual: Online Banking Home
			for(MyBean c: cred){
		    	String actualName= obj.objName.getText();
				System.out.println(actualName);
				if(actualName.contains(c.getNameOnHomePage())){
					Assert.assertTrue("Login Successful and Name Validated",true); 
					explicitWait(driver, driver.findElement(By.id("btnGetAccount")));
					System.out.println("Login Successful and Name Validated"); 
					}
				else{
					Assert.assertFalse("Login Successful and Name Error",true);
					explicitWait(driver, driver.findElement(By.id("btnGetAccount")));
					System.out.println("Login Successful and Name Error"); } 
			}
		}
		else{
			Assert.assertFalse("Login Unsuccessful",true);
			System.out.println("Login Unsuccessful"); }
	}
	
	@When("^User clicks on the visa application link$")
	public void user_clicks_on_the_visa_application_link() throws Throwable {
		HomePageObjects obj = new HomePageObjects(driver);
		obj.objGoldVisaLink.click();
		explicitWait(driver, driver.findElement(By.name("Submit")));
		Thread.sleep(30);
	}

	@When("^User enters the password and clicks on the submit button$")
	public void user_enters_the_password_and_clicks_on_the_submit_button() throws Throwable {
	    GoldVisaApplicationPageObjects obj = new GoldVisaApplicationPageObjects(driver);
	    System.out.println("Title of Gold application Page :"+ driver.getTitle() );
	    if ((driver.getTitle()).contains("Altoro Mutual")){
	    	obj.objPasswordForGoldVisa.sendKeys(password);
	    	obj.objsubmitBtnForGoldVisa.click();
	    	Thread.sleep(30);
	    	explicitWait(driver, driver.findElement(By.xpath("//span[@id='_ctl0__ctl0_Content_Main_lblMessage']")));
	    	System.out.println("User is on Credit card Application Page Successfully");
	    }else{
	    	System.out.println("User is not on Credit card Application Page when he is intended to");
	    }
	}

	@Then("^User should be able to successfully apply for the visa$")
	public void user_should_be_able_to_successfully_apply_for_the_visa(List<MyBean> msg ) throws Throwable {
		 GoldVisaApplicationPageObjects obj = new GoldVisaApplicationPageObjects(driver);
		 for(MyBean m: msg){
			 String actualMsg= obj.objsuccessfulMsgForGoldVisa.getText();
			 System.out.println(actualMsg);
			 if(actualMsg.contains(m.getSuccessfulVisaApplicationMsg())){
			 Assert.assertTrue("Succesful Visa Application",true);
			 System.out.println("Successful Visa Application Message Validated");
			 }else{
				Assert.assertFalse("Unsuccessful Visa Application",true);
				System.out.println("Unsuccessful Visa Application");  
			 }
			 
		 }
	}



	@After
	public void closingDriver(){
		closeDriver();
	}


}
