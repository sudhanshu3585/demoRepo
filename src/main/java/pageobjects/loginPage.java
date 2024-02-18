package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver cdriver;
	
	public loginPage(WebDriver cdriver) {
		this.cdriver=cdriver;
		PageFactory.initElements(cdriver, this);
		
		
		
	}
	
	@FindBy(id="input-email")
	private WebElement emailAddressField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;
	
	public WebElement emailAddressField() {
		return emailAddressField;
	}
	public WebElement passwordField() {
		return passwordField;
	}
	public WebElement loginButton() {
		return loginButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
