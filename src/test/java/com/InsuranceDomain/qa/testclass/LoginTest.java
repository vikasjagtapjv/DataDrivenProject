package com.InsuranceDomain.qa.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InsuranceDomain.Qa.Base.BaseClass;
import com.InsuranceDomain.Qa.POM.LoginPage;


public class LoginTest extends BaseClass {
	
	@Test
	public void loginTest()
	{   //driver.get(url);
		LoginPage lp=new LoginPage(driver);
		//AdminPom ap=new AdminPom(driver);
		lp.setUserN(UserName);
		lp.setPass(Password);
		lp.click();
		String actualTitle=driver.getTitle();
		String expectedTitle="OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitle);
//		ap.clickOnAdmin();
//		ap.setUserNm(ap.getUserName());
//		ap.clickOnUserRole();
//		ap.click_On_Admin();
//		ap.setEmployeeName(ap.getEmployeeName());
//		ap.setStatus();
//		ap.click_On_Enabled();
//		ap.clickOnSearch();
	}

}
