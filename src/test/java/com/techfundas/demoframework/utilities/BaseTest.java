package com.techfundas.demoframework.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
private static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		driver = createDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	public static WebDriver createDriver(){
		String env = "winChromePath";
		String winChromePath = "C:/Program Files (x86)/Jenkins/workspace/AutomationDemo/src/test/java/resources/chromedriver.exe";
		String linuxChromePath = "C:/Users/Hp/Appium_Demo/demoframework/src/test/java/resources/chromedriver";

		if (env.equals("winChromePath")) {
			System.setProperty("webdriver.chrome.driver", winChromePath);
		} else {
			System.setProperty("webdriver.chrome.driver", linuxChromePath);
		}

		driver = new ChromeDriver();
		return driver;
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public void setDriver(){
		driver= this.driver;
		
	}
}
