package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExerciseLogout {
	
	WebDriver driver;
	MasterPageFactory mpf;
	@Test (groups= {"smoke"})
	public void getLogout() {
		//Login
		WebDriverManager.chromedriver().setup();
		//Open the  browser & maximize it
		driver = new ChromeDriver();//Upcasting
		driver.manage().window().maximize();
		
		//Go to a URL
		//driver.get("https://www.automationexercise.com/");
		driver.navigate().to(BaseConfig.getConfigValue("PROD_URL"));
		
		mpf = new MasterPageFactory(driver);
		//Highlight the Login button in the homepage
		Highlighter.addColor(driver, mpf.getSigninbtn_homepage());
		//Click on the Login button in the homepage
		mpf.getSigninbtn_homepage().click();
		
		//Highlight the Email field
		Highlighter.addColor(driver, mpf.getEmail());
		//enter the email in the Email field
		mpf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
		
		//Highlight the Password field
		Highlighter.addColor(driver, mpf.getPassword());
		//enter the password in the Password field
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
		
		//Highlight the Login button in the Login  page
		Highlighter.addColor(driver, mpf.getLoginbtn());
		//Click on Login button
		mpf.getLoginbtn().click();
		
		//Logout
		mpf.getLogoutbtn().click();
		
		//Validation
		Assert.assertTrue(mpf.getLoginbtn().isDisplayed(), "Logout successful!");
		if(mpf.getLoginbtn().isDisplayed()) {
			System.out.println("Logout is successful!");
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
