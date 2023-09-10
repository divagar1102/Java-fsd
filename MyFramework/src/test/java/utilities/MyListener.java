package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener{
	
	ExtentReports e;
	ExtentTest t;
	  
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Passed");
	
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestNG started");
		e=new ExtentReports("test-output\\MyReport.html");
		e.startTest("LoginTest has started");
		e.addSystemInfo("Browser", "Chrome");
		e.addSystemInfo("Build","Smoke Testing");
		System.out.println("Test Case Passed");
		e.endTest(t);
		e.flush();
		
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed");
		
		
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped");
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("Test Case Passed");
		
	}
	public void onStart(ITestResult result) {
		
		
	}
	public void onFinish(ITestResult result) {
		System.out.println("TestNG finished");
		
		
	}

}
