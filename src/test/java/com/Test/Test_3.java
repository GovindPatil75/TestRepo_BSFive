package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 extends Test_4BaseClass{
	@Test
	public void verify_FB_login() {	
		SoftAssert soft=new SoftAssert();
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Email));
		
		Email.sendKeys("Selenium@gmail.com");
		WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("12345678");
		WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
		loginbtn.click(); //---->Homepage
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // globally 8 ---> 2 second skip
		//validation---->
		System.out.println("Test login Before Assert");
		
		//Assert.assertEquals("A", "A"); // Pass
		//Assert.assertEquals(false, true); // fail
		soft.assertEquals(false, true); //  fail 
		
		System.out.println("Test login After Assert");		
		soft.assertAll();
	}
	@Test 
	public void verifytest() {
		System.out.println("Test 2");
	}
}
