package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {
	
	public void getLogin() {
		
		WebDriverManager.chromedriver().setup();
		//Open the  browser & maximize it
		WebDriver driver = new ChromeDriver();//Upcasting
		driver.manage().window().maximize();
		
		//Go to a URL
		//driver.get("https://www.automationexercise.com/");
		driver.navigate().to("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		//enter the email in the Email field
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("rezwanislam857@gmail.com");
		
		//enter the password in the Password field
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Boston2023");
		
		//Click on Login button
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		//Verify login successfully in the console
		if(driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).isDisplayed()) {
			System.out.println("Login successful!");
		}else {
			System.out.println("Login failed");
			}
		
		//close the browser
		//driver.close();//Close the current tab
		driver.quit();//Close the browser 
	}

}
