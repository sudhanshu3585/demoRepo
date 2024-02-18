package utilities;

import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenteReports {
	static ExtenteReports extenteReports;
	static ExtentReports extent;
	@BeforeMethod
	public static ExtenteReports getExtenteReports() {
		String y=System.getProperty("user.dir")+"\\reports\\index.html\\";
		ExtentSparkReporter reporter=new ExtentSparkReporter(y);
		reporter.config().setReportName("tutorialninjaTestReport");
		reporter.config().setDocumentTitle("omayo title");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System", "Windows10");
		extent.setSystemInfo("Tested by", "Sudhanshu");
		return extenteReports;
	}

}
