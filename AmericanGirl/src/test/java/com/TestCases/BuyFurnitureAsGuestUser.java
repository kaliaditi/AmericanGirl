package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FirstProject.AmericanGirl.ReportGeneration;
import com.FirstProject.AmericanGirl.StartBrowser;
import com.Pages.AddToBag;
import com.Pages.AddingFilters;
import com.Pages.ClickingShop;
import com.Pages.HomeToFurnitureAcc;
import com.Pages.PopUpKeepGoing;
import com.Pages.ProductSelection;
import com.Pages.ShippingDetails;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BuyFurnitureAsGuestUser {

	public WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	/*************
	 * Code open American girl site in the chrome browser
	 *************************/
	public void openBrowser() throws Exception {
		driver = StartBrowser.launchBrowser();
		driver.get("https://www.americangirl.com");
		Thread.sleep(6000);
		report = ReportGeneration.getInstance();
		test = report.startTest("openig browser");
	}

	/**********
	 * Step1: clicking on shop icon of the home page
	 ****************************/
	@Test(priority = 0)
	public void shopTabClick() {
		ClickingShop shop = PageFactory.initElements(driver, ClickingShop.class);
		shop.clickingShop();
		test.log(LogStatus.INFO, "clicking on shop tab");
	}

	/********** 
	 * Step2: Clicking pop up as keep going
	 * @throws Exception 
	 ********************************/
	@Test(priority = 1)
	public void keepGoingPopUp() throws Exception {
		PopUpKeepGoing keepG = PageFactory.initElements(driver, PopUpKeepGoing.class);
		keepG.shopPopUp();
		test.log(LogStatus.INFO, "clicking on pop up1");
	}
			
	/********** 
	 * Step3: Clicking Furniture and accessories
	 ********************************/
	@Test(priority = 2)
	public void clickFurnitureAcc() throws Exception{
		HomeToFurnitureAcc furniture = PageFactory.initElements(driver, HomeToFurnitureAcc.class);
		furniture.clickingFurnitureAcc();
		test.log(LogStatus.INFO, "clicking on furnitures tab");
	}
	/********** 
	 * Step4: Selecting character and price filter
	 * @throws Exception 
	 ********************************/
	@Test(priority = 3)
	public void selectingFilters() throws Exception {
		AddingFilters filter = PageFactory.initElements(driver, AddingFilters.class);
		filter.char1Filter();
		filter.char2Filter();
		filter.priceFilter();
		test.log(LogStatus.INFO, "selecting filters");
	}
	/********** 
	 * Step5: Selecting product from the list 
	 ********************************/
	@Test(priority = 4)
	public void selectingProduct() throws Exception {
		ProductSelection prod = PageFactory.initElements(driver, ProductSelection.class);
		prod.selectProduct();
		
	}
	
	/********** 
	 * Step6: Adding to cart and checkout 
	 ********************************/
	@Test(priority = 5)
	public void addingToBag() throws Exception {
		AddToBag bag = PageFactory.initElements(driver,AddToBag.class);
		bag.addingToBag();
		bag.addingToShoppingBag();
		bag.checkOutNow();
		bag.checkOutGuest();
		bag.birthDate();//Adding birth detail to check outgrown doing the task
			}	
	
	/********** 
	 * Step7: entering shipping details. 
	 ********************************/
	@Test(priority = 6)
	public void shippingAddress() throws Exception {
		ShippingDetails details = PageFactory.initElements(driver,ShippingDetails.class);
		details.addDetails();
		
			}	
	
	@AfterClass
	public void closure()
	{
		driver.close();
		report.endTest(test);
		report.flush();
	}
	
	
}