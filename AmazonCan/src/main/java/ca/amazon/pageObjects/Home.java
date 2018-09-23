package ca.amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home {
	public WebDriver driver;
	public Actions act;
	
	@FindBy(how=How.XPATH, using="//*[@id=\'nav-link-shopall\']")
	WebElement ShopByDept;

	@FindBy(how=How.XPATH, using="//*[@id=\'nav-flyout-shopAll\']/div[2]/span[8]/span")
	WebElement kindle;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[8]/div[1]/div[1]/a[2]/span[1]")
	WebElement paperWhite;
	
	public Home(WebDriver idriver){
		this.driver=idriver;
	}
	

	public void ShopByDept() {
		act=new Actions(driver);
		act.moveToElement(ShopByDept).build().perform();
	}
	
	public void SelectKindle() {
		act=new Actions(driver);
		act.moveToElement(kindle).build().perform();
	}
	
	public void ClickPaperWhite() {
		paperWhite.click();
	}
}
