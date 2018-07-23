package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductSelection {
	/*************selecting final product************************/
	
	WebDriver driver;
	JavascriptExecutor js;
	 public  ProductSelection(WebDriver localdriver) {
			this.driver = localdriver;
		}
	
	@FindBy(id="WC_CatalogEntryDBThumbnailDisplayJSPF_73152_link_9b")
	@CacheLookup
	WebElement product; 
	
	public void selectProduct() throws Exception
	{	
		Thread.sleep(10000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", product);
		//js.executeScript("window.scrollBy(0,600)");
		product.click();
	}
}
