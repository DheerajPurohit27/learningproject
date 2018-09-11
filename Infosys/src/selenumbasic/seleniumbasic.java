package selenumbasic;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumbasic {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.online.citibank.co.in");
		
		WebElement ele=driver.findElement(By.xpath("//img[contains(@title,'LOGIN NOW')][1]"));
Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.SHIFT,Keys.ENTER).perform();
		Set<String> handles =driver.getWindowHandles();
		String currentwindow= driver.getWindowHandle();
		System.out.println(currentwindow);
	    for(String handle:handles)
	    {
	    	driver.switchTo().window(handle);
	    }
	    
	    String currentwindow1= driver.getWindowHandle();
		System.out.println(currentwindow1);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(currentwindow);
		Thread.sleep(2000);
		driver.close();
				

	}

}
