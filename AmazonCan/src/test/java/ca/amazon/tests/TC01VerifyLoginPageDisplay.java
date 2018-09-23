package ca.amazon.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import ca.amazon.base.Base;
import ca.amazon.pageObjects.AddToCart;
import ca.amazon.pageObjects.Home;
import ca.amazon.pageObjects.LoginPage;

public class TC01VerifyLoginPageDisplay extends Base{
	
	Logger logger=Logger.getLogger("TC01VerifyLoginPageDisplay");
	
	@Test
	public void verifyLogin(){
				
		Home ho=PageFactory.initElements(driver, Home.class);
		//Mouse hover over Shop By Department
		ho.ShopByDept();
		
		//Mouse hover over Kindle option
		ho.SelectKindle();
		
		//Clicking on PaperWhite option
		ho.ClickPaperWhite();
		logger.info("PaperWhite item is selected");
		
		AddToCart atc=PageFactory.initElements(driver, AddToCart.class);
		
		//Increasing the quantity to 2
		atc.IncreaseQuantity();
		logger.info("Qantity of PaperWhite is increased to 2");
		
		//Clicking on Add to Cart button
		atc.ClickAddtoCart();
		logger.info("PapaerWhite is added into Cart");
		
		//Clicking on Add to Order button
		atc.ClickAddtoOrder();
		
		//Clicking on Proceed to Checkout button
		atc.ClickProceedtoCheckout();
		logger.info("Now, you have proceeded for checkout");
		
		//Verifying email and password fields are displayed
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		String ActualText=login.getActText();
		String ExpectedText=login.getExpText();
		Assert.assertEquals(ActualText, ExpectedText);
				
	}
		
}
