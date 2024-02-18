package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class FourTest extends Base {
	public WebDriver cdriver;
	@Test
	public void testFour() throws Throwable{
		System.out.println("Inside Test 4");
		
		
		cdriver = initializeDriver();
		cdriver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		Assert.assertTrue(false);
	

}
	@AfterMethod
	public void close() {
		cdriver.close();
	}
	
}
