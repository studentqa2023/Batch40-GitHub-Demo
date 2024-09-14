package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	MasterPageFactory mpf;
public void getLogin() {
		
		WebDriverManager.chromedriver().setup();
		//Open the  browser & maximize it
		WebDriver driver = new ChromeDriver();//Upcasting
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
		
		//Verify login successfully in the console
		if(mpf.getLogoutbtn().isDisplayed()) {
			System.out.println("Login successful!");
		}else {
			System.out.println("Login failed");
			}
		
		//Take a screenshot
		Screenshot.getScreenShot(driver, "Homepage_after_login");
		
		//close the browser
		//driver.close();//Close the current tab
		driver.quit();//Close the browser 
	}

}
