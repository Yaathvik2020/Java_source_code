package stepDefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.aventstack.extentreports.GherkinKeyword;

import Utility.extentUtil;




public class DataTables {
	
	@When("^display the value without header$")
	public void familyDetails(DataTable tabl) throws ClassNotFoundException, IOException{
		List<String> list=tabl.asList();
		for(String Name:list){
			System.out.println("List of Name :"+Name);
		}
		extentUtil.extnReportLogger(1,"display the value without header","not display the value without header","Y",true);
	}
	@When("^display the value with header$")
	public void headerDetails(DataTable usercredentials) throws IOException, ClassNotFoundException{
		for (Map<Object, Object> data : usercredentials.asMaps(String.class, String.class)) {
			 
			 System.out.println(data.get("father")+","+data.get("mother")+","+data.get("child"));
			 
	}
		extentUtil.extnReportLogger(2,"display the value with header","test is failed","Y",true);
		
 }
		
	
	@Given("^display the value Success$")	
	 public void user_enters_st() throws Throwable {
		extentUtil.extnReportLogger(4,"display the value Success","test is failed","Y",true);
		 
	}
}

