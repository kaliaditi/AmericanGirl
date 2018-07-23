package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomeToFurnitureAcc {

		/*@FindBy(xpath="html/body/div[3]/div[2]/header/nav/div/div[1]/ul/li[3]/a")
	@CacheLookup*/
	
	/*************Clicking on Home and Furniture tab*******************/
	
	WebDriver driver;
	
	public HomeToFurnitureAcc(WebDriver ldriver) {
	this.driver=ldriver;
	}
	
	//WebElement furniture;

	public void clickingFurnitureAcc() throws Exception {
		Thread.sleep(6000);
		driver.findElement(By.id("categoryLink_31121")).click();
	}

}
