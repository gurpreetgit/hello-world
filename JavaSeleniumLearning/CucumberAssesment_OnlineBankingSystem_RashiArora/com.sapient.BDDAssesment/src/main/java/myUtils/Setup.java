package myUtils;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setup {
	public static WebDriver driver;


	  
	  public static String getConfigData(String property) throws IOException{
		  Properties prop = new Properties();
			FileReader file = new FileReader(System.getProperty("user.dir")+"\\Config.properties");
			System.out.println(System.getProperty("user.dir"));
			prop.load(file);
			String value= prop.getProperty(property);
			System.out.println(value);
			return value;
		  
	  }
	  
	  public static boolean explicitWait(WebDriver driver, WebElement element){
			boolean status =true;
			try {
				WebDriverWait wait = new WebDriverWait(driver, 1000);
				wait.until(ExpectedConditions.visibilityOf(element));
//				wait.until(ExpectedConditions.elementToBeClickable(element));
				
			} catch (Exception e) {
				status=false;
				System.out.println("Unable to wait for element"+element);
			}

			return status;
	}
	  
	  public static void initializeDriver(String browsername) throws IOException{

			String url= Setup.getConfigData("URL");
			System.out.println(url);
			if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Workspaces\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize(); //maximise the window
			}
			else if(browsername.equalsIgnoreCase("ff")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\rasarora0\\Qurate Training\\SeleniumTraining\\Libraries\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			
			}
	  }
			
	  public static void closeDriver() {
				driver.close();
			}
	  
	  public static boolean dateVerification(String actualDate, String DateFormatPattern){
		  	Boolean status;
			System.out.println(actualDate);
			System.out.println(DateFormatPattern);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DateFormatPattern);
			LocalDateTime now= LocalDateTime.now();
			String expectedDate=dtf.format(now);
			System.out.println(expectedDate);
			if(expectedDate.equals(actualDate)){
				System.out.println("Date Verification- PASS");
				status=true;
			}else{
				System.out.println("Date Verification- FAIL");
				status = false;
			}
			return status;
	  }


}
