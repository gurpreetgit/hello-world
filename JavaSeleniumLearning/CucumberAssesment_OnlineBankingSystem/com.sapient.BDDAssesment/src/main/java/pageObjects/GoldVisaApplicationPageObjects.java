package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoldVisaApplicationPageObjects {
	WebDriver driver;
	
	public GoldVisaApplicationPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Password
	@FindBy(how=How.NAME,using="passwd")
	public WebElement objPasswordForGoldVisa;
	
	//Submit Button
	@FindBy(how=How.NAME,using="Submit")
	public WebElement objsubmitBtnForGoldVisa;
	
	
	//Successful Message
	@FindBy(how=How.XPATH,using="//span[@id='_ctl0__ctl0_Content_Main_lblMessage']")
	public WebElement objsuccessfulMsgForGoldVisa;

}
