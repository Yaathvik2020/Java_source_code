package stepDefination;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Utility.extentUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;


public class Hook  {
	
	extentUtil extent=new extentUtil();
	@Before
	public void setUp(Scenario scenario) throws IOException {
//		System.out.println("Before Scanario ---->");
//		String className = this.getClass().getName();
//		 LocalDateTime myDateObj = LocalDateTime.now();  
//		 System.out.println("Before formatting: " + myDateObj);  
//		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss-ns");  
//		 String formattedDate = myDateObj.format(myFormatObj); 
//		 extent.startReportSession(className, formattedDate);
		 extent.startReport(scenario.getName());
		 System.out.println(scenario.getClass()+" <--1--->"+scenario.getId()+"<---2-->"
		 +scenario.getSourceTagNames()+"<--3-->"+scenario.getLine()+"<-4--->"+scenario.getStatus()+"<---5--->"+scenario.getUri());

	}
	@After
	public void tearDown(){
		System.out.println("AfterS Scanario ---->");
		//extentUtil.FlushReport();
	}
	@BeforeStep
	public void step(Scenario scenario) throws IOException {
		System.out.println("before Step started");	
		
	
	}
	@AfterStep
	public void stepafter() {
		System.out.println("After step completion");
		//extentUtil.FlushReport();
	}
}
