package ListenerTutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	
	public void onStart(ITestContext context) {
		System.out.println("This is on Start Method.");
	} 
	// The main diff between the onStart and onTestStart Method is onStart will execute only once the test has been started. where as onTestStart will execute multiple times for multiple test cases.
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started.");
	}
	
	// This will execute when my test case is passed.
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed.");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped.");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure");
	}
	
	// This will execute when the Test execution has been completed.	
	public void onFinish(ITestContext context) {
		System.out.println("Test execution is completed.");
	}
}
