package com.InsuranceDomain.Qa.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LeavePom {
	WebDriver ldriver;
	public LeavePom(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
//	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")private WebElement leave ;
//	
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	@FindBy(xpath="")private WebElement ;
//
//	

}
