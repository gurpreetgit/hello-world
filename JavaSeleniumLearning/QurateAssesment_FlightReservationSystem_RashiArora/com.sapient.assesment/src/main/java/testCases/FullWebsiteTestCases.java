package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import myUtils.MyUtils;

public class FullWebsiteTestCases extends MyUtils {
	@BeforeTest(alwaysRun=true)
	@Parameters("browsername")
	public void driverInitialization(String browsername) throws IOException{
		initializeDriver(browsername);
	}
	 
	//Verify Current Date
	@Test(groups={"regression"},priority=1)
	public void testLogin_TC1() throws IOException, InterruptedException{
		LoginPageTestCases objTC1 = new LoginPageTestCases();
		objTC1.verifyCurrentDate();
	}
	
	//Verify Aruba Image
	@Test(groups={"regression"},priority=2)
	public void testLogin_TC2() throws IOException, InterruptedException{
		LoginPageTestCases objTC2 = new LoginPageTestCases();
		objTC2.verifyArubaImage();
		}
	
	//Verify Aruba Image
	@Test(groups={"regression"},priority=3)
	public void testLogin_TC3() throws IOException, InterruptedException{
		LoginPageTestCases objTC3 = new LoginPageTestCases();
		objTC3.login();
			}
	
	//Search operation
	@Test(groups={"regression"},priority=4)
	public void test_TC4() throws IOException, InterruptedException{
//		Login
		LoginPageTestCases objLoginTC4 = new LoginPageTestCases();
		objLoginTC4.login();
		Thread.sleep(3000);
		
//		Perform Search Operation
		SearchFlightPageTestCases objTC4 = new SearchFlightPageTestCases();
		objTC4.searchFlight();
		
				}
	
//	Select Flight
	@Test(groups={"regression"},priority=5)
	public void test_TC5() throws InterruptedException, IOException{
//		Login
		LoginPageTestCases objLoginTC4 = new LoginPageTestCases();
		objLoginTC4.login();
		Thread.sleep(3000);
		
//		Perform Search Operation
		SearchFlightPageTestCases objTC4 = new SearchFlightPageTestCases();
		objTC4.searchFlight();
		
//		Perform Select Operation
		SelectFlightPageTestCases obj = new SelectFlightPageTestCases();
		obj.selectFlight();
		
	}
	
//	Validate Flight Number on Book Flight Page
	@Test(groups={"regression"},priority=6)
	public void test_TC6() throws InterruptedException, IOException{
//		Login
		LoginPageTestCases objLoginTC4 = new LoginPageTestCases();
		objLoginTC4.login();
		Thread.sleep(3000);
		
//		Perform Search Operation
		SearchFlightPageTestCases objTC4 = new SearchFlightPageTestCases();
		objTC4.searchFlight();
		
//		Perform Select Operation
		SelectFlightPageTestCases obj = new SelectFlightPageTestCases();
		ArrayList<String> arr ;
		SelectFlightPageTestCases obj1 = new SelectFlightPageTestCases();
		arr=obj1.selectFlight();
		System.out.println(arr.get(0));
		String expectedDepartFlight= arr.get(0);
		System.out.println(arr.get(1));
		String expectedReturnFlight = arr.get(1);
	
		
//		Perform Validation Of Flight Number
		BookFlightPageTestCases objBook = new BookFlightPageTestCases();
		objBook.verifyFlightNumber(expectedDepartFlight, expectedReturnFlight);
	}
	
	@AfterTest(alwaysRun=true)
	public void closingDriver(){
		closeDriver();
	}

}
