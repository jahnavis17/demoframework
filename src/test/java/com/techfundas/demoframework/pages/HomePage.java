package com.techfundas.demoframework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	@FindBy(id="search_query_top")
	private WebElement _txtSearch;
		
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public SearchResultsPage enterSearchText(String SearchTxt){
		_txtSearch.sendKeys(SearchTxt + Keys.ENTER);
		return new SearchResultsPage(getDriver());
	}

	
	
}
