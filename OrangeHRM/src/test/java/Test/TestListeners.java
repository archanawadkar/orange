package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot;

public class TestListeners extends BaseTest implements ITestListener {

	
	
	public void onTestStart(ITestResult result) {
		try {
			Screenshot.takescreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result.getName()+"Test is started");
	}
	public void onTestSuccess(ITestResult result) {
		try {
			Screenshot.takescreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result.getName()+"Test is success");
	}
	
	public void onTestFail(ITestResult result){
		try {
			Screenshot.takescreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result.getName()+"Test is fail");
	}
	
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Test is skipped");
	}
	
	
	
	
	
	
	
	
}
