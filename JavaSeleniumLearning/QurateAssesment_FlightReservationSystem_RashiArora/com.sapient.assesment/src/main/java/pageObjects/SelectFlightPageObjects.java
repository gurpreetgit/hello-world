package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlightPageObjects {
	WebDriver driver;
	
	//Class Constructor
	public SelectFlightPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	//Depart
	public WebElement getDepart(WebDriver driver,String depart){
		WebElement elementDepart;
		if(depart.equals("Blue Skies Airlines 360")){
			elementDepart= driver.findElement(By.xpath("//td[@class='data_left'])[1]")); }
		else if(depart.equals("Blue Skies Airlines 361")){
			elementDepart= driver.findElement(By.xpath("//td[@class='data_left'])[2]"));
			}
		else if(depart.equals("Blue Skies Airlines 362")){
			elementDepart= driver.findElement(By.xpath("//td[@class='data_left'])[3]"));
			}
		else {
			elementDepart= driver.findElement(By.xpath("//td[@class='data_left'])[4]"));
			}
				
		return  elementDepart;
		}
	
	//Return
	public WebElement getArrival(WebDriver driver,String arrival){
		WebElement elementArrival;
		if(arrival.equals("Blue Skies Airlines 630")){
			elementArrival= driver.findElement(By.xpath("//td[@class='data_left'])[5]")); }
		else if(arrival.equals("Blue Skies Airlines 631")){
			elementArrival= driver.findElement(By.xpath("//td[@class='data_left'])[6]"));
				}
		else if(arrival.equals("Blue Skies Airlines 632")){
			elementArrival= driver.findElement(By.xpath("//td[@class='data_left'])[7]"));
				}
		else {
			elementArrival= driver.findElement(By.xpath("//td[@class='data_left'])[8]"));
				}
					
		return  elementArrival;
		}
	
	//Continue Button
	public WebElement getContinueButton(WebDriver driver){
		WebElement continuebtn= driver.findElement(By.name("findFlights"));
		return continuebtn;
	}

}
