package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddingFilters {
	
	/********In this script we are selecting filters before choosing product.**********************/
	
	WebDriver driver;
	JavascriptExecutor js;
	
	 public AddingFilters(WebDriver localdriver) {
		this.driver = localdriver;
	}
	 		
	/*********Character filter**************/
	@FindBy(id="facetLabel_-7000000000000000239841141171081213277101")
	@CacheLookup
	WebElement charfilter1;
	
	@FindBy(id="facetLabel_-70000000000000002397797114121101108108101110")
	@CacheLookup
	WebElement charfilter2;
	
	@FindBy(id="facetLabel_11211410599101958583685840123514832534812532534841")
	@CacheLookup
	WebElement priceFilter;
	/********clicking "truely me" character filter
	 * @throws Exception **********/
	public void char1Filter() throws Exception
	{	 js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 charfilter1.click();
		 Thread.sleep(5000);
	}
	/********clicking "Maryellen" character filter
	 * @throws Exception **********/
	public void char2Filter() throws Exception
	{
		charfilter2.click();
		
	}
	/********clicking "$30 - #50" price filter
	 * @throws Exception **********/
	public void priceFilter() throws Exception
	{
		Thread.sleep(8000);
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		priceFilter.click();
	}

	
//	 @FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
	// 	 @FindBy(how = How.ID, using = "log")
}
