package com.InsuranceDomain.Qa.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InsuranceDomain.Qa.Base.BaseClass;

public class AdminPom {
	WebDriver ldriver;
	public AdminPom(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//click on admin
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
	private WebElement admin;
	
	//_______________________________________________________________-
	
	
	//------------------------SEARCH USER------------------------
	
	@FindBy(xpath="//div[contains(text(),'Aaliyah.Haq')]")
	 private WebElement  searchUserName;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	 private WebElement  enterUserName;
	
	@FindBy(xpath="(//div[contains(text(),'ESS')])[1]")
	 private WebElement textEss;
	@FindBy(xpath="(//div[contains(text(),'-- Select --')])[1]")
	 private WebElement  searchUserRoll;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input'][normalize-space()='Admin']")
	 private WebElement selectAdmin;
	@FindBy(xpath="//div[@class='oxd-select-text-input'][normalize-space()='ESS']")
	 private WebElement selectEss;
	
	@FindBy(xpath="//div[contains(text(),'Aaliyah Haq')]")
	 private WebElement eName ;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	 private WebElement EmployeeName;
	
	@FindBy(xpath="(//div[@role='cell'])[5]")
	 private WebElement sEnabled ;
	@FindBy(xpath="//div[contains(text(),'-- Select --')]")
	 private WebElement selectStatus ;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input'][normalize-space()='Enabled']")
	 private WebElement selectEnabled ;
	@FindBy(xpath="//div[@class='oxd-select-text-input'][normalize-space()='Disabled']")
	 private WebElement selectDisabled ;
	
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	 private WebElement  search;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-pencil-fill']")
	private WebElement editUser;
	
	@FindBy(className="oxd-button oxd-button--medium oxd-button--ghost")
	 private WebElement  reset;
	
	
	//__________---------Add User---------------
	
	//click on add user
		@FindBy(xpath="//button[ text()=' Add ']")
		 private WebElement add;
	//user role
		@FindBy(xpath="(//div[contains(@class,'oxd-select-text')]//div[text()='-- Select --'])[1]")
		 private WebElement UserRole;
		//select adminOption
		@FindBy(xpath="//div[contains(text(),'Admin')]")
		private WebElement adminOption;
		//select ess
		@FindBy(xpath="//div[contains(text(),'ESS')]")
		 private WebElement ess ;
		//enter status
		@FindBy(xpath="(//div[contains(@class,'oxd-select-text')]//div[text()='-- Select --'])[2]")
		 private WebElement status ;
		//select enabled
		@FindBy(xpath="//div[contains(@class,'oxd-select-text')]//div[text()='Enabled']")
		 private WebElement enabled ;
		//select disabled
		@FindBy(xpath="//div[contains(@class,'oxd-select-text')]//div[text()='Disabled']")
		 private WebElement disabled ;
		//enter eName
			@FindBy(xpath="//input[@placeholder='Type for hints...']")
			 private WebElement employeeName ;
			//select userName
			@FindBy(xpath="//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
			 private WebElement userName ;
		//enter password
		@FindBy(xpath="(//input[@type='password'])[1]")
		 private WebElement  Password;
		//confirm password
		
		@FindBy(xpath="(//input[@type='password'])[2]")
		 private WebElement confirmPassword ;
		@FindBy(xpath="//button[normalize-space()='Save']")
		 private WebElement clickOnSave;
		
		
		//edit User-------------------
		
		
		//Action method for search user-----
		public void clickOnAdmin ()
		{
			admin.click();
		}
		
		
		public String getUserName() {
		return searchUserName.getText();
		}
		
		public void setUserNm(String sUName) {
			enterUserName.sendKeys(sUName);
			
		}
		
		
//		public String getUserRole()
//		{
//			return textEss.getText();
//		}
		public void clickOnUserRole()
		{
			searchUserRoll.click();	
		}
		public void click_On_Admin() {
			
			selectAdmin.click();
		}
		public void click_On_Ess() {
			selectEss.click();
		}
		
		public String getEmployeeName()
		{
			return eName.getText();
		}
		public void setEmployeeName(String EName)
		{
			EmployeeName.sendKeys(EName);
		}
		
//		public String getStatus()
//		{
//			return sEnabled.getText();
//		}
		public void setStatus()
		{
			selectStatus.click();
		}
		
		public void click_On_Enabled()
		{
			selectEnabled.click();
		}
		public void click_On_Disabled()
		{
			selectDisabled.click();
		}
		public void clickOnSearch()
		{
			search.click();
		}
		public void clickOnEdit()
		{
			editUser.click();
		}
		public void reset() {
			reset.click();
			
		}
	//Action method for add user
	
	
	public void clickOnAddUsers() {
		add.click();
	}
	public void userRole()
	{
		UserRole.click();
	}
	public String getAdmin()
	{
		return adminOption.getText();
	}
	public String getEss()
	{
		return ess.getText();
	}
	public void clickOnStatus()
	{
		status.click();

	}
	public String getEnabled()
	{
		return enabled.getText();
	}
	public String getdisbled()
	{
		return disabled.getText();
	}
	public void enterEmployeeNameHint(String hintName)
	{
		employeeName.sendKeys(hintName);
	}
	public void enterUserName(String UserN) {
		userName.sendKeys(UserN);
	}
	public void enterPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void enterConfirmPassword(String confirmPass)
	{
		confirmPassword.sendKeys(confirmPass);
	}
	public void clickOnSaveButton()
	{
		clickOnSave.click();
	}
	
}