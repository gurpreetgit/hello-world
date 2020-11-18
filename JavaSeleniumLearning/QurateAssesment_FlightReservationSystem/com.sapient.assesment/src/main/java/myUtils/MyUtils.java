// Test Project 
package myUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyUtils {
	public static WebDriver driver;
	
	//Method to get data from excel
	public static String getDatafromExcel(String fileName,String property) throws IOException{
		  File myFile= new File(System.getProperty("user.dir")+"\\"+fileName+".xls");
			FileInputStream fis = new FileInputStream(myFile);
			HSSFWorkbook myWorkbook = new HSSFWorkbook(fis);
			Sheet mySheet = myWorkbook.getSheet("Sheet1");
			String value="";
			int rowCount=mySheet.getLastRowNum()-mySheet.getFirstRowNum();
			for(int i=mySheet.getFirstRowNum();i<rowCount+1;i++){
				Row myRow= mySheet.getRow(i);
				if(myRow.getCell(0).getStringCellValue().equals(property)){
					value= myRow.getCell(1).getStringCellValue();
					
				}
			}
			  
			return value;
		  
	  }
	  
	//Method to get data from configuration file
	  public static String getConfigData(String property) throws IOException{
		  Properties prop = new Properties();
			FileReader file = new FileReader(System.getProperty("user.dir")+"\\Config.properties");
			System.out.println(System.getProperty("user.dir"));
			prop.load(file);
			String value= prop.getProperty(property);
			System.out.println(value);
			return value;
		  
	  }
	  
	  //Method to explicitly wait for a web element
	  public static boolean explicitWait(WebDriver driver, WebElement element){
			boolean status =true;
			try {
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.visibilityOf(element));
//				wait.until(ExpectedConditions.elementToBeClickable(element));
				
			} catch (Exception e) {
				status=false;
				System.out.println("Unable to wait for element"+element);
			}

			return status;
	}
	  
	  //Method to initialize the driver
	  public static void initializeDriver(String browsername) throws IOException{
			String url= MyUtils.getConfigData("URL");
			System.out.println(url);
			if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Workspaces\\QurateAssesment_FlightReservationSystem_RashiArora\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize(); //maximise the window
			}
			else if(browsername.equalsIgnoreCase("ff")){
			
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\rasarora0\\Qurate Training\\SeleniumTraining\\Libraries\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Workspaces\\QurateAssesment_FlightReservationSystem_RashiArora\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver = new FirefoxDriver();
			driver.get(url);
			
			}
	  }
	
	  //Method to close the driver
	  public static void closeDriver() {
				driver.close();
			}
	  
	  //Method to verify the current date
	  public static String dateVerification(String actualDate, String DateFormatPattern){
		  	String status= null;
			System.out.println("Actual Date is: "+actualDate);
			System.out.println(DateFormatPattern);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DateFormatPattern);
			LocalDateTime now= LocalDateTime.now();
			String expectedDate=dtf.format(now);
			System.out.println("Expected Date is: "+expectedDate);
			if(expectedDate.equals(actualDate)){
				System.out.println("Date Verification- PASS");
				status="True";
			}else{
				System.out.println("Date Verification- FAIL");
				status ="False";
			}
			return status;
	  }
	  
	  //Method to check whether array is sorted or not
	  public static int checkSorting(int arr[], int length){
		  if(length == 1 || length ==0){
			  return 1;
		  }
		  if(arr[length-1]<arr[length-2]){
			  return 0;
			  
		  }
		  return checkSorting(arr,length-1);
	  }

}
