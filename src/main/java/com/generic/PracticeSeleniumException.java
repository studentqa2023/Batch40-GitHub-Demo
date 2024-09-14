package com.generic;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagefactory.MasterPageFactory;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
public class PracticeSeleniumException {
	//WebDriverWait wait;
	public void getSalary() {
		
		WebDriverManager.chromedriver().setup();
		//Open the  browser & maximize it
		WebDriver driver = new ChromeDriver();//Upcasting
		driver.manage().window().maximize();
		
		//Go to a URL
		driver.navigate().to("https://www.costco.com/");
		
		//Hover  over Services
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait or WebDriver Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getServices()));
		
		
		//Create an object of the Actions class
		Actions ac = new Actions(driver);
		
		ac.moveToElement(mpf.getServices()).perform();
		
		//Click on "Bottles Water Delivery" option/link
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getBottledWaterDelivery_business()));
		mpf.getBottledWaterDelivery_business().click();
		
	}
	
	public static void main(String[] args) {
		PracticeSeleniumException obj = new PracticeSeleniumException();
		obj.getSalary();
	}

}
