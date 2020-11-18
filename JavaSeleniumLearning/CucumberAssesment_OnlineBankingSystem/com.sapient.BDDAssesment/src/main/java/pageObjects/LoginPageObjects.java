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
	@FindBy(how=How.ID,using="uid")
	public WebElement userName;
	
	//Password
	@FindBy(how=How.ID,using="passw")
	public WebElement password;
	
	//Login Button
	@FindBy(how=How.NAME,using="btnSubmit")
	public WebElement btnLogin;
	
	//Sign Out Link
	@FindBy(how=How.ID,using="LoginLink")
	public WebElement signOutLink;

}
