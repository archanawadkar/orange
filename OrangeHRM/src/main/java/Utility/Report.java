package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {

	
	public static ExtentReports createReport() {
		
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("ArchanaReport.html");
		
		ExtentReports reports=new ExtentReports();
				
			reports.attachReporter(htmlReporter);
			reports.setSystemInfo("Regression","Chrome");
			reports.setSystemInfo("Browser","Chrome");
		    return reports;
	}
	
	
	
	
	
	
}
