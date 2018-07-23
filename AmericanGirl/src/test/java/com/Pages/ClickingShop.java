package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.FirstProject.AmericanGirl.Log1;

public class ClickingShop {
	
	/********Going to Shop tab in main menu*************/

	
	@FindBy(xpath = "//a[@class='header-link' and text()='Shop']")
	@CacheLookup

	WebElement shop;
	
	public void clickingShop()
	{
		shop.click();
		Log1.info("on shop tab clicked");
		
	}

}
