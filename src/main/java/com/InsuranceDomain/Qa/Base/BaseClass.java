package com.InsuranceDomain.Qa.Base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
public void setup() {
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Properties pro=new Properties();
	pro.getProperty("weburl");
}
}
