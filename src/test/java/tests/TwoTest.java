package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base{
	@Test
	public void testTwo() throws Throwable {
		System.out.println("Inside Test 2");
		WebDriver cdriver = initializeDriver();
		cdriver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		cdriver.close();
		
	}

}
