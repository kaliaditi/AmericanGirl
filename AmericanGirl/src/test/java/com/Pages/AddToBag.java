package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.FirstProject.AmericanGirl.Log1;

public class AddToBag {
	
	/*********Adding selected product in bag*******************/
	
	WebDriver driver;
	JavascriptExecutor js;
	public AddToBag(WebDriver ldriver){
		this.driver = ldriver;
	}
	
	@FindBy(id="productPageAdd2Cart")
	@CacheLookup
	WebElement bag;
	public void addingToBag() throws Exception
	{
		
		bag.click();
		Log1.info("add to bag ");
	}
	
	@FindBy(id="myOrderSummaryContinueButtonText2")
	@CacheLookup
	WebElement shoppingbag;
	public void addingToShoppingBag() throws Exception
	{
		Thread.sleep(10000);
		shoppingbag.click();
	}
	
	@FindBy(id="myOrderSummaryContinueButtonText")
	@CacheLookup
	WebElement checkOut;
	public void checkOutNow() throws Exception
	{
		Thread.sleep(3000);
		checkOut.click();
	}
	
	@FindBy(xpath="//a[@id='guestShopperContinue']")
	@CacheLookup
	WebElement checkOutAsGuest;
	public void checkOutGuest() throws Exception
	{
		Thread.sleep(6000);
		System.out.println("checkoutguest=");
		checkOutAsGuest.click();
	}
	
	@FindBy(id="birth_date")
	@CacheLookup
	WebElement bDate;
	
	@FindBy(id="birth_year")
	@CacheLookup
	WebElement year;
	
	//@FindBy(className="button_primary tlignore focus-ring")
	@FindBy(css="a.button_primary.tlignore>div.button_text")
	@CacheLookup
	WebElement continueButton;
	
	public void birthDate() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[contains(.,' Jan ')]")).click();
		Thread.sleep(3000);
		Select birthdate = new Select(bDate);
		birthdate.selectByIndex(22);
		
		Select birthyear = new Select(year);
		birthyear.selectByVisibleText("1988");
		Thread.sleep(3000);
		
		continueButton.click();
		
		//driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
		/*js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5)");
		Thread.sleep(2000);
		driver.findElement(By.id("")).
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,10)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='1988']")).click();
		Thread.sleep(3000);
		
	*/	
	}
}
