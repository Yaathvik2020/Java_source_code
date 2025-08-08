package extentreport;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import bsh.This;

public class extReport {
	
	Report extn=new Report();
	@Test
	public void loginTest() throws IOException{
		String className = this.getClass().getName();
		 LocalDateTime myDateObj = LocalDateTime.now();  
		 System.out.println("Before formatting: " + myDateObj);  
		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss-ns");  
		 String formattedDate = myDateObj.format(myFormatObj); 
		 
		 extn.startReportSession(className, formattedDate);
	      String[] tr= {"chinna---1","Chinna---2"};
	      for(String st: tr) {
	        Report.startReport("ExtentDemo");
	        Report.extnReportLogger(1,"test is passed","test is failed","Y",true);
	        Report.extnReportLogger(2,"test is passed","test is failed","Y",true);
	        Report.extnReportLogger(3,"test is passed","test is failed","Y",true);
	      }
	      Report.FlushReport();

		
	       	    
		
	}

}
