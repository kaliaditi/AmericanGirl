package com.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class ShippingDetails {
	File file = new File("C:\\Users\\ArvindKumar\\eclipse-workspace\\AmericanGirl\\ShippingDetails");
	FileInputStream fileInput = null;
	Properties prop = new Properties();
	
	@FindBy(id ="WC__ShoppingCartAddressEntryForm_shippingAddress_firstName_1")
	@CacheLookup
	WebElement	firstName;
	
	@FindBy(id ="WC__ShoppingCartAddressEntryForm_shippingAddress_lastName_1")
	@CacheLookup
	WebElement	lastName;
	
	@FindBy(id ="WC__ShoppingCartAddressEntryForm_shippingAddress_address1_1")
	@CacheLookup
	WebElement	address;
	
	@FindBy(id ="WC__ShoppingCartAddressEntryForm_shippingAddress_city_1")
	@CacheLookup
	WebElement	city;
	
	@FindBy(id ="WC__ShoppingCartAddressEntryForm_shippingAddress_zipCode_1")
	@CacheLookup
	WebElement	zipcode;
	
	@FindBy(id="WC__ShoppingCartAddressEntryForm_shippingAddress_state_1")
	@CacheLookup
	WebElement	statedrop;
	
	@FindBy(id="myOrderSummaryContinueButtonText")
	@CacheLookup
	WebElement	contButton;
	
	@FindBy(id="useSugAddress")
	@CacheLookup
	WebElement	correctAddButton;
	
	SoftAssert ass = new SoftAssert();
			
	public void addDetails() throws InterruptedException
	{
		try {
			fileInput = new FileInputStream(file);
			prop.load(fileInput);
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println("prop--"+prop);
		Thread.sleep(4000);
		firstName.sendKeys(prop.getProperty("FirstName"));
		//ass.assertEquals(true, true);
		lastName.sendKeys(prop.getProperty("LastName"));
		address.sendKeys(prop.getProperty("streetAdd"));
		city.sendKeys(prop.getProperty("city"));
		zipcode.sendKeys(prop.getProperty("zip"));
		Thread.sleep(3000);
		Select state = new Select(statedrop);
		state.selectByVisibleText("California");
		Thread.sleep(3000);
		contButton.click();
		Thread.sleep(5000);
		correctAddButton.click();
	}

}
