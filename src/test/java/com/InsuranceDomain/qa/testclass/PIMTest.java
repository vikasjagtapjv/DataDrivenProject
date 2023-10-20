package com.InsuranceDomain.qa.testclass;

import org.testng.annotations.Test;

import com.InsuranceDomain.Qa.Base.BaseClass;
import com.InsuranceDomain.Qa.POM.PIMPom;

public class PIMTest extends BaseClass {
	@Test
	public void pimTest()
	{
		PIMPom pp=new PIMPom(driver);
		
		// -----SEARCH EMPLOYEE WITH AVAILABLE INFORMATION -------//
		pp.click_OnPim();
		pp.setEmployeeNm(pp.getEmployeeNm());
		pp.clickOnEmp();
		pp.setEmpID(pp.getEmpID());
		pp.clickOn_Save();
		
		//--ADD EMPLOYEE----------------------//
		pp.click_On_addEmp();
		pp.setEmployeefn("scott");
		pp.setEmployeeMN("edword");
		pp.setEmployeeLN("decort");
		pp.setEmployeeID("0698");
		pp.clickOnSave();
		
		//---REPORTS--------------
		pp.enterOnReport();
		pp.setReportName(pp.getReportName());
		pp.enterOnHint();
		pp.click_On_Search();
		pp.clickON_Report();
		
		}

}
