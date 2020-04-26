package com.qa.testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\CucumberSelenium\\Cucumber With PageObject\\CucumberPageObject\\src\\main\\java\\com\\qa\\features\\login.feature", // Path of the feature file
		glue = {"com/qa/stepdefinations"}, //relative path of the Steps definitions file (Package)
	    dryRun = false, // This is to verify if the step definitions for all steps inside scenario is present or not
	    monochrome = true, // This is to have consistent or good console output
	    format = {"pretty",
	    		  "html:target/cucumber-reports/cucumber-pretty",
	    		  "json:target/cucumber-reports/CucumberTestReport.json"},
	    plugin = {"html:target/site/cucumber-pretty","json:target/cucumber.json"} // This is to actual generate reports in Cucumber
	   // tags = {"~@SmokeTest", "~@RegressionTest"}
		)

public class TestRunner {
	
	private TestNGCucumberRunner objTestNG;
	
	@BeforeClass(alwaysRun = true)
	public void setupclass() {
		objTestNG = new TestNGCucumberRunner(this.getClass());		
	}
	
	@Test(groups = "cucumber", description = "run cucumber method", dataProvider ="features")
	public void ControlCucumberFeature(CucumberFeatureWrapper cucumberfeature) {
		objTestNG.runCucumber(cucumberfeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features(){
		return objTestNG.provideFeatures();
	}
	
	@AfterClass(alwaysRun = true)
	public void TearDown() {
		objTestNG.finish();
	}

}
