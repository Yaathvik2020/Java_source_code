package cucumberTest;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)// this 
@CucumberOptions(
 features = {"src/test/resources/Feature"},glue={"stepDefination"}
 ,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
 //,tags={"@tag3,@tag2"}//  OR means scenarios that are tagged either as @SmokeTest OR @RegressionTest.   
// ,tags="@tag3","@tag2" // And means scenarios that are tagged  as @SmokeTest And @RegressionTest. 
// ,tags={"~@tag3","~@tag2"} // This is NOt Equals condition, which means all the scenarios tagged as @FunctionalTest but not @SmokeTest. So total tests are 15 and smoke tests are 6, so it ran just 9 tests. 
 ,monochrome = true
 //,dryRun =true
 //,format = {"pretty"}
// ,strict = true
 )

//@Listeners(Utility.ListnerTestNG.class)
@Test
public class TestRunner extends AbstractTestNGCucumberTests  {
}

