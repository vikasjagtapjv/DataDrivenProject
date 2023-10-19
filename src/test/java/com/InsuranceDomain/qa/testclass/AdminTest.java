package com.InsuranceDomain.qa.testclass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.InsuranceDomain.Qa.Base.BaseClass;
import com.InsuranceDomain.Qa.POM.AdminPom;
import com.InsuranceDomain.Qa.POM.LoginPage;

public class AdminTest extends BaseClass {
	
	
	@Test
	public void adminTest()
	{
		driver.get(url);
		LoginPage lp=new LoginPage(driver);
		AdminPom ap=new AdminPom(driver);
		lp.setUserN(UserName);
		lp.setPass(Password);
		lp.click();
		
		ap.clickOnAdmin();
		ap.setUserNm(ap.getUserName());
		ap.clickOnUserRole();
		ap.click_On_Admin();
		ap.setEmployeeName(ap.getEmployeeName());
		ap.setStatus();
		ap.click_On_Enabled();
		ap.clickOnSearch();
		}

}
