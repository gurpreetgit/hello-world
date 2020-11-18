package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookFlightPageObjects {
	WebDriver driver;
	
	//Class Constructor
	public BookFlightPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	//Passenger First Name
	@FindBy(how=How.NAME,using="passFirst0")
	public WebElement objPassengerFName;
	
	//Passenger Last Name
	@FindBy(how=How.NAME,using="passLast0")
	public WebElement objPassengerLName;
	
	//Departure Flight
	@FindBy(how=How.XPATH,using="(//td[@class='data_left'])[1]")
	public WebElement objDepartFlight;
	
	//Arrival Flight
	@FindBy(how=How.XPATH,using="(//td[@class='data_left'])[4]")
	public WebElement objArrivalFlight;


}
