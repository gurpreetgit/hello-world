package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	WebDriver driver;
	
	//Class Constructor
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Username 
	@FindBy(how=How.NAME,using="userName")
	public WebElement objUserName;
	
	//Password
	@FindBy(how=How.NAME,using="password")
	public WebElement objPassword;
	
	//Sign-In Button
	@FindBy(how=How.NAME,using="login")
	public WebElement objSignInBtn;
	
	//Aruba Image
	@FindBy(how=How.XPATH,using="//p//img[contains(@alt,'Featured Destination: Aruba')]")
	public WebElement objArubaImage;

	//Date
	@FindBy(how=How.XPATH,using="(//input[@name='action']//following-sibling::table//child::b)[1]")
	public WebElement objDateElement;


}
