package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class ThreeTest extends Base{
	@Test
	public void testThree() throws Throwable {
		System.out.println("Inside Test 3");
		
		WebDriver cdriver = initializeDriver();
		cdriver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		cdriver.close();
	}

}
