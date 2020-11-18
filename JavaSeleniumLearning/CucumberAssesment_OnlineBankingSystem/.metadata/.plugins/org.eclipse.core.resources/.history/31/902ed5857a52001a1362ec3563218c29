package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;

import myUtils.MyUtils;
import pageObjects.BookFlightPageObjects;

public class BookFlightPageTestCases extends MyUtils{
	
	public void verifyFlightNumber(String expectedDepartFlight, String expectedReturnFlight) throws IOException, InterruptedException{
		BookFlightPageObjects obj= new BookFlightPageObjects(driver);
		String actualDepartFlight= obj.objDepartFlight.getText();
		String actualReturnFlight = obj.objArrivalFlight.getText();
		
//		ArrayList<String> arr ;
//		SelectFlightPageTestCases obj1 = new SelectFlightPageTestCases();
//		arr=obj1.selectFlight();
//		System.out.println(arr.get(0));
//		String expectedDepartFlight= arr.get(0);
//		System.out.println(arr.get(1));
//		String expectedReturnFlight = arr.get(1);
		
		if(actualDepartFlight.equals(expectedDepartFlight)){
			Assert.assertTrue(true,"Depart Flight Validation Successful");
			System.out.println("Depart Flight Validation Successful");
		}else{
			Assert.assertFalse(false,"Depart Flight Validation UnSuccessful");
		}
		
		if(actualReturnFlight.equals(expectedReturnFlight)){
			Assert.assertTrue(true,"Return Flight Validation Successful");
		}else{
			Assert.assertFalse(false,"Return Flight Validation UnSuccessful");
		}
		
	}

}
