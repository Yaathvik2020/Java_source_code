package extentreport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.testng.Assert;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Report   {
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest logger;
	public static String  dir=null;
	public static String  dirScr=null;
	public static String  path=null;
	public static String zipdir=null;
	static int AssertFailCount = 0;

	public void startReportSession(String className,String timeStamp) throws IOException {	
		 String workingDirectory = System.getProperty("user.dir");
		 dir = workingDirectory + File.separator +"Report"+File.separator+ className + "_" +timeStamp;
	     dirScr = dir+File.separator+"Screenshot";
	     path = dir+File.separator+className + "_" +timeStamp+"_TestCase.html";
	     zipdir = workingDirectory + File.separator +"Report"+File.separator+"Zip";
	     
		File file = new File(dir);
		File file1 = new File(dirScr);
		File file2 = new File(zipdir);
		
        if (!file.exists() && !file1.exists()) {
            file.mkdir();
            file1.mkdir();
            
            
            System.out.println("Directory is created!");
        } else {
            System.out.println("Directory is already existed!");
        }
        
        if(!file2.exists())
        {
        	file2.mkdir();
        	System.out.println("Zip Directory is created!");
        } else {
            System.out.println("Zip Directory is already existed!");
        }
        
		htmlReporter = new ExtentHtmlReporter(path);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("GSK PLANISWARE");
		htmlReporter.config().setReportName(className);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("dd MMM YYY HH:mm:ss");

	}

	public static String startReport(String name) throws IOException {
		logger = extent.createTest(name);
		return name;
	}
	/** Captures the Step Details for Report **/
    public static void extnReportLogger(int stepNumber, String stepDescriptionPass,String stepDescriptionFail, String screenShotCapture, boolean tcStatusFlag) throws IOException {

    	if (tcStatusFlag==true) {
			if (screenShotCapture.equalsIgnoreCase("Y")) {
				//String val = WebDriverGenericsFunction.capture(dirScr).toString();
				String Final = "./Screenshot/" + "" + ".png";
				logger.log(
						Status.PASS,
						"<font style='color:LimeGreen'> Step#:  " + stepNumber + "<br></font>"
								+ stepDescriptionPass
								+ "<br>",
						MediaEntityBuilder.createScreenCaptureFromPath(Final).build());
			} else if (screenShotCapture.equalsIgnoreCase("N")) {
				logger.log(Status.PASS,
						"<font style='color:LimeGreen'> Step#:  " + stepNumber + "<br></font>" + stepDescriptionPass);
			} else {
				logger.log(Status.INFO, stepDescriptionPass);
			}
		} else {

    			//String val = WebDriverGenericsFunction.capture(dirScr).toString();
    			String Final = "./Screenshot/" + "" + ".png";
			logger.log(
					Status.FAIL,
					"<font style='color:Red'> Step#:  " + stepNumber + "<br></font>" + stepDescriptionFail + "<br>",
					MediaEntityBuilder.createScreenCaptureFromPath(Final).build());
			//AssertFailCount = AssertFailCount + 1;

    		}
           
    }


	public static void getDashboardDetails(String browserName ,String appName,String appUrl,String appEnv,String appUserName) {
		String systemName;
		try {
			systemName = InetAddress.getLocalHost().getHostName();
			String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);	
			extent.setSystemInfo("Application Name", appName);			
			extent.setSystemInfo("Login User", appUserName);
			extent.setSystemInfo("OS Details", OS);
			extent.setSystemInfo("System Name", systemName);
			extent.setSystemInfo("Browser Details",browserName );
			extent.setSystemInfo("Url", appUrl);
			extent.setSystemInfo("Environment ", appEnv);
		

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static void getResult(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			// logger.log(Status.FAIL, "Test Case Failed is "+result.getName());
			// MarkupHelper is used to display the output in different colors
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SKIP) {
			// logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		}

	}

public static void ReportOverAllExecutionStatus() {
	if(!(AssertFailCount==0)) {
		Assert.fail();
	}
	}
 public static void FlushReport() {
	 extent.flush(); 
 }
	

	public static void zipFiles() throws IOException {
		
		File directoryToZip = new File(dir);
		List<File> fileList = new ArrayList<File>();
		System.out.println("---Getting references to all files in: " + directoryToZip.getCanonicalPath());
		getAllFiles(directoryToZip, fileList);
		System.out.println("---Creating zip file");
		writeZipFile(directoryToZip, fileList);
		System.out.println("---Done");
	}

	public static void getAllFiles(File dir, List<File> fileList) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				fileList.add(file);
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					getAllFiles(file, fileList);
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeZipFile(File directoryToZip, List<File> fileList) {

		try {
			
			String zipPath = zipdir+File.separator+directoryToZip.getName() + ".zip";
			FileOutputStream fos = new FileOutputStream(zipPath);
			ZipOutputStream zos = new ZipOutputStream(fos);

			for (File file : fileList) {
				if (!file.isDirectory()) { // we only zip files, not directories
					addToZip(directoryToZip, file, zos);
				}
			}

			zos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addToZip(File directoryToZip, File file, ZipOutputStream zos)
			throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream(file);

		// we want the zipEntry's path to be a relative path that is relative
		// to the directory being zipped, so chop off the rest of the path
		String zipFilePath = file.getCanonicalPath().substring(directoryToZip.getCanonicalPath().length() + 1,
				file.getCanonicalPath().length());
		System.out.println("Writing '" + zipFilePath + "' to zip file");
		ZipEntry zipEntry = new ZipEntry(zipFilePath);
		zos.putNextEntry(zipEntry);

		byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zos.write(bytes, 0, length);
		}

		zos.closeEntry();
		fis.close();
	}


}
