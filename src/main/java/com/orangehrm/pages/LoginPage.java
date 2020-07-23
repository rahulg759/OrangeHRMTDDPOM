package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By id = By.id("txtUsername");
	By password = By.id("txtPassword");
	By loginBtn = By.id("btnLogin");
	By logo = By.xpath("//*[@id=\"divLogo\"]/img");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public boolean validateLogo() {
		if (driver.findElement(logo).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void login() {
		driver.findElement(id).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginBtn).click();
	}
}
