package com.PagesPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPom {
	
	WebDriver driver;
	// encapsulation ---> 
	//declare variable private
	//public getter and setter
	
	private WebElement Username;
	private WebElement Password;
	
	public LoginPom(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	
}
