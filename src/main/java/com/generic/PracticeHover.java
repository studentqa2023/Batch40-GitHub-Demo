package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeHover {
	
	public  void getHover() {
		
		WebDriverManager.chromedriver().setup();
		//Open the  browser & maximize it
		WebDriver driver = new ChromeDriver();//Upcasting
		driver.manage().window().maximize();
		
		//Go to a URL
		driver.navigate().to("https://www.costco.com/");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//Create an object of the Actions class
		Actions ac = new Actions(driver);
		
		ac.moveToElement(mpf.getServices()).perform();
		
	}
	
	public static void main(String[] args) {
		PracticeHover obj = new PracticeHover();
		
		obj.getHover();
	}

}
