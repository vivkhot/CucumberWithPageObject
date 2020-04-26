package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver webdriver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public TestBase()
	{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\CucumberSelenium\\Cucumber With PageObject\\CucumberPageObject\\src\\main\\java\\com\\qa\\config\\Config.properties");
			prop.load(ip);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
		
	}
	
	
	public static void initialize() {
		String browsername = prop.getProperty("BrowserName");
		String URL = prop.getProperty("URL");
		if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Drivers\\Chrome 81\\chromedriver.exe");
			webdriver = new ChromeDriver();
			
		}
		else if(browsername.equals("IE")) {
			
		}
		wait=new WebDriverWait(webdriver, 60);
		webdriver.manage().window().maximize();
		webdriver.manage().deleteAllCookies();
	    webdriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	    webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    webdriver.navigate().to(URL);	
	    wait.until(ExpectedConditions.visibilityOf(webdriver.findElement(By.xpath("//span[contains(text(),'Log In')]"))));
	    webdriver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	}
	

	
}
