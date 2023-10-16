package com.InsuranceDomain.qa.testclass;

import org.testng.annotations.Test;

import com.InsuranceDomain.Qa.Base.BaseClass;
import com.InsuranceDomain.Qa.POM.LoginPage;


public class LoginTest extends BaseClass {
	
	
	
	@Test
	public void loginTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserN("Admin");
		lp.setPass("admin123");
	}

}
