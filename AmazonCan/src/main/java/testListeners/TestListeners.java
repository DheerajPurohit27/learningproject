package testListeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ca.amazon.base.Utility;

public class TestListeners implements ITestListener{
	
	public WebDriver driver;
	
	public Utility util=new Utility(driver);
		
	public void onTestStart(ITestResult result) {
			
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed test case name is: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {	
		System.out.println("Failed test case name is: "+result.getName());
		util.captureScreenshot(driver, result.getName());
	}

	public void onTestSkipped(ITestResult result) {
	
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
		
	}

}
