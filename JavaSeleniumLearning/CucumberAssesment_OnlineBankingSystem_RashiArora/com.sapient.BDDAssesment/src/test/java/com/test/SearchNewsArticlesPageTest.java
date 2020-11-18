package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.NewSession;

import beanClass.MyBean;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myUtils.Setup;
import pageObjects.HomePageObjects;
import pageObjects.SearchNewsArticlesPageObjects;

public class SearchNewsArticlesPageTest extends Setup {
	
	@Given("^User is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
		if ((driver.getTitle()).contains("Altoro Mutual")){
			Assert.assertTrue("User is on Home Page",true); 
			explicitWait(driver, driver.findElement(By.id("btnGetAccount")));
			System.out.println("User is on Home Page"); }
		else{
			Assert.assertFalse("User is not on Home Page",true);
			System.out.println("User is not on Home Page"); }
	}

	@Then("^Home Page I want to Options should be displayed$")
	public void home_Page_I_want_to_Options_should_be_displayed(List<MyBean> options) throws Throwable {
	    HomePageObjects obj = new HomePageObjects(driver);
	    ArrayList<String> expectedOptionsList = new ArrayList<String>();
	    String link1= obj.objViewAccountSummaryLink.getText();
	    String link2= obj.objViewRecentTransactionsLink.getText();
	    String link3= obj.objTransferFundsLink.getText();
	    String link4= obj.objSearchNewsArticlesLink.getText();
	    String link5= obj.objCustomizeSiteLangaugeLink.getText();
	    ArrayList<String> actualOptionsList = new ArrayList<String>();
	    actualOptionsList.add(0, link1);
	    actualOptionsList.add(1, link2);
	    actualOptionsList.add(2, link3);
	    actualOptionsList.add(3, link4);
	    actualOptionsList.add(4, link5);
	    System.out.println(actualOptionsList);
	    for(MyBean o: options){
	    	expectedOptionsList.add(o.getiWantToOptions());
	    	System.out.println(expectedOptionsList);
	    }
	    if(expectedOptionsList.containsAll(actualOptionsList)){
	    	Assert.assertTrue("I want to Options Validated",true); 
			System.out.println("I want to Options Validated");
	    }else{
	    	Assert.assertFalse("I want to Options Error",true);
			System.out.println("I want to Options Error"); 
	    }
	}

	@When("^User clicks on Search news Articles Link$")
	public void user_clicks_on_Search_news_Articles_Link() throws Throwable {
		HomePageObjects obj = new HomePageObjects(driver);
		obj.objSearchNewsArticlesLink.click();
		
	}

	@Then("^User should be navigated to search screen$")
	public void user_should_be_navigated_to_search_screen() throws Throwable {
		if ((driver.getTitle()).contains("Altoro Mutual")){
			Assert.assertTrue("User is on Search News Articles Page",true); 
			explicitWait(driver, driver.findElement(By.name("query")));
			System.out.println("User is on Search News Articles Page"); }
		else{
			Assert.assertFalse("User is not on Search News Articles Page",true);
			System.out.println("User is not on Search News Articles Page"); }
	}

	@When("^User searches for the news articles$")
	public void user_searches_for_the_news_articles(List<MyBean> news) throws Throwable {
	    SearchNewsArticlesPageObjects obj = new SearchNewsArticlesPageObjects(driver);
	    for(MyBean n:news){
	    obj.objSearchNewsTextField.clear();
	    obj.objSearchNewsTextField.sendKeys(n.getNewsArticlesToBeSearched());
	    obj.objQueryButton.click();
	    explicitWait(driver, driver.findElement(By.id("Label2")));
	}
	}


	@Then("^User should be able to successfully search the articles$")
	public void user_should_be_able_to_successfully_search_the_articles() throws Throwable {
		SearchNewsArticlesPageObjects obj = new SearchNewsArticlesPageObjects(driver);
		String actualResult= obj.objSearchedNewsArticleResult.getText();
		if(actualResult.contains("Found news title:")){
			if(actualResult.equals("Watchfire Announces General Availability of AppScan QA for Mercury TestDirector")){
				Assert.assertTrue("News Article Searched Successfully", true);
				System.out.println("News Article Searched Successfully");	
			}
		}else{
		Assert.assertFalse("News Article Searched Unsuccessfully",true);
		System.out.println("News Article Searched Unsuccessfully");
		}
	}



}
