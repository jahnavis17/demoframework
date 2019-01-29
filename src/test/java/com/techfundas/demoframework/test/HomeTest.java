package com.techfundas.demoframework.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.techfundas.demoframework.pages.HomePage;
import com.techfundas.demoframework.pages.SearchResultsPage;
import com.techfundas.demoframework.utilities.BaseTest;

public class HomeTest extends BaseTest{
	WebDriver driver;
	private static final Logger log = LogManager.getLogger(HomeTest.class);
	HomePage hPage;
	SearchResultsPage sResultsPage;

	@Test
	public void validateSearch() {
		sResultsPage = hPage.enterSearchText("T Shirt");
		sResultsPage.validateSearchResult("T Shirt");

	}

	@Test
	public void validateLaunch() {
		log.info("Log started");
		System.out.println("Chrome Browser Launched");

	}

	@BeforeClass
	public void setup(){
		hPage = new HomePage(getDriver());
	}
	

}
