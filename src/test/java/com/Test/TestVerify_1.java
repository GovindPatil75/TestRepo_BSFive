package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PagesPom.LoginPom;
import com.Utility.BaseClass;

public class TestVerify_1 extends BaseClass{
	
	@Test
	public void Verify_Test_Tc_001() {
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
		login.getUsername().sendKeys("Selenium");
		login.getPassword().sendKeys("12345678");
			
	}

}
