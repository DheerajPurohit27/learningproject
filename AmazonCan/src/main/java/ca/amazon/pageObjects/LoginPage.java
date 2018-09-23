package ca.amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	public WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id=\\\"authportal-main-section\\\"]/div[2]/div/div[1]/form/div/div/div/h1")
	WebElement actualText;
	
	String emailText="Sign in";
	
	public LoginPage(WebDriver idriver) {
		this.driver=idriver;
	}
	
	public String getActText() {
		return emailText;
	}
	
	public String getExpText() {
		return actualText.getText();
	}

}
