package com.InsuranceDomain.qa.testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.InsuranceDomain.Qa.Base.BaseClass;
import com.InsuranceDomain.Qa.POM.LoginPage;

import Utility.ExcelUtility;


public class LoginTest extends BaseClass {
	
	@Test(dataProvider="loginData")
	public void loginTest(String username,String password)
	{   //driver.get(url);
		LoginPage lp=new LoginPage(driver);
		//AdminPom ap=new AdminPom(driver);
		lp.setUserN(username);
		lp.setPass(password);
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
	@DataProvider(name="loginData")
	public Object[][] getData() throws IOException
	{
		String path="C:\\Users\\vikas\\Downloads\\LoginData.xlsx";
		ExcelUtility eUtil=new ExcelUtility(path);
		int totalRows=eUtil.getRowCount("Sheet1");
		int totalcols=eUtil.getCellCount("Sheet1",1);
		
		Object data[][]=new Object[totalRows][totalcols];
		
		for (int i=1;i<=totalRows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				data[i-1][j]=eUtil.getCellData("Sheet1", i, j);
			}
		}
		return data;
				
				
	}
			

}
