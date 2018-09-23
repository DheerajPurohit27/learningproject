package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	
	public void WindowHandling(){
			
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		System.out.println("Before Clicking on Signin button: "+driver.getTitle());
		driver.findElement(By.xpath("//div[@id='initialView']/footer/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='initialView']/footer/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='initialView']/footer/ul/li[3]/a")).click();
		
		Set<String> Ele=driver.getWindowHandles();
			
		Iterator<String> it=Ele.iterator();
		String ParentId=it.next();
		String ChildId1=it.next();
		String ChildId2=it.next();
		String ChildId3=it.next();
		
		driver.switchTo().window(ChildId1);
		System.out.println("After Clicking on Signin button: "+driver.getTitle());

		driver.switchTo().window(ChildId2);
		System.out.println("After Clicking on Signin button: "+driver.getTitle());
		
		driver.switchTo().window(ChildId3);
		System.out.println("After Clicking on Signin button: "+driver.getTitle());
		
		driver.switchTo().window(ParentId);
		System.out.println("After Clicking second Signin button: "+driver.getTitle());
		
		
	}
	
	
	public static void main(String[] args) {
		MultipleWindows obj=new MultipleWindows();
		obj.WindowHandling();
	}
}

