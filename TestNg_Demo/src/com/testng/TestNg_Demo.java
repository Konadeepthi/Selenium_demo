package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Demo {
	
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	@Test
	public void titleTest() {
		String title=driver.getTitle();
		System.out.println("title of the page is"+title);
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
	

}
