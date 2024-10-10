package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-lock']")
	private WebElement signinbtn_homepage;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	private WebElement email;
	
	@FindBy (xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[contains(text(), 'Logout')]")
	private  WebElement logoutbtn;
	
	@FindBy(xpath="//*[@id='Home_Ancillary_6']")
	private WebElement services;
	
	@FindBy(xpath="(//*[text()='Bottled Water Delivery'])[2]")
	private WebElement bottledWaterDelivery_business;
	
	@FindBy(xpath="//*[@id='oldSelectMenu']")
	private WebElement dropdown3;
	
	@FindBy(xpath="//button[@id='confirmBox']")
	private WebElement alertBtn2;
	
	
	
	
	public WebElement getBottledWaterDelivery_business() {
		return bottledWaterDelivery_business;
	}

	public WebElement getAlertBtn2() {
		return alertBtn2;
	}

	public WebElement getServices() {
		return services;
	}


	public WebElement getDropdown3() {
		return dropdown3;
	}


	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getSigninbtn_homepage() {
		return signinbtn_homepage;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	

}
