package com.InsuranceDomain.Qa.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InsuranceDomain.Qa.Base.BaseClass;

public class LoginPage extends BaseClass {
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Username : Admin']")
	WebElement username;
	@FindBy(xpath="//p[text()='Password : admin123']")
	WebElement password;
	@FindBy(xpath="//input[@name='username']")
	WebElement Name;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Pass;
	@FindBy(xpath="//button[text()=' Login ']")
	 private WebElement button;
	
	@FindBy(xpath="//p[text()='Forgot Your Password? ']")
	private WebElement forgetPass;
}
