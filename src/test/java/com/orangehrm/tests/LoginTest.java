package com.orangehrm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;

public class LoginTest {

	@Test
	public void verifyLogo() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LoginPage loginPage=new LoginPage(driver);
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		boolean logo=loginPage.validateLogo();
		
		Assert.assertTrue(logo);
	
	}
	
	@Test
	public void verifyLogin() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LoginPage loginPage=new LoginPage(driver);
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		loginPage.login();
		
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		Assert.assertEquals(actualURL, expectedURL);
		
	}
}
