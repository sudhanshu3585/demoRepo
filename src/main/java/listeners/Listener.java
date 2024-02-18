package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;
import utilities.ExtenteReports;

public class Listener extends Base implements ITestListener {
	WebDriver cdriver;
	ExtenteReports extenteReport = ExtenteReports.getExtenteReports();
	@Override
	public void onTestStart(ITestResult result) {
		String testName=result.getName();
		//extenteReport.createTest(testName);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//code to take screenshot
		cdriver=null;
		String testName=result.getName();
		try {
			cdriver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("cdriver").get(result.getInstance());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try {
		takeScreenShot(testName, cdriver);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {

		
	}

}
