package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,1200)");
		
				
		WebDriverWait obj=new WebDriverWait(driver,5);
		obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='poll-widget-container']/div[2]/p"))).getText();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='poll-widget-container']/div[2]/p")).getText());
		
	}

}
