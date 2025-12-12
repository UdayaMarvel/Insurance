package com.tataaig;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsurance {
	 public static WebDriver driver;

//	Launch the application "https://www.tataaig.com/"
//	Enter the Vehicle number
//	Click on Get Quote
//	Enter the mobile number
//	Click on See price
//	Validate the plans and Bike value
	
	 @Before
	 public void beforeMethod() {
			System.out.println("Before Method");
		}

	 @After
	 public void afterMethod() {
			System.out.println("After Method");
	 }
	 
	 
	 @BeforeClass
	public static void method1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Insurance\\src\\test\\resources\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.tataaig.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterClass
	public static void method() {
		driver.quit();
	}
	
	@Test
	public void method2() {
		WebElement vehicleNumber =  driver.findElement(By.xpath("//input[@name='regNumber']"));
		vehicleNumber.sendKeys("TN22CJ4593");
	}
	
	@Test
	public void method3() {
		WebElement getQuote = driver.findElement(By.xpath("//button[text()='Get Price']"));
		getQuote.click();
		WebElement wheelerQuote = driver.findElement(By.xpath("//button[text()='Yes, Go To Two Wheeler Quote']"));
		wheelerQuote.click();
	}
	
	@Test
	public void method4() {
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='contactDetail.mobile']"));
		mobileNumber.sendKeys("8428820616");
	}
	
	@Test
	public void method5() {
		WebElement seePrice = driver.findElement(By.xpath("//button[text()='See Price']"));
		seePrice.click();
	}
	
	public void validatePlansAndBikeValue() {
		
	}
}
