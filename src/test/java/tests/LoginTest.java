package tests;

import java.io.IOException;
import resources.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.MyAccountPage;
import pageobjects.loginPage;
import resources.Base;

public class LoginTest extends Base{
	WebDriver cdriver;
	Logger log;
	
	
	@BeforeMethod
	public void openBrowser() throws Throwable {
		
		log = LogManager.getLogger(LoginTest.class.getName());
		
		cdriver = initializeDriver();
		cdriver.get(prop.getProperty("url1"));
		Thread.sleep(4000);
		log.debug("Application launched");
	}
	
	
	
	
	
	
	@Test(dataProvider = "getLoginData")
	public void login(String email,String password,String expectedResult) throws Throwable {
		
		
		
		
		LandingPage landingpage=new LandingPage(cdriver);
		landingpage.myAccountDropdown().click();
		landingpage.loginOption().click();
		
		loginPage loginPage= new loginPage(cdriver);
		loginPage.emailAddressField().sendKeys(email);
		log.debug("Email has entered");
		loginPage.passwordField().sendKeys(password);
		log.debug("Password has entered");
		loginPage.loginButton().click();
		log.debug("Loginbutton clicked");
		
		MyAccountPage accountPage=new MyAccountPage(cdriver);
		
		String ActualResult = null;
		
		try{
			if(accountPage.editYourInformationOption().isDisplayed()) {
				ActualResult="Successfull";
				log.info("User has logged in successfully");
			}
			
		}catch(Exception e) {
			ActualResult="Fail";
			log.error("User login failed");
		}
		//Assert.assertTrue(accountPage.editYourInformationOption().isDisplayed());
		Assert.assertEquals(ActualResult, expectedResult);
		
	}

	
	
	
	
	
	
	
	
	@AfterMethod
	public void clouser() {
		cdriver.close();
		log.debug("Application closed");
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		 
		Object[][] data= {{"abc1cdkjein234@gmail.com","12345678","Successfull"}};
		return data;
	}
	
	
	
	
	
	
	
	
	
}
