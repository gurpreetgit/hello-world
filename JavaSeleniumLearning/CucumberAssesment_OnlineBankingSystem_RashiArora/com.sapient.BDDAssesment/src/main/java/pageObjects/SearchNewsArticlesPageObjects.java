package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchNewsArticlesPageObjects {
WebDriver driver;
	
	public SearchNewsArticlesPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Search News Text Field
	@FindBy(how=How.NAME,using="query")
	public WebElement objSearchNewsTextField;
	
	//Query Button
	@FindBy(how=How.ID,using="Button1")
	public WebElement objQueryButton;
	
	//Searched News Article
	@FindBy(how=How.ID,using="Label2")
	public WebElement objSearchedNewsArticleResult;
		

}
