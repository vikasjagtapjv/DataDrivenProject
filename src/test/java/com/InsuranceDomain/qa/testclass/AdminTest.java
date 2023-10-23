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
	public void adminTest() throws InterruptedException
	{
		//driver.get(url);
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserN(UserName);
		lp.setPass(Password);
		lp.click();
		//Thread.sleep(5000);
		
		AdminPom ap=new AdminPom(driver);
		ap.clickOnAdmin();
		ap.setUserNm("Virat");
		ap.clickOnUserRole();
		ap.usersRoles();
		ap.enterEmployeeName("Virat");
		ap.setStatus();
		ap.clickUsersStatus();
		ap.clickOnSearch();
		//add user
		ap.clickOnAddUsers();
		ap.userRole();
		ap.usersAddRoles();
		ap.clickOnStatus();
		ap.addUsersStatus();
		ap.addEmployeeName("Kohli");
		ap.enterUserName("Ronaldo");
		ap.enterPassword("admin1234");
		ap.enterConfirmPassword("admin1234");
		ap.clickOnSaveButton();
		
		}

}
