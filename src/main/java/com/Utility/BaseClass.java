package com.Utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
		System.out.println("Browser Open");
	}

	@AfterMethod
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
}
