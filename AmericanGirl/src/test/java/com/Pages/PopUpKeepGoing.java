package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PopUpKeepGoing {
	
	/**********Handling KeepGoing pop up and sign-in after clicking on shop tab****************/

	@FindBy(id = "ageGateConfirm")
	@CacheLookup

	WebElement shopClick;
	
		// closing signup pop up
		@FindBy(css="button.close")
		@CacheLookup
		WebElement popUpSignUp;

	public void shopPopUp() throws Exception {
		shopClick.click();
		Thread.sleep(5000);
		popUpSignUp.click();
	}
}
