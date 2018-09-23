package ca.amazon.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class Base {

	public WebDriver driver;
	public FileInputStream fis;
	public Properties prop;
	public Logger logger=Logger.getLogger("Base");
	
		
	//Configuring the property file and launching the browser
	
	@BeforeTest
	@Parameters("browser")
	public void StartBrowser(String browserName) throws IOException {		
		
		PropertyConfigurator.configure("Log4j.properties");
		File file=new File("./src/main/java/ca/amazon/resources/config.properties");
		fis = new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromePath"));
			driver=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxPath"));
			driver=new FirefoxDriver();
			
		}else {
			
			System.setProperty("webdriver.ie.driver",prop.getProperty("iePath"));
			driver=new InternetExplorerDriver();
		}
		logger.info("----------Test Started------------");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		logger.info("---------Application Launched----------");

	}
	
	//Closing WebDriver instance
	@AfterTest
	public void CloseWebDriver() {
		
		driver.close();
		logger.info("----------Test End------------");
	}
}
