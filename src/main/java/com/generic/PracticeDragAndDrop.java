package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDragAndDrop {
	
	public void getDragDrop() {
		
		WebDriverManager.chromedriver().setup();
		//Open the  browser & maximize it
		WebDriver driver = new ChromeDriver();//Upcasting
		driver.manage().window().maximize();
		
		//Go to a URL
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement columnA = driver.findElement(By.xpath("//*[@id='column-a']"));
		WebElement columnB = driver.findElement(By.xpath("//*[@id='column-b']"));
		
		//Create an object of the Actions class
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(columnA, columnB).perform();
		
	}
	
	public static void main(String[] args) {
		PracticeDragAndDrop obj = new PracticeDragAndDrop();
		obj.getDragDrop();
	}

}
