package com.InsuranceDomain.Qa.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPom {
	WebDriver ldriver;
	public PIMPom(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	// -----SEARCH EMPLOYEE WITH AVAILABLE INFORMATION -------//
	@FindBy(xpath="//div[contains(text(),'Virat')]")
	private WebElement firstName;
	
	@FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--focus']")private WebElement employeeNm ;
	
	@FindBy(xpath="(//div[@role='listbox']//span)[1]")private WebElement employeeHint ;

	@FindBy(xpath="//div[text()='0249']")private WebElement getempId ;

	@FindBy(xpath="(//div//input[@class='oxd-input oxd-input--active'])[2]")private WebElement id ;

	@FindBy(xpath="(//button[@type='submit'])")private WebElement button_Save;

	
	//---------ADD EMPLOYEE----------------------//

	@FindBy(xpath="//li//a[text()='Add Employee']")private WebElement addEmp ;

	@FindBy(xpath="//input[@name='firstName']")private WebElement firstNm ;

	@FindBy(xpath="//input[@name='middleName']")private WebElement mddleNm;

	@FindBy(xpath="//input[@name='lastName']")private WebElement lastNm ;

	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")private WebElement e_Id ;

	@FindBy(xpath="//button[text()=' Save ']")private WebElement Click_save ;
	
	//-----------REPORTS------------------------//

	@FindBy(xpath="//li//a[text()='Reports']")private WebElement  Reports;

	@FindBy(xpath="//div[text()='PIM Sample Report']")private WebElement getReportNm;

	@FindBy(xpath="//input[@placeholder='Type for hints...']")private WebElement report_Nm ;
	 
	@FindBy(xpath="//div//div[@role='option']//span")private WebElement hint_name;
	
	@FindBy(xpath="//button[text()=' Search ']")private WebElement search;
	
	@FindBy(xpath="//button[@type='button']//i[@class='oxd-icon bi-file-text-fill']")private WebElement select_report_file ;
//	@FindBy(xpath="")private WebElement ;
//	@FindBy(xpath="")private WebElement ;
	


}
