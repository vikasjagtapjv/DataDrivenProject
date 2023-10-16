package com.InsuranceDomain.Qa.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InsuranceDomain.Qa.Base.BaseClass;

public class LoginPage  {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//p[text()='Username : Admin']")
	private WebElement username;
	@FindBy(xpath="//input[@name='username']")
	private WebElement Name;
	@FindBy(xpath="//p[text()='Password : admin123']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='password']")
	 private WebElement Pass;
	@FindBy(xpath="//button[text()=' Login ']")
	 private WebElement button;
	
	@FindBy(xpath="//p[text()='Forgot Your Password? ']")
	private WebElement forgetPass;
	
	public String getUserName()
	{
		return username.getText();
	}
	public String getPass()
	{
		return password.getText();
	}
	public void setUserN(String name)
	{
		Name.sendKeys(name);
	}
	public void setPass(String password)
	{
		Pass.sendKeys(password);
	}
	public void click()
	{
		button.click();
	}
}
