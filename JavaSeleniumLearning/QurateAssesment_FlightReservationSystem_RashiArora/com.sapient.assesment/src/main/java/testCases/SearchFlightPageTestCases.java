package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import myUtils.MyUtils;
import pageObjects.SearchFlightPageObjects;

public class SearchFlightPageTestCases extends MyUtils {

	public void searchFlight() throws IOException, InterruptedException{
//		Getting data from excel
		String testDataFileName= getConfigData("TestDataFileName");
		System.out.println(testDataFileName);
		String tripType= getDatafromExcel(testDataFileName, "Trip Type");
		String fromPort= getDatafromExcel(testDataFileName, "From Port");
		String passengerCount= getDatafromExcel(testDataFileName, "Passenger Count");
		String fromMonth= getDatafromExcel(testDataFileName, "From Month");
		String fromDay= getDatafromExcel(testDataFileName, "From Day");
		String toPort= getDatafromExcel(testDataFileName, "To Port");
		String toMonth= getDatafromExcel(testDataFileName, "To Month");
		String toDay= getDatafromExcel(testDataFileName, "To Day");
		String airline= getDatafromExcel(testDataFileName, "Airline");
		String serviceClass= getDatafromExcel(testDataFileName, "Service Class");
		
		//Performing Search Flight Operation
		SearchFlightPageObjects obj = new SearchFlightPageObjects(driver);
		obj.getPassengerCount(driver).selectByVisibleText(passengerCount);
		Thread.sleep(1000);
		obj.getType(driver, tripType).click();
		Thread.sleep(1000);
		obj.getFromPort(driver).selectByVisibleText(fromPort);
		Thread.sleep(1000);
		obj.getFromMonth(driver).selectByVisibleText(fromMonth);
		Thread.sleep(1000);
		obj.getFromDay(driver).selectByVisibleText(fromDay);
		Thread.sleep(1000);
		obj.getToPort(driver).selectByVisibleText(toPort);
		Thread.sleep(1000);
		obj.getToMonth(driver).selectByVisibleText(toMonth);
		Thread.sleep(1000);
		obj.getToDay(driver).selectByVisibleText(toDay);
		Thread.sleep(1000);
		obj.getServiceClass(driver, serviceClass).click();
		Thread.sleep(1000);
		obj.getAirline(driver).selectByValue(airline);;
		Thread.sleep(1000);
		obj.getContinueButton(driver).click();
		
		if(driver.getTitle().equals("Select a Flight: Mercury Tours")){
			System.out.println(driver.getTitle());
			boolean elementStatus = explicitWait(driver, driver.findElement(By.name("outFlight")));
			if(elementStatus==true){
				Assert.assertTrue(true, "Flight Search Successful");
				System.out.println("Login Successful"); 
			}else{
				Assert.assertFalse(false,"Test Case failed because of the waiting of the element to be displayed");
				System.out.println("Test Case failed because of the waiting of the element to be displayed");
			}
		}else{
			Assert.assertFalse(false,"Flight Search Unsuccessful");
			System.out.println("Flight Search Unsuccessful");
		}
		
	}

}
