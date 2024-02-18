package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver cdriver;

	public LandingPage(WebDriver cdriver) {
		this.cdriver = cdriver;
		PageFactory.initElements(cdriver, this);

	}

	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myAccountDropdown;
	
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	
	public WebElement myAccountDropdown() {
		return myAccountDropdown;
	}

	public WebElement loginOption() {
		return loginOption;
	}
}
