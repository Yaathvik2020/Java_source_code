package Utility;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListnerTestNG  implements ITestListener  {
	extentUtil extent = new extentUtil(); 
	
	public void onStart(ITestContext arg0) {
		try {
			
			String className = this.getClass().getName();
			 LocalDateTime myDateObj = LocalDateTime.now();  
			 System.out.println("Before formatting: " + myDateObj);  
			 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss-ns");  
			 String formattedDate = myDateObj.format(myFormatObj); 
			 extent.startReportSession(className, formattedDate);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Befor start test  , this start is  proceed: "+arg0);
		
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		extentUtil.FlushReport();	
		System.out.println("Afer start test  , this finish is  proceed");
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
	}


}
