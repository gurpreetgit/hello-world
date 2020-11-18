package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import beanClass.MyBean;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myUtils.Setup;
import pageObjects.AccountHistoryPageObjects;
import pageObjects.HomePageObjects;

public class ViewAccountDetailsTest extends Setup {
	private String AccountNumber;
	
	@When("^User Selects the account and clicks on Go Button \"([^\"]*)\"$")
	public void user_Selects_the_account_and_clicks_on_Go_Button(String arg1) throws Throwable {
		HomePageObjects obj= new HomePageObjects(driver);
//    	String accountNumber= arg1;
    	AccountNumber= arg1.substring(0, 10);
    	System.out.println(arg1);
    	System.out.println(AccountNumber);
    	
    	Select select= new Select(obj.objAccount);
		select.selectByVisibleText(arg1); 
		obj.objBtnGo.click();
	}

	@Then("^User should be navigated to Account History Page$")
	public void user_should_be_navigated_to_Account_History_Page() throws Throwable {
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.equals("Altoro Mutual: Account Information")){
			Assert.assertTrue("Navigation Validated",true); 
			explicitWait(driver, driver.findElement(By.id("btnGetAccount")));
			System.out.println("Navigation Validated");
			
		}else{
			Assert.assertFalse("Navigation Error",true);
			System.out.println("Navigation Error");
		}
		Thread.sleep(1000);
	}

	@And("^Correct Account Number should be displayed on Account History Page$")
	public void correct_Account_Number_should_be_displayed_on_Account_History_Page() throws Throwable {
		AccountHistoryPageObjects obj= new AccountHistoryPageObjects(driver);
		String actualAccountNumber = obj.objAccountNumber.getText();
		System.out.println(actualAccountNumber);
		String expectedAccountNumber= AccountNumber;
		if(actualAccountNumber.equals(expectedAccountNumber)){
			Assert.assertTrue("Account Number Validated",true); 
			explicitWait(driver, driver.findElement(By.id("btnGetAccount")));
			System.out.println("Account Number Validated");
		}else{
			Assert.assertFalse("Account Number Error",true);
			System.out.println("Account Number Error");
		}
		Thread.sleep(1000);

	}

}
