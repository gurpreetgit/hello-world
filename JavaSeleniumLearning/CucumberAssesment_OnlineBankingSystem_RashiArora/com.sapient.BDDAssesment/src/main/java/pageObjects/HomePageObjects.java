package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
WebDriver driver;
	
	public HomePageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Name
	@FindBy(how=How.XPATH,using="//h1")
	public WebElement objName;
		
	//Account
	@FindBy(how=How.ID,using="listAccounts")
	public WebElement objAccount;	
	
	//Button Go
	@FindBy(how=How.ID,using="btnGetAccount")
	public WebElement objBtnGo;

	//Gold Visa Link
	@FindBy(how=How.LINK_TEXT,using="Here")
	public WebElement objGoldVisaLink;
	
	//View Account Summary Link
	@FindBy(how=How.ID,using="MenuHyperLink1")
	public WebElement objViewAccountSummaryLink;
	
	//View Recent Transactions Link
	@FindBy(how=How.ID,using="MenuHyperLink2")
	public WebElement objViewRecentTransactionsLink;
	
	//Transfer Funds Link
	@FindBy(how=How.ID,using="MenuHyperLink3")
	public WebElement objTransferFundsLink;
	
	//Search News Articles Link
	@FindBy(how=How.ID,using="MenuHyperLink4")
	public WebElement objSearchNewsArticlesLink;
	
	//Customize Site Language Link
	@FindBy(how=How.ID,using="MenuHyperLink5")
	public WebElement objCustomizeSiteLangaugeLink;
	
	
	

}
