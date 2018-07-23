package com.FirstProject.AmericanGirl;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.FirstProject.AmericanGirl.Log1;

public class StartBrowser {
	
	public static WebDriver driver;
		
	public static WebDriver launchBrowser()
	{
		
	File file = new File("C:\\Users\\ArvindKumar\\eclipse-workspace\\POM\\resources\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	Log1.debug("driver is ready to execute");
	
	return driver;
	}
}
