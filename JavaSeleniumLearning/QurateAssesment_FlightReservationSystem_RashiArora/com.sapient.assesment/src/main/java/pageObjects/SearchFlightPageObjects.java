package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchFlightPageObjects {
	WebDriver driver;
	
	//Class Constructor
	public SearchFlightPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	//Trip Type
	public WebElement getType(WebDriver driver,String tripType){
		WebElement type;
		if(tripType.equals("One Way")){
		type= driver.findElement(By.xpath("//input[@value='oneway']")); }
		else{
			type= driver.findElement(By.xpath("//input[@value='roundtrip']"));
		}
			
		return type;
	}
	
	//From Port
	public Select getFromPort(WebDriver driver){
		Select depart= new Select(driver.findElement(By.name("fromPort")));
		return depart;
	}
	
	//Passenger Count
	public Select getPassengerCount(WebDriver driver){
		Select passenger= new Select(driver.findElement(By.name("passCount")));
		return passenger;
	}
	
	//From Month
	public Select getFromMonth(WebDriver driver){
		Select monthDepart= new Select(driver.findElement(By.name("fromMonth")));
		return monthDepart;
	}
	
	//From Day
	public Select getFromDay(WebDriver driver){
		Select dayDepart= new Select(driver.findElement(By.name("fromDay")));
		return dayDepart;
	}
	
	//To Port
	public Select getToPort(WebDriver driver){
		Select arrive= new Select(driver.findElement(By.name("toPort")));
		return arrive;
	}
	
	public Select getToMonth(WebDriver driver){
		Select monthArrival= new Select(driver.findElement(By.name("toMonth")));
		return monthArrival;
	}
	
	//To Day
	public Select getToDay(WebDriver driver){
		Select dayArrival= new Select(driver.findElement(By.name("toDay")));
		return dayArrival;
	}
	
	//Airline
	public Select getAirline(WebDriver driver){
		Select airline= new Select(driver.findElement(By.name("airline")));
		return airline;
	}
	
	//Service Class
	public WebElement getServiceClass(WebDriver driver,String serviceClass){
		WebElement service;
		if(serviceClass.equals("Economy Class")){
			service= driver.findElement(By.xpath("//input[@value='Coach']")); 
			}
		else if(serviceClass.equals("Business Class")){
			service= driver.findElement(By.xpath("//input[@value='Business']"));
		}
		else{
			service= driver.findElement(By.xpath("//input[@value='First']"));
		}
			
		return service;
	}
	
	//Continue Button
	public WebElement getContinueButton(WebDriver driver){
		WebElement continuebtn= driver.findElement(By.name("findFlights"));
		return continuebtn;
	}
	
	

}
