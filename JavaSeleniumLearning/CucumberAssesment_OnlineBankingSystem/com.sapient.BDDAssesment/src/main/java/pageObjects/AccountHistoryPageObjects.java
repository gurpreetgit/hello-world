package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccountHistoryPageObjects {
WebDriver driver;
	
	public AccountHistoryPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	//Account Number
	@FindBy(how=How.XPATH,using="//span[@id='_ctl0__ctl0_Content_Main_accountid']")
	public WebElement objAccountNumber;	

}
