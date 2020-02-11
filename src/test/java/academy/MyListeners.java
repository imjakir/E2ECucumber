package academy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class MyListeners implements ITestListener {
	Base b = new Base();
	
	public void onTestStart(ITestResult result) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	public void onTestSuccess(ITestResult result) {

	}


	public void onTestFailure(ITestResult result) {
		try {
			b.getScreenshots(result.getName());
		} catch (IOException e) {
			
			e.printStackTrace(); 
		}
	}
	
	public void onTestSkipped(ITestResult result) {

	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	
	public void onStart(ITestContext context) {

	}

	
	public void onFinish(ITestContext context) {

	}

}