package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;
import POM.LoginPage;
import Utility.Parametrization;
import Utility.Report;

@Listeners(TestListeners.class)


public class LoginPageTest extends BaseTest {
	//WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void extentReports() {
		report=Report.createReport();
	}
	
	
	@BeforeMethod
	public void launchbrowser() {
	  driver=Browser.OpenBrowser();
	}
	
	
	@Test()
	public void LoginwithCredentials() throws EncryptedDocumentException, IOException, InterruptedException {
		test=report.createTest("LoginwithCredentials");
		LoginPage loginPage =new LoginPage(driver);
		String value=Parametrization.getdata("Sheet1", 0, 1);
		String values=Parametrization.getdata("Sheet1", 1, 1);
		loginPage.EnterUsername(value);
		loginPage.EnterPass(values);
		loginPage.ClickOnlogin();
	}
	
	@AfterMethod
	public void closebrowser(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());	
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		else {
			test.log(Status.SKIP, result.getName());
		}
	}
	
	@AfterTest
	public void flushresult() {
		report.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
