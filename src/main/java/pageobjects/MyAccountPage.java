package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
WebDriver cdriver;

public MyAccountPage(WebDriver cdriver) {
	this.cdriver=cdriver;
	PageFactory.initElements(cdriver,this );
	
}
@FindBy(linkText="Edit your account information")
private WebElement editYourInformationOption;

public WebElement editYourInformationOption() {
	
	return editYourInformationOption;
}





}
