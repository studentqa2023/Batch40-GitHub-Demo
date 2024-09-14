package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropDown {
	
	public void getDropdown() {
		
		WebDriverManager.chromedriver().setup();
		//Open the  browser & maximize it
		WebDriver driver = new ChromeDriver();//Upcasting
		driver.manage().window().maximize();
		
		//Go to a URL
		driver.navigate().to("https://demoqa.com/select-menu");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//For the "Old Style Select Menu" dropdown, select the option "White"
		Select sc = new Select(mpf.getDropdown3());
		
		//Select by visible text
		sc.selectByVisibleText("White");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Select "Yellow" by  index
		sc.selectByIndex(3);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Select "Blue" by value
		sc.selectByValue("1");
		
	}
	
	public static void main(String[] args) {
		PracticeDropDown obj = new PracticeDropDown();
		obj.getDropdown();
	}

}
