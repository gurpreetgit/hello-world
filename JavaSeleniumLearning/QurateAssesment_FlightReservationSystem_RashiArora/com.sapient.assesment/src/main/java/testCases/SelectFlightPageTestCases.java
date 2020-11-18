package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import myUtils.MyUtils;
import pageObjects.SelectFlightPageObjects;

public class SelectFlightPageTestCases extends MyUtils {
	
	public ArrayList<String> selectFlight() throws IOException, InterruptedException{
//		Getting data From Excel
		String testDataFileName= getConfigData("TestDataFileName");
		System.out.println(testDataFileName);
		String departFlight= getDatafromExcel(testDataFileName, "Depart Flight");
		String returnFlight= getDatafromExcel(testDataFileName, "Return Flight");
		
//		Selecting Flight 
		SelectFlightPageObjects obj = new SelectFlightPageObjects(driver);
		obj.getDepart(driver, departFlight);
		Thread.sleep(1000);
		obj.getArrival(driver,returnFlight);
		Thread.sleep(1000);
		WebElement btn= obj.getContinueButton(driver);
		btn.click();
		explicitWait(driver, driver.findElement(By.name("passFirst0")));
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(departFlight);
		arr.add(returnFlight);
		
		return arr;
	}
	
	public void verifyOrderOfFlights(){
		SelectFlightPageObjects obj = new SelectFlightPageObjects(driver);
		WebElement btn= obj.getContinueButton(driver);
		btn.click();
		explicitWait(driver, driver.findElement(By.name("passFirst0")));
		
		
	}
	
	

}
