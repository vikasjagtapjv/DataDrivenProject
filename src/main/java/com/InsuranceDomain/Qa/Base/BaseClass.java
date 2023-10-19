package com.InsuranceDomain.Qa.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utility.ReadConfig;

public class BaseClass {
	ReadConfig readConfig=new ReadConfig();
	public  String url=readConfig.getApplicationUrl();
	public String UserName=readConfig.getUserName();
	public String Password=readConfig.getPassword();
	public static WebDriver driver;
@BeforeClass	
public void setup() {
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.get(url);
}
@AfterClass
public void tearDown()
{
	driver.close();
	driver.quit();
}
}
