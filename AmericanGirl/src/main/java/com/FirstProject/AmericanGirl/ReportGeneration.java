package com.FirstProject.AmericanGirl;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReportGeneration {
	
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static ExtentReports getInstance()
	{
	String path = "C:\\Users\\ArvindKumar\\eclipse-workspace\\AmericanGirl\\Reports\\AmericanGirlReport.html";
	report = new ExtentReports(path, false);
	report.addSystemInfo("seleium version", "3.11").addSystemInfo("platform", "windows");
	
	return report;
	
	}
}
