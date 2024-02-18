package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public Properties prop;
	WebDriver cdriver;
	
	public WebDriver initializeDriver() throws IOException {
		prop=new Properties();
		String propPath=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.proprties";
		FileInputStream fis= new FileInputStream(propPath);
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			cdriver=new ChromeDriver();
		
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			cdriver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.firefoxdriver().setup();
			cdriver=new FirefoxDriver();
		
		}else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.firefoxdriver().setup();
			cdriver=new EdgeDriver();
		}
		
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		return cdriver;
	}
	
	
	public void takeScreenShot(String testName, WebDriver cdriver) throws IOException {
		
		
		 File scrFile = ((TakesScreenshot)cdriver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath=System.getProperty("user.dir")+testName+".png";
		
		FileUtils.copyFile(scrFile, new File(destinationFilePath));
	}
	
	
	
}
