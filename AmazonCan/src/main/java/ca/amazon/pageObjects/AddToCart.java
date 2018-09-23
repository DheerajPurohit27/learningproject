package ca.amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
	public WebDriver driver;
	public Actions act;
	
	@FindBy(how=How.XPATH, using="//select[@id='quantity']")
	WebElement quantity;

	@FindBy(how=How.XPATH, using="//input[@id='add-to-cart-button']")
	WebElement AddtoCart;
	
	@FindBy(how=How.XPATH, using="//img[@id='intl_pop_addToOrder']")
	WebElement AddtoOrder;
	
	@FindBy(how=How.XPATH, using="//*[@id=\'hlb-next-steps\']/a")
	WebElement ProceedtoCheckout;
	
	public AddToCart(WebDriver idriver){
		this.driver=idriver;
	}
	
	public void IncreaseQuantity() {
		Select se=new Select(quantity);
		se.selectByValue("2");
	}
	
	public void ClickAddtoCart() {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
		AddtoCart.click();
	}
	
	public void ClickAddtoOrder() {
		String windowId=driver.getWindowHandle();
		driver.switchTo().window(windowId);
		AddtoOrder.click();
	}
	
	public void ClickProceedtoCheckout() {
		ProceedtoCheckout.click();
	}
}
