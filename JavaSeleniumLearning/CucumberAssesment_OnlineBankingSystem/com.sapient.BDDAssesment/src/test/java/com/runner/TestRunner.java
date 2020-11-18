package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true, 
		features= {"Feature/Logout.feature","Feature/ViewAccountDetails.feature","Feature/SearchNewsArticles.feature","Feature/GoldVisaApplicationPage.feature"}  ,
		glue={"com.test"} ,
		plugin ={"pretty" , "html:target/cucumber-html-report"},
	    	tags = "@Smoke"
		
		)


public class TestRunner {

}
