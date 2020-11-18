package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import myUtils.MyUtils;
import pageObjects.LoginPageObjects;

public class LoginPageTestCases extends MyUtils{
	
	public void verifyCurrentDate(){
		LoginPageObjects objDate= new LoginPageObjects(driver);
		String actualDate= objDate.objDateElement.getText();
		System.out.println(actualDate);
		String verificationStatus= dateVerification(actualDate, "MMM dd, YYYY");
		System.out.println(verificationStatus);
		if(verificationStatus.equals("True")){
			Assert.assertTrue(true, "Current Date is diplayed on the top section");
			System.out.println("Current Date is diplayed on the top section"); 
		}else{
			Assert.assertFalse(false,"Current Date is not diplayed on the top section");
			System.out.println("Current Date is not diplayed on the top section");
		}
	}
	
//	@Test(groups={"regression"},priority=2)
	public void verifyArubaImage(){
		LoginPageObjects objImage= new LoginPageObjects(driver);
		if(objImage.objArubaImage.isDisplayed()){
			Assert.assertTrue(true, "Aruba Image is diplayed under featured destination");
			System.out.println("Aruba Image is diplayed under featured destination"); 
		}else{
			Assert.assertFalse(false,"Aruba Image is not diplayed under featured destination");
			System.out.println("Aruba Image is not diplayed under featured destination");
		}
		
	}
	
	public void login() throws IOException{
		LoginPageObjects objLogin = new LoginPageObjects(driver);
		String uname= getConfigData("Username");
		System.out.println("Username is: "+uname);
		String password= getConfigData("Password");
		System.out.println("Password is: "+password);
		objLogin.objUserName.sendKeys(uname);
		objLogin.objPassword.sendKeys(password);
		objLogin.objSignInBtn.click();
		if(driver.getTitle().equals("Find a Flight: Mercury Tours:")){
			System.out.println(driver.getTitle());
			boolean elementStatus = explicitWait(driver, driver.findElement(By.name("tripType")));
			if(elementStatus==true){
				Assert.assertTrue(true, "Login Successful");
				System.out.println("Login Successful"); 
			}else{
				Assert.assertFalse(false,"Test Case failed because of the waiting of the element to be displayed");
				System.out.println("Test Case failed because of the waiting of the element to be displayed");
			}
			
			
		}else if(driver.getTitle().equals("Sign-on: Mercury Tours")){
			System.out.println(driver.getTitle());
			boolean elementStatus= explicitWait(driver, driver.findElement(By.name("login")));
			if(elementStatus==true){
				Assert.assertFalse(false,"Invalid username or password; Login Failed and the verification passed");
				System.out.println("Invalid username or password; Login Failed and the verification passed");
			}else{
				Assert.assertFalse(false,"Invalid username or password; Login Failed and the verifiaction failed");
				System.out.println("Invalid username or password; Login Failed and the verification failed");	 }	
		}
		
	}
	

}
