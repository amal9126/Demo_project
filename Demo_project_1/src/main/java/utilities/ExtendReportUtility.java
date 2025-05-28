package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	 
	public static final ExtentReports extentReports = new ExtentReports(); 
	  
	 	public synchronized static ExtentReports createExtentReports() { 
	 		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html"); 
	 		reporter.config().setReportName("Demo_Project1"); 
	 		extentReports.attachReporter(reporter); 
	 		extentReports.setSystemInfo("Organization", "Obsqura"); 
	 		extentReports.setSystemInfo("Name", "Amal"); 
	 		return extentReports; 
	 	}
}
